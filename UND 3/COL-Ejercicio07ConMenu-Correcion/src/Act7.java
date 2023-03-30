import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Act7 {
    private ArrayList<BankActivity> bankAccount;

    public Act7(){
        bankAccount = new ArrayList<BankActivity>();
    }

    public Iterator<BankActivity> getIterator(){ return this.bankAccount.iterator(); }

    // Case 1: insertBankActivity().
    public void insertBankActivity(char activityType, LocalDate date, String description, float amount){
        BankActivity bankActivity = new BankActivity(activityType, date, description, amount);
        this.bankAccount.add(bankActivity);
    }

    // Case 2: removeBankActivity().
    public void removeBankActivity(){
        BankActivity bankActivity = this.chooseBankActivity();
        this.bankAccount.remove(bankActivity);
    }

    // Case 3: searchBankActivities().
    public void searchBankActivities(){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");

        String activityType;
        LocalDate beginning = null, end = null;
        float minAmount = 0, maxAmount = 0;
        String description;

        System.out.println("Enter data to make a search.");
        System.out.print("Activity type [D/W] -> ");
        activityType = sc.nextLine();

        boolean goodDates = false;

        do{
            try{
                System.out.print("Enter the beginning date -> ");
                String date = sc.nextLine();
                if( !date.equals("") ){
                    beginning = LocalDate.parse(date, dtf);
                }

                System.out.print("Enter the end date -> ");
                date = sc.nextLine();
                if( !date.equals("") ){
                    end = LocalDate.parse(date, dtf);
                }

                goodDates = true;
            }catch (DateTimeParseException dtpe){
                System.out.println(dtpe.getMessage());
            }
        }while (!goodDates);

        System.out.print("Enter the minimal amount ->  ");
        String amount = sc.nextLine();
        if( amount.equals("") ){
            minAmount = 0;
        }
        else{
            minAmount = Float.valueOf(amount);
        }


        if( minAmount == 0 ){
            maxAmount = 0;
        }
        else {
            System.out.print("Enter the maximum amount -> ");
            amount = sc.nextLine();
            if( amount.equals("") ){
                maxAmount = 0;
            }
            else{
                maxAmount = Float.valueOf(amount);
            }
        }

        System.out.print("Enter an expression for the description -> ");
        description = sc.nextLine();

        System.out.println("Searching results: ");
        int howManyActivities = 0;

        Iterator<BankActivity> iterator = this.bankAccount.iterator();
        while(iterator.hasNext() ){
            BankActivity ba = iterator.next();
            boolean isFound = true;

            if( !activityType.equals("") ){
                if( ba.getActivityType() != activityType.charAt(0) ){
                    isFound = false;
                }
            }

            if( isFound ){
                if( beginning != null && end != null ){
                    if( !(ba.getDate().isAfter(beginning) && ba.getDate().isBefore(end)) ){
                        isFound = false;
                    }
                }
            }

            if( isFound ){
                if( minAmount != 0 && maxAmount != 0 ){
                    if( !(ba.getAmount() >= minAmount && ba.getAmount()  <= maxAmount) ){
                        isFound = false;
                    }
                }
            }

            if( isFound ){
                if( !description.equals("") ){
                    if(ba.getDescription().indexOf(description) == -1){
                        isFound = false;
                    }
                }
            }

            if( isFound ){
                ++howManyActivities;
                System.out.println(ba);
            }
        }

        System.out.println(howManyActivities + " bank activities found.");
    }

    // Case 4: modifyBankActivity().

    // Case 5: listBankActivities().
    public void listBankActivities(){
        for( int i = 0; i < this.bankAccount.size(); i++ ){
            System.out.println(i + " -> " + this.bankAccount.get(i));
        }
    }

    // Case 6: listBankActivities2().
    public void listBankActivities2(){
        ListIterator<BankActivity> listIterator = this.bankAccount.listIterator();

        System.out.println("We go through forward.");
        while(listIterator.hasNext() ){
            BankActivity ba = listIterator.next();
            System.out.println("F " + ba);
        }

        System.out.println("We go back to the beginning.");
        while(listIterator.hasPrevious() ){
            BankActivity ba = listIterator.previous();
            System.out.println("B " + ba);

            int middle = this.bankAccount.size() / 2;

            // middle += this.bankAccount.size() % 2 == 0 ? 1 : 0;

            if( listIterator.previousIndex() == middle - 1 ){
                listIterator.set(new BankActivity(BankActivity.DEPOSIT, LocalDate.now(), "New deposit", 1000f));
            }
        }
    }

    // Case 7: summaryBankActivities().
    public void summaryBankActivities(){
        Iterator<BankActivity> iterator = this.bankAccount.iterator();
        float totalDeposit = 0, totalWithdraw = 0;
        boolean thereIsBankTransfer = false;

        while( iterator.hasNext() ){
            BankActivity ba = iterator.next();
            if( ba.getActivityType() == BankActivity.DEPOSIT ){
                totalDeposit += ba.getAmount();
            }
            else{
                totalWithdraw += ba.getAmount();
            }

            if( ba.getDescription().toUpperCase().indexOf("BANK TRANSFER") >= 0){
                thereIsBankTransfer = true;
            }

            System.out.println(ba);
        }

        System.out.println("---------------------------");
        System.out.println("Total deposit : " + totalDeposit);
        System.out.println("Total withdraw: " + totalWithdraw);
        System.out.println("Account balance: " + (totalDeposit - totalWithdraw));

        if( thereIsBankTransfer ){
            System.out.println("There has been a bank transfer as deposit.");
        }
    }

    private BankActivity chooseBankActivity() {
        BankActivity bankActivity = null;
        int number = 0;
        Scanner sc = new Scanner(System.in);

        do {
            this.listBankActivities();
            System.out.print("Choose an activity number: ");
            number = sc.nextInt();

            if (number < 0 || number >= this.bankAccount.size()) {
                System.out.println("The bank activity chosen doesn't exists");
                System.out.println("Try it again...");
            }
        } while (number < 0 || number >= this.bankAccount.size());

        bankActivity = this.bankAccount.get(number);
        return bankActivity;
    }
}
