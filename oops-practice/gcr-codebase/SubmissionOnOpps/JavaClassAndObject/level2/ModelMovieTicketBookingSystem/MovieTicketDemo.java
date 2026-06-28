package oppsPracticeProblem.JavaClassAndObject.level2.ModelMovieTicketBookingSystem;

public class MovieTicketDemo {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.bookTicket("Avengers", 15, 250);

        ticket.displayDetails();
    }
}