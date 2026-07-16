package addressbook;

public class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // implementing compareTo to sort by name
    @Override
    public int compareTo(Contact other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}
