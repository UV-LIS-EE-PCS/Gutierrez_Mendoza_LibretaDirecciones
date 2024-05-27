import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddressEntryTest {

    @Test
    void testDefaultConstructor() {
        AddressEntry entry = new AddressEntry();
        assertNull(entry.getName());
        assertNull(entry.getLastName());
        assertNull(entry.getStreet());
        assertNull(entry.getCity());
        assertNull(entry.getState());
        assertEquals(0, entry.getPostalCode());
        assertNull(entry.getEmail());
        assertNull(entry.getPhone());
    }

    @Test
    void testParameterizedConstructor() {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "john.doe@example.com", "555-1234");
        assertEquals("John", entry.getName());
        assertEquals("Doe", entry.getLastName());
        assertEquals("123 Main St", entry.getStreet());
        assertEquals("Anytown", entry.getCity());
        assertEquals("CA", entry.getState());
        assertEquals(12345, entry.getPostalCode());
        assertEquals("john.doe@example.com", entry.getEmail());
        assertEquals("555-1234", entry.getPhone());
    }

    @Test
    void testSettersAndGetters() {
        AddressEntry entry = new AddressEntry();
        entry.setName("Jane");
        entry.setLastName("Doe");
        entry.setStreet("456 Oak St");
        entry.setCity("Othertown");
        entry.setState("NY");
        entry.setPostalCode(67890);
        entry.setEmail("jane.doe@example.com");
        entry.setPhone("555-5678");

        assertEquals("Jane", entry.getName());
        assertEquals("Doe", entry.getLastName());
        assertEquals("456 Oak St", entry.getStreet());
        assertEquals("Othertown", entry.getCity());
        assertEquals("NY", entry.getState());
        assertEquals(67890, entry.getPostalCode());
        assertEquals("jane.doe@example.com", entry.getEmail());
        assertEquals("555-5678", entry.getPhone());
    }

    @Test
    void testToString() {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "john.doe@example.com", "555-1234");
        String expected = "Nombre: John\n" +
                          "Apellido: Doe\n" +
                          "Calle: 123 Main St\n" +
                          "Ciudad: Anytown\n" +
                          "Estado: CA\n" +
                          "Código postal: 12345\n" +
                          "Email: john.doe@example.com\n" +
                          "Teléfono: 555-1234";
        assertEquals(expected, entry.toString());
    }
}
