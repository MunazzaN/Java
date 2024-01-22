import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    public movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    public static void main(String[] args) {
        List<movie> movies = new ArrayList<>();
        movies.add(new movie(2000, 8.5, 50.0, 120.0));
        movies.add(new movie(1995, 7.8, 30.0, 80.0));
        movies.add(new movie(2010, 9.0, 80.0, 200.0));

        // Sorting by rating and profit
        Collections.sort(movies, Comparator.comparingDouble(movie::getRating).reversed()
                .thenComparingDouble(movie -> movie.getCollectionAmount() - movie.getBudget()));

        System.out.println("Sorted by Rating and Profit:");
        displayMovies(movies);

        // Sorting by year released and rating
        Collections.sort(movies, Comparator.comparingInt(movie::getYearReleased)
                .thenComparingDouble(movie::getRating));

        System.out.println("\nSorted by Year Released and Rating:");
        displayMovies(movies);
    }

    private static void displayMovies(List<movie> movies) {
        for (movie movie : movies) {
            System.out.println("Year: " + movie.getYearReleased() +
                    ", Rating: " + movie.getRating() +
                    ", Budget: $" + movie.getBudget() +
                    ", Collection: $" + movie.getCollectionAmount());
        }
    }
}

