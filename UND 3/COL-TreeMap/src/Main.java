public class Main {
    public static void main(String[] args) {
        ItemList it = new ItemList();

        it.insertItem("ACIN0001", new Item("Cable USB", 2.5f));
        it.insertItem("DESK0001", new Item("Personal Computer", 495.95f));
        it.insertItem("CONS0001", new Item("Lata sardinas", 3.95f));
        it.insertItem("ACIN0002", new Item("Adaptador USB a C", 7.96f));
        it.insertItem("MENA0001", new Item("Sartén", 25.95f));
        it.insertItem("BEBI0001", new Item("Lata cerveza", 0.85f));

        String[] options = { "1.- Insert a new item.",
                             "2.- Delete a item.",
                             "3.- Search a item.",
                             "4.- Modify a item.",
                             "5.- List all item."};

        Menu menu = new Menu(options, "Items menu");

        int option = 0;
        do{
            option = menu.showMenu();
            switch (option){
                case 0:{
                    System.out.println("Exiting...");
                    break;
                }
                case 1:{
                    System.out.println("Inserting new item...");
                    break;
                }
                case 2:{
                    System.out.println("Removing item...");
                    break;
                }
                case 3:{
                    System.out.println("Searching item...");
                    break;
                }
                case 4:{
                    System.out.println("Modifying item...");
                    break;
                }
                case 5:{
                    System.out.println("Listing items...");
                    it.listItems();
                    break;
                }
                default:{
                    System.out.println("The option is wrong...");
                    break;
                }
            }
        }
        while(option != 0);
    }
}