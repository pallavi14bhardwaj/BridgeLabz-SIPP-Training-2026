package oppsPracticeProblem.JavaClassAndObject.level2.ModelMovieTicketBookingSystem;
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double amount) {
        movieName = name;
        seatNumber = seat;
        price = amount;
    }

    void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}