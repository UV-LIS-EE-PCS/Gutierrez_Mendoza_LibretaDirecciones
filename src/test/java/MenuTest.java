import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MenuTest {

    private Scanner scannerMock;
    private Menu menu;

    @BeforeEach
    void setUp() {
        scannerMock = Mockito.mock(Scanner.class);
        menu = new Menu(scannerMock);
    }

    @Test
    void testAdd() {
        // Configurar el mock para simular la entrada del usuario
        when(scannerMock.nextLine()).thenReturn("John")
                                     .thenReturn("Doe")
                                     .thenReturn("123 Main St")
                                     .thenReturn("Anytown")
                                     .thenReturn("CA")
                                     .thenReturn("john.doe@example.com")
                                     .thenReturn("555-1234");
        when(scannerMock.nextInt()).thenReturn(12345);
        doNothing().when(scannerMock).nextLine(); // Consumir la nueva línea después de nextInt

        AddressBook addressBook = AddressBook.getInstance();
        AddressBook.resetInstance(); // Resetear la instancia para pruebas

        menu.add();

        try {
            assertEquals(1, addressBook.findAddressEntry("Doe", false).size());
        } catch (Exception e) {
            fail("No se esperaba excepción: " + e.getMessage());
        }
    }

    @Test
    void testDisplayMenu() {
        // Redirigir la salida estándar para capturar la salida del método
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        menu.displayMenu();

        String expectedOutput = "====================================\n" +
                                "Hola! Elige una opción del menú:\n" +
                                "a) Cargar del archivo\n" +
                                "b) Agregar\n" +
                                "c) Eliminar\n" +
                                "d) Buscar\n" +
                                "e) Mostrar\n" +
                                "f) Salir\n" +
                                "====================================\n";

        assertEquals(expectedOutput, outContent.toString());

        // Restaurar la salida estándar
        System.setOut(System.out);
    }
}
