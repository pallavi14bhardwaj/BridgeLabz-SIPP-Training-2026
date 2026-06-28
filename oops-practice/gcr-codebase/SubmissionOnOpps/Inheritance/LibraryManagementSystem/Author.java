package oppsPracticeProblem.Inheritance.LibraryManagementSystem;

public class Author {
    public String Name;
    public String Bio;
    Book book;



    public Author(String name, String bio, Book book ){
        this.Name=name;
        this.Bio=bio;
        this.book=book;




    }

    @Override
    public String toString() {
        return "Author{" +
                "Name='" + Name + '\'' +
                ", Bio='" + Bio + '\'' +
                ", book=" + book +
                '}';
    }
}