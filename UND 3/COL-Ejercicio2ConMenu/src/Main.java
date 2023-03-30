import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Act2 act2 = new Act2();

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
                    act2.insertElement();
                    break;
                }
                case 2:{
                    act2.removeElement();
                    break;
                }
                case 3:{
                    String c = act2.searchElement();
                    if( c != null ){
                        System.out.println("The country is " + c);
                    }
                    break;
                }
                case 4:{
                    act2.modifyElement();
                    break;
                }
                case 5:{
                    act2.listElement();
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