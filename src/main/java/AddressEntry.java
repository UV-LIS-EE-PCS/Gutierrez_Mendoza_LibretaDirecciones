/**
 * This class represents an address entry. It stores information about a person's name, address, contact details, etc.
 *
 *  @author Julio Gutiérrez Mendoza
 */

/**
 * Class representing an entry in an address book.
 * Contains personal information such as name, address, email, and phone number.
 */
public class AddressEntry {
    private String name, lastName, street, city, state;
    private int postalCode;
    private String email, phone;

    /**
     * Default constructor for AddressEntry.
     * Initializes an empty address entry.
     */
    public AddressEntry() {
    }

    /**
     * Constructor for AddressEntry with all fields initialized.
     *
     * @param name the first name of the contact.
     * @param lastName the last name of the contact.
     * @param street the street address of the contact.
     * @param city the city of the contact.
     * @param state the state of the contact.
     * @param postalCode the postal code of the contact.
     * @param email the email address of the contact.
     * @param phone the phone number of the contact.
     */
    public AddressEntry(String name, String lastName, String street, String city, String state, int postalCode, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.email = email;
        this.phone = phone;
    }

    /**
     * Gets the first name of the contact.
     *
     * @return the first name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the first name of the contact.
     *
     * @param name the new first name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the last name of the contact.
     *
     * @return the last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the contact.
     *
     * @param lastName the new last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the street address of the contact.
     *
     * @return the street address.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street address of the contact.
     *
     * @param street the new street address.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the city of the contact.
     *
     * @return the city.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the contact.
     *
     * @param city the new city.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the state of the contact.
     *
     * @return the state.
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state of the contact.
     *
     * @param state the new state.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the postal code of the contact.
     *
     * @return the postal code.
     */
    public int getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code of the contact.
     *
     * @param postalCode the new postal code.
     */
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets the email address of the contact.
     *
     * @return the email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the contact.
     *
     * @param email the new email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the phone number of the contact.
     *
     * @return the phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number of the contact.
     *
     * @param phone the new phone number.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns a string representation of the address entry.
     *
     * @return a formatted string containing all contact details.
     */
    @Override
    public String toString() {
        return "Nombre: " + name + '\n' +
                "Apellido: " + lastName + '\n' +
                "Calle: " + street + '\n' +
                "Ciudad: " + city + '\n' +
                "Estado: " + state + '\n' +
                "Código postal: " + postalCode  +'\n' +
                "Email: " + email + '\n' +
                "Teléfono: " + phone;
    }
}
