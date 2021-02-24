package model;

public class Comment {
	private User ticketBuyer;
	private Manifestation manifestation;
	private String comment;
	private int commentGrade;
	
	
	public Comment() {
		super();
		
	}
	
	


	public Comment(User ticketBuyer, Manifestation manifestation, String comment, int commentGrade) {
		super();
		this.ticketBuyer = ticketBuyer;
		this.manifestation = manifestation;
		this.comment = comment;
		this.commentGrade = commentGrade;
	}




	public User getTicketBuyer() {
		return ticketBuyer;
	}


	public void setTicketBuyer(User ticketBuyer) {
		this.ticketBuyer = ticketBuyer;
	}


	public Manifestation getManifestation() {
		return manifestation;
	}


	public void setManifestation(Manifestation manifestation) {
		this.manifestation = manifestation;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public int getCommentGrade() {
		return commentGrade;
	}


	public void setCommentGrade(int commentGrade) {
		this.commentGrade = commentGrade;
	}
	
	

}
