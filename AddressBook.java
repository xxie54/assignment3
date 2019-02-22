
import java.util.ArrayList;


public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();


    public AddressBook() {
    }


    public void addNewContact(Contact cont) {
        contacts.add(cont);
    }

    public int getIndexByName(String first_name) {

       for (int i=0; i<contacts.size(); i++) {
            if (contacts.get(i).getFirst_name().equals(first_name)) {
                return i;
            }
        }

       return -1;
    }

    public void updateName(int index, String newName){
        this.contacts.get(index).setFirst_name(newName);
    }

    public void displayAllContacts() {

        for (int i = 0; i < contacts.size(); i ++) {

            Contact contact = contacts.get(i);

            System.out.println(" Name: " + contact.getFirst_name());
            System.out.println(" Last name: " + contact.getLast_name());
            System.out.println(" Phone #: " + contact.getPhone_no());
            System.out.println(" Address: " + contact.getAddress());
            System.out.println("-------------");
        }
    }

}
