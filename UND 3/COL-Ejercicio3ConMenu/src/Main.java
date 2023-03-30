import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Act3 act3 = new Act3();

        // Menu.
        int option = 0;

        do{
            System.out.println("|--------------------------|");
            System.out.println("| 1.- Insert a new element |");
            System.out.println("| 2.- Delete an element    |");
            System.out.println("| 3.- Search an element    |");
            System.out.println("| 4.- Modify an element    |");
            System.out.println("| 5.- List an element      |");
            System.out.println("| 0.- EXIT                 |");
            System.out.println("|--------------------------|");


            System.out.print("Enter the option: ");
            option = sc.nextInt();

            switch (option){
                case 0:{
                    System.out.println("Exiting...");
                    break;
                }
                case 1:{
                    act3.insertElement();
                    break;
                }
                case 2:{
                    act3.removeElement();
                    break;
                }
                case 3:{
                    act3.searchElement();
                    break;
                }
                case 4:{
                    act3.modifyElement();
                    break;
                }
                case 5:{
                    act3.listElement();
                    break;
                }
                default:{
                    System.out.println("The option " + option + " is not valid.");
                    System.out.println("Make sure to select 1 to 5, or 0 to exit...");
                    break;
                }
            }

        }while (option != 0);
    }
}