import java.util.Scanner;

/**
 * Class representing a menu for managing an address book.
 * Provides options to load, add, delete, search, and display contacts.
 * @author Julio Gutiérrez Mendoza
 */
public class Menu {

    private Scanner in;

    /**
     * Default constructor for Menu.
     * Initializes a new Scanner for user input.
     */
    public Menu() {
        this.in = new Scanner(System.in);
    }

    /**
     * Constructor for Menu with a specified Scanner.
     * Useful for unit testing with a predefined input stream.
     *
     * @param in the Scanner to use for user input.
     */
    public Menu(Scanner in) {
        this.in = in;
    }

    /**
     * Displays the menu options to the user.
     */
    public void displayMenu() {
        System.out.println("====================================");
        System.out.println("Hola! Elige una opción del menú:");
        System.out.println("a) Cargar del archivo");
        System.out.println("b) Agregar");
        System.out.println("c) Eliminar");
        System.out.println("d) Buscar");
        System.out.println("e) Mostrar");
        System.out.println("f) Salir");
        System.out.println("====================================");
    }

    /**
     * Prompts the user to add a new address entry.
     * Handles user input and adds the new entry to the address book.
     */
    public void add() {
        try {
            AddressEntry newEntry = requestContactData();
            AddressBook addressBook = AddressBook.getInstance();
            addressBook.addAddressEntry(newEntry);
        } catch (Exception ex) {
            System.out.println("Error al agregar el contacto");
            add();
        }
    }

    /**
     * Requests contact data from the user.
     * Prompts the user for each field of the address entry.
     *
     * @return the newly created AddressEntry with user-provided data.
     * @throws Exception if any of the fields are left empty.
     */
    private AddressEntry requestContactData() throws Exception {
        System.out.println("Nombre:");
        String name = in.nextLine();
        System.out.println("Apellido:");
        String lastName = in.nextLine();
        System.out.println("Calle:");
        String street = in.nextLine();
        System.out.println("Ciudad:");
        String city = in.nextLine();
        System.out.println("Estado:");
        String state = in.nextLine();
        System.out.println("CP:");
        int postalCode = in.nextInt();
        in.nextLine(); // Consumir la nueva línea
        System.out.println("Email:");
        String email = in.nextLine();
        System.out.println("Telefono:");
        String phone = in.nextLine();

        if (name.isEmpty() || lastName.isEmpty() || street.isEmpty() || city.isEmpty() || state.isEmpty()
                || email.isEmpty() || phone.isEmpty()) {
            throw new Exception("Todos los campos deben ser completados.");
        }

        return new AddressEntry(name, lastName, street, city, state, postalCode, email, phone);
    }

    /**
     * Placeholder method for deleting an address entry.
     * Not yet implemented.
     */
    public void deleteAddressEntry() {
        // TODO: Implement or delete this method
    }
}
