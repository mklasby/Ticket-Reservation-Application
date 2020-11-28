package TheatreModel;

import java.util.ArrayList;

public class Movie {
	private String movieName;
	private double moviePrice;
	private boolean earlyAccess;             //what is the point in a movie object having this
	private ArrayList<Theatre> theatreList;
	
	public Movie(String movieName, double moviePrice, boolean earlyAccess) {
		setMovieName(movieName);
		setMoviePrice(moviePrice);
		setTheatreList(new ArrayList<Theatre>());
	}

	private void setMoviePrice(double moviePrice) {
		this.moviePrice = moviePrice;
	}
	
	public double getMoviePrice() {
		return moviePrice;
	}

	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public boolean isEarlyAccess() {
		return earlyAccess;
	}

	public void setEarlyAccess(boolean earlyAccess) {
		this.earlyAccess = earlyAccess;
	}

	public ArrayList<Theatre> getTheatreList() {
		return theatreList;
	}

	private void setTheatreList(ArrayList<Theatre> theatreList) {
		this.theatreList = theatreList;
	}

}
