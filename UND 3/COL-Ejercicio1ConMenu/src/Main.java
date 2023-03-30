import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Act1 act1 = new Act1();

        int option;

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
                case 1:{
                    act1.insertElement();
                    break;
                }
                case 2:{
                    act1.removeElement();
                    break;
                }
                case 3:{
                    act1.searchElement();
                    break;
                }
                case 4:{
                    act1.modifyElement();
                    break;
                }
                case 5:{
                    act1.listElement();
                    break;
                }
                case 0:{
                    System.out.println("Exiting...");
                    break;
                }
                default:{
                    System.out.println("The option number is wrong. Try again...");
                    break;
                }
            }

        }while (option != 0);
    }
}