package model;

import java.util.Date;

public class Ticket {
	private String ticketID;
	private Manifestation manifestation;
	private Date startDate;
	private double price;
	private TicketStatus ticketStatus;
	private TicketType ticketType;
	private User buyer;
	
	
	public Ticket() {
		super();
	}

	

	public Ticket(String ticketID, Manifestation manifestation, Date startDate, double price, TicketStatus ticketStatus,
			TicketType ticketType, User buyer) {
		super();
		this.ticketID = ticketID;
		this.manifestation = manifestation;
		this.startDate = startDate;
		this.price = price;
		this.ticketStatus = ticketStatus;
		this.ticketType = ticketType;
		this.buyer = buyer;
	}



	public String getTicketID() {
		return ticketID;
	}


	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}


	public Manifestation getManifestation() {
		return manifestation;
	}


	public void setManifestation(Manifestation manifestation) {
		this.manifestation = manifestation;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public TicketStatus getTicketStatus() {
		return ticketStatus;
	}


	public void setTicketStatus(TicketStatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}


	public TicketType getTicketType() {
		return ticketType;
	}


	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}


	public User getBuyer() {
		return buyer;
	}


	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}
	
	
	

}
