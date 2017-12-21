package com.pizza.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pizza.dao.ReservationDaoImpl;
import com.pizza.entity.Customer;
import com.pizza.entity.Reservation;
@Controller
public class ReservationController {
	@Autowired
	private ReservationDaoImpl reservationDao;
	
	@Autowired
	private ModelAndView mdlView;
	@Autowired
	private Reservation reservation;
	@RequestMapping(value="/reserve",method=RequestMethod.GET)
	public ModelAndView initReserve()
	
	{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date today = Calendar.getInstance().getTime();        
		String reportDate = df.format(today);
		
		mdlView.addObject("currentDate",reportDate);
		mdlView.addObject("ReservationCommand",reservation);
		mdlView.setViewName("reserve");
		return mdlView;
		
	}
	@RequestMapping(value="/reserve",method=RequestMethod.POST)
	public ModelAndView reserveFormSubmit(@ModelAttribute("reserved")Reservation obj, HttpSession session)
	{
	System.out.println("in post of reserve");
	Customer customer=(Customer) session.getAttribute("customer");
	 
	long id=customer.getCustomerId();
	System.out.println(id);
	 
	Reservation reservedDetails=reservationDao.addReservation(obj, id);
	if(reservedDetails==null)
	{
		int balanceSeat=reservationDao.getBalanceSeat();
	mdlView.addObject("errorReservation","availableseats"+balanceSeat);
	mdlView.setViewName("reserve");
	}
	else
	{
	mdlView.addObject("test","Booked Succesfully");
	mdlView.setViewName("welcome");
	}
	 
	return mdlView;
	 
	}
	
	@ModelAttribute("numberOfSeats")
	
	public int [] seatsAvailable()
	{
	 
	int[] seats=reservationDao.findavailableSeats();
	 
	return seats;
	 
	 
	}
	@RequestMapping(value="/viewReserved",method=RequestMethod.GET)
	public ModelAndView initViewReserved(HttpSession session)
	{
	 
	Customer customerDetails=(Customer) session.getAttribute("customer");
	long customerId=customerDetails.getCustomerId();
	System.out.println(customerId);
	 
	List<Reservation> reservationList=reservationDao.findReservation(customerId);

	mdlView.addObject("customerReservation",reservationList);
	System.out.println("List is"+reservationList);
	mdlView.setViewName("viewReserved");
	return mdlView;
	 
	}
	@RequestMapping("/login1")
	public ModelAndView back()
	{
		mdlView.setViewName("welcome");
		return mdlView;
	}

}
