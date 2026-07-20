package addressbook;

import java.util.*;

public class AddressBook {
    // ordered storage
    private List<Contact> contactsList = new ArrayList<>();
    // fast name lookup
    private Map<String, Contact> contactsMap = new HashMap<>();
    // prevent duplicate phone numbers
    private Set<String> phoneSet = new HashSet<>();

    public void addContact(String name, String phone, String email) {
        // check for duplicate phone numbers first
        if (phoneSet.contains(phone)) {
            System.out.println("Phone number " + phone + " already exists!");
            return;
        }

        Contact contact = new Contact(name, phone, email);
        contactsList.add(contact);
        contactsMap.put(name.toLowerCase(), contact);
        phoneSet.add(phone);
        System.out.println(name + " added successfully.");
    }

    public void searchContact(String name) {
        Contact contact = contactsMap.get(name.toLowerCase());
        if (contact != null) {
            System.out.println("Found: " + contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String name) {
        Contact contact = contactsMap.get(name.toLowerCase());
        if (contact != null) {
            contactsList.remove(contact);
            contactsMap.remove(name.toLowerCase());
            phoneSet.remove(contact.phone);
            System.out.println(name + " deleted successfully.");
        } else {
            System.out.println("Contact not found to delete.");
        }
    }

    public void displaySorted() {
        // sorting using Collections.sort()
        Collections.sort(contactsList);
        System.out.println("\n--- Address Book (Sorted) ---");
        for (Contact contact : contactsList) {
            System.out.println(contact);
        }
        System.out.println("-----------------------------\n");
    }
}
