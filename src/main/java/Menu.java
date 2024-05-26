import java.util.Scanner;

public class Menu {
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
        in.nextLine();
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

    public void deleteAddressEntry() {
        // TODO: Implement or delete this method
    }
}