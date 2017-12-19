package com.pizza.entity;

import java.sql.Date;

import org.springframework.stereotype.Component;
@Component
public class SeatStatus {
	private  long statusId;
	private int availableSeats;
	private Date dateOfBooking;
	public SeatStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SeatStatus(long statusId, int availableSeats, Date dateOfBooking) {
		super();
		this.statusId = statusId;
		this.availableSeats = availableSeats;
		this.dateOfBooking = dateOfBooking;
	}
	public long getStatusId() {
		return statusId;
	}
	public void setStatusId(long statusId) {
		this.statusId = statusId;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Date getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	@Override
	public String toString() {
		return "SeatStatus [statusId=" + statusId + ", availableSeats=" + availableSeats + ", dateOfBooking=" + dateOfBooking + "]";
	}
	
	
	

}
