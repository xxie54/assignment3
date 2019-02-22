

import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {

        Contact one = new Contact("A", "A", "A", "A");
        Contact two = new Contact("Bob", "Bob", "A", "A");

        Scanner scan = new Scanner(System.in);

        AddressBook book = new AddressBook();
        book.addNewContact(one);
        book.addNewContact(two);

        System.out.println("give me name? ");


        String name = scan.nextLine();
        System.out.println("Last name?");
        String lname = scan.nextLine();

        book.addNewContact(new Contact(name, lname, "123", "123"));

        book.displayAllContacts();
//       System.out.println("Who are you change name for  give me (first name) ");
//       String firstname = scan.nextLine();
//
//       int i = book.getIndexByName(firstname);
//        System.out.println("I found " + firstname +   " at " + i);
//
//        System.out.println("What do you want to change their name into?");
//        String newName = scan.nextLine();
//
//        book.updateName(i, newName);
    }
}
