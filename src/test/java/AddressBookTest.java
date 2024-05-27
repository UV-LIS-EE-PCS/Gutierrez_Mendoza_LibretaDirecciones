import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

class AddressBookTest {

    private AddressBook addressBook;

    @BeforeEach
    void setUp() {
        AddressBook.resetInstance(); // Reinicia la instancia antes de cada prueba
        addressBook = AddressBook.getInstance();
    }

    @Test
    void testAddAddressEntry() throws Exception {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "john.doe@example.com", "555-1234");
        addressBook.addAddressEntry(entry);
        
        assertEquals(1, addressBook.findAddressEntry("Doe", false).size());
    }

    @Test
    void testDeleteAddressEntry() throws Exception {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "john.doe@example.com", "555-1234");
        addressBook.addAddressEntry(entry);
        
        addressBook.deleteAddressEntry("Doe");
        
        assertEquals(0, addressBook.findAddressEntry("Doe", false).size());
    }

    @Test
    void testFindAddressEntryStrict() throws Exception {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "john.doe@example.com", "555-1234");
        addressBook.addAddressEntry(entry);
        
        ArrayList<AddressEntry> results = addressBook.findAddressEntry("Doe", true);
        
        assertEquals(1, results.size());
        assertEquals("Doe", results.get(0).getLastName());
    }

    @Test
    void testFindAddressEntryNonStrict() throws Exception {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "john.doe@example.com", "555-1234");
        addressBook.addAddressEntry(entry);
        
        ArrayList<AddressEntry> results = addressBook.findAddressEntry("do", false);
        
        assertEquals(1, results.size());
        assertEquals("Doe", results.get(0).getLastName());
    }

    @Test
    void testLastNameExistInContactsList() throws Exception {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "john.doe@example.com", "555-1234");
        addressBook.addAddressEntry(entry);
        
        assertDoesNotThrow(() -> addressBook.lastNameExistInContactsList("Doe"));
    }

    @Test
    void testLastNameDoesNotExistInContactsList() {
        assertThrows(Exception.class, () -> addressBook.lastNameExistInContactsList("Smith"));
    }

    @Test
    void testShowContactsList() {
        AddressEntry entry1 = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "john.doe@example.com", "555-1234");
        AddressEntry entry2 = new AddressEntry("Jane", "Smith", "456 Oak St", "Othertown", "NY", 67890, "jane.smith@example.com", "555-5678");
        addressBook.addAddressEntry(entry1);
        addressBook.addAddressEntry(entry2);

        // Redireccionar la salida estándar para capturar la salida del método
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        addressBook.showContactsList();

        String expectedOutput = "1. Nombre: John\n" +
                                "Apellido: Doe\n" +
                                "Calle: 123 Main St\n" +
                                "Ciudad: Anytown\n" +
                                "Estado: CA\n" +
                                "Código postal: 12345\n" +
                                "Email: john.doe@example.com\n" +
                                "Teléfono: 555-1234\n\n" +
                                "2. Nombre: Jane\n" +
                                "Apellido: Smith\n" +
                                "Calle: 456 Oak St\n" +
                                "Ciudad: Othertown\n" +
                                "Estado: NY\n" +
                                "Código postal: 67890\n" +
                                "Email: jane.smith@example.com\n" +
                                "Teléfono: 555-5678\n\n";

        assertEquals(expectedOutput, outContent.toString());

        // Restaurar la salida estándar
        System.setOut(System.out);
    }
}
