package model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CustomersTest {
    private Customers c1;

    @Before
    public void initialize(){
        c1 = new Customers("Un client");
        Movie RogueOne = new Movie("Rogue One", Movie.NEW_RELEASE);
        Movie ReineDesNeiges = new Movie("Reine des neiges", Movie.CHILDREN);
        Movie starWars = new Movie ("Star Wars III", Movie.REGULAR);

        // Louer les films pour le client
        Rental rRogue = new Rental(RogueOne, 5);
        Rental rReine = new Rental(ReineDesNeiges, 7);
        Rental rStarWars = new Rental(starWars, 4);

        c1.addRental(rRogue);
        c1.addRental(rReine);
        c1.addRental(rStarWars);

    }

    @Test
    public void testStatement() {
        String expect = "Rental Record for Un client\n" +
        "	Rogue One	15.0 \n"+
        "	Reine des neiges	7.5 \n"+
        "	Star Wars III	5.0 \n"+
        "Amount owned is 27.5\n" +
        "You earned 4 frequent renter points";

        assertEquals(expect, c1.statement());
    }
}
