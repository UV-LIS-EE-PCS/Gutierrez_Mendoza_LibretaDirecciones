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
}
