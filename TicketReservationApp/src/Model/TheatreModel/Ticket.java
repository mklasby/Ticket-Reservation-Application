package Model.TheatreModel;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import org.json.JSONObject;

public class Ticket extends JSONObject{
	private Movie movie;
	private Theatre theatre;
	private ShowTime showTime;
	private Seat seat;
	private int ticketID;
	private double price;
	
	
	
	//private User owner;                            //user and ticket should be 2 way association
	
	//do we need this even?
	public Ticket(ResultSet allTickets) throws SQLException {
		// oh jeez i remember doing this now, I need to bascially do an sql query
		// where we left join a bunch of tables, but basically have enough columns
		// to create the movie theatre show time and seats!! 
			movie = new Movie(allTickets);
			theatre = new Theatre(allTickets);
			showTime = new ShowTime(allTickets);
			seat = new Seat(allTickets);
			ticketID = allTickets.getInt("TicketID");
			setPrice(allTickets.getDouble("Price"));	
	}
	
	
	public Ticket(Movie selectedMovie) {                   //from state ticket state transition
		this.setMovie(selectedMovie);
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public ShowTime getShowTime() {
		return showTime;
	}
	public void setShowTime(ShowTime showTime) {
		this.showTime = showTime;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	/*
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	*/


	public int getTicketID() {
		return ticketID;
	}


	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
}
