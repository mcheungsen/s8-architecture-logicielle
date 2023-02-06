package model;

public class Main {
    public static void main(String[] args) {
        // Le client
        Customers client = new Customers("Un client");
        
        // Création des films
        Movie RogueOne = new Movie("Rogue One", Movie.NEW_RELEASE);
        Movie ReineDesNeiges = new Movie("Reine des neiges", Movie.CHILDREN);
        Movie starWars = new Movie ("Star Wars III", Movie.REGULAR);

        // Louer les films pour le client
        Rental rRogue = new Rental(RogueOne, 5);
        Rental rReine = new Rental(ReineDesNeiges, 7);
        Rental rStarWars = new Rental(starWars, 4);

        client.addRental(rRogue);
        client.addRental(rReine);
        client.addRental(rStarWars);
        

        // Affichage
        System.out.println(client.statement());
    }
}
