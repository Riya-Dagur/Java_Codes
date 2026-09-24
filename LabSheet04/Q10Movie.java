package LabSheet04;

public class Q10Movie {
    String name;
    String genre;
    double rating;
    static String industry = "Bollywood";

    void display() {
        String movieName = name;
        String movieGenre = genre;
        double movieRating = rating;

        System.out.println("Name: " + movieName);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Rating: " + movieRating);
        System.out.println("Industry: " + industry);
    }

    public static void main(String[] args) {
        String n = "3 Idiots";
        String g = "Drama";
        double r = 8.4;

        Q10Movie m = new Q10Movie();
        m.name = n;
        m.genre = g;
        m.rating = r;

        m.display();
    }
}
