package model;

import java.util.*;

public class Customers {
	private String _name;
	private Set<Rental> _rentals = new LinkedHashSet<>();

	public Customers(String name) {
		_name = name;
	}

	public void addRental(Rental rental) {
		_rentals.add(rental);
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		String result = "Rental Record for " + getName() + "\n";

		for(Rental r : _rentals){
			result += "\t" + r.getMovie().getTitle()
					+ "\t" + String.valueOf((r.getAmount())) + " \n";
		}

		result += "Amount owned is " + String.valueOf(getTotalAmount()) +
				"\n";
		result += "You earned " + String.valueOf(getRenterPoints()) +
				" frequent renter points";
		return result;
	}

	double getTotalAmount(){
		double res = 0;
		for(Rental rental : _rentals){
			res += rental.getAmount();
		}
		return res;
	}

	int getRenterPoints(){
		int res = 0;
		for(Rental rental : _rentals){
			res += rental.getRenterPoints();
		}
		return res;
	}

}
