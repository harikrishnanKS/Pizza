package com.pizza.entity;

import java.sql.Time;
import java.sql.Date;

import org.springframework.stereotype.Component;
@Component
public class Reservation {
	private long reservationId;
	private long customerId;
	private int numberOfSeats;
	private Date date;
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(long reservationId, long customerId, int numberOfSeats, Date date, Time time) {
		super();
		this.reservationId = reservationId;
		this.customerId = customerId;
		this.numberOfSeats = numberOfSeats;
		this.date = date;
		
	}
	public long getReservationId() {
		return reservationId;
	}
	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", customerId=" + customerId + ", numberOfSeats="
				+ numberOfSeats + ", date=" + date + "]";
	}
	
	

}
