package com.brownfield.pss.client;

import java.util.List;

public class UIData {
	
	private int baggageWeight;
	private String bookingid;
	private Long checkinid;
	private List<Flight> flights;
	private Passenger passenger;
	private SearchQuery searchQuery;

	private Flight selectedFlight;

	public int getBaggageWeight() {
		return baggageWeight;
	}

	public String getBookingid() {
		return bookingid;
	}

	public Long getCheckinid() {
		return checkinid;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public SearchQuery getSearchQuery() {
		return searchQuery;
	}

	public Flight getSelectedFlight() {
		return selectedFlight;
	}

	public void setBaggageWeight(int baggageWeight) {
		this.baggageWeight = baggageWeight;
	}

	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}

	public void setCheckinid(Long checkinid) {
		this.checkinid = checkinid;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public void setSearchQuery(SearchQuery searchQuery) {
		this.searchQuery = searchQuery;
	}

	public void setSelectedFlight(Flight selectedFlight) {
		this.selectedFlight = selectedFlight;
	}
}