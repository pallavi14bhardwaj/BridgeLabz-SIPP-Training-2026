package addressbook;

public class AddressBookApp {
    public static void main(String[] args) {
        // creating the address book instance
        AddressBook book = new AddressBook();
        
        // adding some contacts
        book.addContact("Alice", "111-222-3333", "alice@test.com");
        book.addContact("Charlie", "444-555-6666", "charlie@test.com");
        book.addContact("Bob", "777-888-9999", "bob@test.com");
        
        // trying duplicate phone
        book.addContact("Dave", "111-222-3333", "dave@test.com"); 

        book.displaySorted();
        
        // testing search and delete
        book.searchContact("Bob");
        book.deleteContact("Alice");
        
        book.displaySorted();
    }
}
