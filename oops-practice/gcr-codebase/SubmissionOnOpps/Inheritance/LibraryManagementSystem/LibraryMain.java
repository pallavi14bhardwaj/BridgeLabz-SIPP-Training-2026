package oppsPracticeProblem.Inheritance.LibraryManagementSystem;

public class LibraryMain {
    public static void display(){
        Book b = new Book("Dopamine","2004");
        Author a = new Author("Pankaj Sharma","male",b);



        Book b2 = new Book("Narration of idiots","2008");
        Author a2 = new Author("Laksh Tyagi","male",b2);


        System.out.println(a.toString());
        System.out.println("-----------------------------------------------------------------");
        System.out.println(a2.toString());
    }
    public static void main(String[] args) {
        display();

    }

}