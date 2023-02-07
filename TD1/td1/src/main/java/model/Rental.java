package model;

public class Rental {
    private PriceCode _price;
    private Movie _movie;
    private int _daysRented;
    
    public Rental(Movie movie, int daysRented)
    {
	_movie=movie;
	_daysRented=daysRented;
    _price = movie.getPriceCode().clone();
    }
    public int getDaysRented()
    {
	return _daysRented; 
    }
    public Movie getMovie()
    {
	return _movie;
    }

    public double getAmount() {
        return _price.getAmount(getDaysRented());
    }

    public int getRenterPoints() {
        return _price.getRenterPoints(getDaysRented());
    }
}
