
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<AddressEntry> entries;

    public AddressBook() {
        entries = new ArrayList<>();
    }

    public void addAddress(AddressEntry entry) {
        entries.add(entry);
    }

    public void removeAddress(AddressEntry entry) {
        entries.remove(entry);
    }

    public List<AddressEntry> findEntriesByLastName(String lastName) {
        List<AddressEntry> results = new ArrayList<>();
        for (AddressEntry entry : entries) {
            if (entry.getLastName().equalsIgnoreCase(lastName)) {
                results.add(entry);
            }
        }
        return results;
    }

    public void printAllEntries() {
        for (AddressEntry entry : entries) {
            System.out.println(entry);
        }
    }
}
