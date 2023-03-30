import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Act7 act7 = new Act7();

        act7.insertBankActivity(BankActivity.DEPOSIT, LocalDate.of(2023, 02, 12), "Payroll", 2150.45f);
        act7.insertBankActivity(BankActivity.DEPOSIT, LocalDate.of(2023, 01, 31), "Bank transfer", 150.35f);
        act7.insertBankActivity(BankActivity.WITHDRAW, LocalDate.of(2023, 02, 01), "Shop Amazon", 50.75f);
        act7.insertBankActivity(BankActivity.WITHDRAW, LocalDate.of(2023, 02, 02), "Cashpoint withdraw", 100f);
        act7.insertBankActivity(BankActivity.WITHDRAW, LocalDate.of(2023, 02, 05), "Electric Power bill", 75.15f);

        int option = 0;

        do{
            System.out.println("      ACTIVITY BANK MENU      ");
            System.out.println("------------------------------");
            System.out.println("1.- Insert a new bank activity");
            System.out.println("2.- Remove a bank activity    ");
            System.out.println("3.- Search a bank activity    ");
            System.out.println("4.- Modify a bank activity    ");
            System.out.println("5.- List the bank activities  ");
            System.out.println("6.- List the bank activitiesFB");
            System.out.println("7.- Show a summary of BA      ");
            System.out.println("0.- EXIT                      ");
            System.out.println("------------------------------");

            System.out.print("Enter your option: ");
            option = sc.nextInt();

            switch (option){
                case 0:{
                    System.out.println("Exiting...");
                    break;
                }
                case 1:{

                }
                case 2:{
                    act7.removeBankActivity();
                    break;
                }
                case 3:{
                    act7.searchBankActivities();
                    break;
                }
                case 4:{

                }
                case 5:{
                    act7.listBankActivities();
                    break;
                }
                case 6:{
                    act7.listBankActivities2();
                    break;
                }
                case 7:{
                    act7.summaryBankActivities();
                    break;
                }
                default:{
                    System.out.println("The option is wrong, try it again...");
                }
            }
        }while ( option != 0 );
    }
}