import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
/**
 * This class represents an address book application that allows users to manage contacts.
 * It provides methods for adding, deleting, finding, sorting, and displaying contacts.
 *
 * @author Julio Gutiérrez Mendoza
 */

/**
 * Singleton class representing an Address Book.
 * Provides methods to manage address entries including adding, deleting, finding, and displaying contacts.
 */
public class AddressBook {
    private static AddressBook instance = null;
    private ArrayList<AddressEntry> entriesList;

    /**
     * Private constructor to prevent instantiation from outside the class.
     * Initializes the list of address entries.
     */
    private AddressBook() {
        this.entriesList = new ArrayList<>();
    }

    /**
     * Returns the single instance of AddressBook, creating it if necessary.
     *
     * @return the singleton instance of AddressBook.
     */
    public static AddressBook getInstance() {
        if (instance == null) {
            instance = new AddressBook();
        }
        return instance;
    }

    /**
     * Resets the singleton instance. Useful for testing purposes.
     */
    public static void resetInstance() {
        instance = null;
    }

    /**
     * Displays the list of contacts sorted by last name.
     * Prints "La lista esta vacia:(" if the list is empty.
     */
    public void showContactsList() {
        if (entriesList.isEmpty()) System.out.println("La lista esta vacia:(");
        else {
            Comparator<AddressEntry> byLastName = Comparator.comparing(AddressEntry::getLastName);
            entriesList.sort(byLastName);
            for (AddressEntry entry : entriesList) {
                System.out.println((entriesList.indexOf(entry) + 1) + ". " + entry.toString() + "\n");
            }
        }
    }

    /**
     * Finds and returns address entries that match the given last name.
     * If strict is true, throws an exception if no matching last name is found.
     *
     * @param lastName the last name to search for.
     * @param strict if true, enforces strict matching of the last name.
     * @return a list of matching address entries.
     * @throws Exception if the list is empty or if strict matching is enabled and no matches are found.
     */
    public ArrayList<AddressEntry> findAddressEntry(String lastName, boolean strict) throws Exception {
        if (strict) lastNameExistInContactsList(lastName);
        ArrayList<AddressEntry> matchingContacts = new ArrayList<>();
        if (entriesList.isEmpty()) {
            throw new Exception("La lista esta vacia:(");
        } else {
            for (AddressEntry entry : entriesList) {
                if (entry.getLastName().toLowerCase().contains(lastName.toLowerCase())) {
                    matchingContacts.add(entry);
                }
            }
        }
        return matchingContacts;
    }

    /**
     * Checks if the given last name exists in the contacts list.
     *
     * @param lastName the last name to check for.
     * @throws Exception if the last name is not found in the contacts list.
     */
    public void lastNameExistInContactsList(String lastName) throws Exception {
        if (entriesList.stream().noneMatch(entry -> entry.getLastName().equalsIgnoreCase(lastName))) {
            throw new Exception("El apellido no existe en la lista de contactos");
        }
    }

    /**
     * Adds a new address entry to the contacts list.
     *
     * @param addressEntry the address entry to add.
     */
    public void addAddressEntry(AddressEntry addressEntry) {
        entriesList.add(addressEntry);
    }

    /**
     * Deletes address entries that match the given last name from the contacts list.
     *
     * @param lastName the last name of the entries to delete.
     */
    public void deleteAddressEntry(String lastName) {
        entriesList.removeIf(entry -> entry.getLastName().equalsIgnoreCase(lastName));
    }

    /**
     * Reads address entries from a text file and adds them to the contacts list.
     *
     * @param filename the name of the file to read from.
     */
    public void readFromATextFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String[] contactData = new String[8];
            int index = 0;
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\n");
                contactData[index] = parts[0];
                index++;
            }
            AddressEntry entry = new AddressEntry(contactData[0], contactData[1], contactData[2], contactData[3], contactData[4], Integer.parseInt(contactData[5]), contactData[6], contactData[7]);
            addAddressEntry(entry);
            System.out.println("Entries loaded from file.");
        } catch (IOException e) {
            System.err.println("Error loading from file: " + e.getMessage());
        }
    }

    /**
     * Displays the list of contacts found in the search.
     *
     * @param contacts the list of contacts to display.
     */
    public void showContactsFound(ArrayList<AddressEntry> contacts) {
        if (contacts.size() == 1) {
            System.out.println("El siguiente contacto fue encontrado:");
            System.out.println(contacts.toString());
        } else {
            System.out.println("Los siguientes " + contacts.size() + " contactos fueron encontrados");
            for (AddressEntry entry: contacts) {
                System.out.println((entriesList.indexOf(entry) + 1) + ". " + entry.toString());
            }
        }
    }
}
