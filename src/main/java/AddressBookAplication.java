public class AddressBookAplication {
    private AddressBook addressBook;
    private Menu menu;


    public class AddressBookApplication {
        public static void main(String[] args) {
            Menu menu = new Menu();
            Scanner in = new Scanner(System.in);
            AddressBook addressBook = AddressBook.getInstance();

            do{

                menu.displayMenu();
                char option = in.next().toLowerCase().charAt(0);
                switch (option) {
                    case 'a':// cargar archivo
                        System.out.println("Ingresa el nombre del archivo:");
                        String filename = in.nextLine();
                        addressBook.readFromATextFile(filename);
                        break;

                }

        }while (true);

    }
}

