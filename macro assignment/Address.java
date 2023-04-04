//Create a class called AddressBook that stores a collection of contacts in a HashMap. The class should have methods to add, edit, and delete contacts, as well as to search for a contact by name.
import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    private Map<String, Contact> contacts;

    public AddressBook() {
        contacts = new HashMap<String, Contact>();
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact newContact = new Contact(name, phoneNumber, email);
        contacts.put(name, newContact);
    }

    public boolean editContact(String name, String phoneNumber, String email) {
        Contact existingContact = contacts.get(name);
        if (existingContact != null) {
            existingContact.setPhoneNumber(phoneNumber);
            existingContact.setEmail(email);
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteContact(String name) {
        return contacts.remove(name) != null;
    }

    public Contact searchByName(String name) {
        return contacts.get(name);
    }

    private class Contact {
        private String name;
        private String phoneNumber;
        private String email;

        public Contact(String name, String phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
