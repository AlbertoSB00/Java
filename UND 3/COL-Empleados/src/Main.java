import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeList employeeList = new EmployeeList();

        // Menu.
        int option = 0;

        do{
            System.out.println("|---------------------------|");
            System.out.println("| 1.- Insert a new employee |");
            System.out.println("| 2.- Delete an employee    |");
            System.out.println("| 3.- Search an employee    |");
            System.out.println("| 4.- Modify an employee    |");
            System.out.println("| 5.- List an employee      |");
            System.out.println("| 0.- EXIT                  |");
            System.out.println("|---------------------------|");


            System.out.print("Enter the option: ");
            option = sc.nextInt();

            switch (option){
                case 0:{
                    System.out.println("Exiting...");
                    break;
                }
                case 1:{
                    employeeList.insertEmployee();
                    break;
                }
                case 2:{
                    employeeList.removeEmployee();
                    break;
                }
                case 3:{
                    employeeList.searchEmployee();
                    break;
                }
                case 4:{
                    employeeList.replaceElement();
                    break;
                }
                case 5:{
                    employeeList.listEmployee();
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