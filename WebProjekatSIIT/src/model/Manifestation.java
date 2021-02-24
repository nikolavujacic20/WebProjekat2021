package model;

import java.awt.image.BufferedImage;
import java.sql.Date;

public class Manifestation {
	private String name;
	private ManifestationType manifestationType;
	private int guestNumber;
	private Date startDate;
	private double ticketPrice;
	private boolean active;
	private Location location;
	private BufferedImage image;
	
	
	public Manifestation() {
		
		super();
	}

	

	public Manifestation(String name, ManifestationType manifestationType, int guestNumber, Date startDate,
			double ticketPrice, boolean active, Location location, BufferedImage image) {
		super();
		this.name = name;
		this.manifestationType = manifestationType;
		this.guestNumber = guestNumber;
		this.startDate = startDate;
		this.ticketPrice = ticketPrice;
		this.active = active;
		this.location = location;
		this.image = image;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ManifestationType getManifestationType() {
		return manifestationType;
	}


	public void setManifestationType(ManifestationType manifestationType) {
		this.manifestationType = manifestationType;
	}


	public int getGuestNumber() {
		return guestNumber;
	}


	public void setGuestNumber(int guestNumber) {
		this.guestNumber = guestNumber;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public double getTicketPrice() {
		return ticketPrice;
	}


	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public BufferedImage getImage() {
		return image;
	}


	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	
	

}
