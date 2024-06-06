import java.util.ArrayList;
import java.util.Scanner;
/**
 * Main class for the Address Book application.
 * Provides a menu-driven interface for managing address book entries.
 * @author Julio Gutiérrez Mendoza
 */ 
public class AddressBookAplication {

    public class AddressBookApplication {

        public static void main(String[] args) {
            Menu menu = new Menu();
            try (Scanner in = new Scanner(System.in)) {
                AddressBook addressBook = AddressBook.getInstance();

                do {
                    menu.displayMenu();
                    char option = in.next().toLowerCase().charAt(0);
                    switch (option) {
                        case 'a': // Load from file
                            in.nextLine();
                            System.out.println("Ingresa el nombre del archivo:");
                            String filename = in.nextLine();
                            addressBook.readFromATextFile(filename);
                            break;
                        case 'b': // Add entry
                            menu.add();
                            break;
                        case 'c': // Delete entry
                            in.nextLine();
                            System.out.println("Ingresa el apellido completo del contacto a eliminar");
                            String lastname = in.nextLine();
                            ArrayList<AddressEntry> contactsToDelete;
                            try {
                                contactsToDelete = addressBook.findAddressEntry(lastname, true);
                            } catch (Exception ex) {
                                System.out.println(ex.getMessage());
                                break;
                            }
                            addressBook.showContactsFound(contactsToDelete);
                            System.out.println("Ingresa 'y' para eliminar o 'n' para regresar al menú");
                            char choice = in.next().charAt(0);
                            if (choice == 'y') {
                                addressBook.deleteAddressEntry(lastname);
                            } else if (choice != 'n') {
                                System.out.println("Opción incorrecta");
                            }
                            break;
                        case 'd': // Search entry
                            in.nextLine();
                            System.out.println("Ingrese apellido completo o primeras letras:");
                            String startOfLastName = in.nextLine();
                            ArrayList<AddressEntry> contactsFound;
                            try {
                                contactsFound = addressBook.findAddressEntry(startOfLastName, false);
                            } catch (Exception ex) {
                                System.out.println(ex.getMessage());
                                break;
                            }
                            addressBook.showContactsFound(contactsFound);
                            break;
                        case 'e': // Show contacts list
                            addressBook.showContactsList();
                            break;
                        case 'f': // Exit
                            return;
                        default:
                            System.out.println("Opción errónea, intenta de nuevo");
                    }

                } while (true);
            }
        }
    }
}

