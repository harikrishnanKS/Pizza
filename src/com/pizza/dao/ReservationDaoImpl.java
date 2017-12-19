package com.pizza.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pizza.entity.NewPizza;
import com.pizza.entity.Reservation;
import com.pizza.entity.SeatStatus;
import com.pizza.ifaces.GenericDao;
@Repository
public class ReservationDaoImpl implements GenericDao<Reservation> {
	@Autowired
	private HibernateTemplate template;
	private int balanceSeat;
	
	public int[] findavailableSeats()
	{
	List<NewPizza> availSeats=(List<NewPizza>) template.find("from NewPizza");
	 
	int eachAvailSeat=0;
	for(NewPizza eachPizzaObject:availSeats)
	{
	eachAvailSeat=eachPizzaObject.getAvailableSeats();
	 
	}
	int[] seatList=new int[eachAvailSeat];
	for(int i=0;i<eachAvailSeat;i++){
	seatList[i]=i+1;
	}
	return seatList;
	 
	 
	}
	public Reservation addReservation(Reservation reservation, long customerId)
	{
	List<NewPizza> availSeats=(List<NewPizza>)template.find("from NewPizza");
	int eachTotalSeat=0;
	for(NewPizza eachPizzaObject: availSeats)
	{
	eachTotalSeat=eachPizzaObject.getAvailableSeats();
	}
	int availableSeat=reservation.getNumberOfSeats();
	Date dateOfReservation=reservation.getDate();
	SeatStatus status=new SeatStatus();
	long reservationKey=0;
	List<SeatStatus> availSeatsEachDay=(List<SeatStatus>)template.find("from SeatStatus where dateOfBooking='"+dateOfReservation+"'");
	Reservation newReservation=null;
	if(availSeatsEachDay.size()==0)
	{
	int updatedSeatList=eachTotalSeat-availableSeat;
	balanceSeat=updatedSeatList;
	
	status.setAvailableSeats(updatedSeatList);
	status.setDateOfBooking(dateOfReservation);
	reservation.setCustomerId(customerId);
	reservationKey=(Long)template.save(reservation);
	long statusKey=(Long)template.save(status);
	if(reservationKey>0)
	{
	newReservation=reservation;
	}
	}
	else
	{
	int availSeat=0;
	long statusId=0;
	for(SeatStatus seatObject:availSeatsEachDay)
	{
	availSeat=seatObject.getAvailableSeats();
	dateOfReservation=seatObject.getDateOfBooking();
	statusId=seatObject.getStatusId();
	}
	int updatedSeat=availSeat-availableSeat;
	if(updatedSeat>=0)
	{
		balanceSeat=updatedSeat;
		reservation.setCustomerId(customerId);
	status.setAvailableSeats(updatedSeat);
	status.setDateOfBooking(dateOfReservation);
	status.setStatusId(statusId);
	reservationKey=(Long) template.save(reservation);
	if(reservationKey>0)
	{
	newReservation=reservation;
	}
	template.saveOrUpdate(status);
	}
	}
	return newReservation;
	}
	@Override
	public Reservation add(Reservation t) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long update(Reservation t) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long delete(Reservation t) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Reservation findById(long key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getBalanceSeat()
	{
		return balanceSeat;
	}


	
	
	
	
	
	

}
