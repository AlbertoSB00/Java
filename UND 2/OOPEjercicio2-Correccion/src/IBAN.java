import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IBAN implements Cloneable {

    // Properties.
    private String bankAccount;
    private float balance;
    private float percentagePerNegativeBalance;
    private LocalDate openDate;

    // Constructor.
    public IBAN(String bankAccount, float balance, float percentagePerNegativeBalance, LocalDate openDate) throws Exception{

        // this.bankAccount
        this.setBankAccount(bankAccount);

        // this.balance
        this.balance = balance;

        // this.percentagePerNegativeBalance
        this.percentagePerNegativeBalance = percentagePerNegativeBalance;

        // this.openDate
        this.openDate = openDate;

    }

    // Get & Set Methods.

    // String bankAccount
    public String getBankAccount(){ return this.bankAccount; }
    public void setBankAccount( String bankAccount ) throws Exception{
        if( !isValidIBAN(bankAccount) ){
            throw new Exception("The IBAN format is not valid");
        }
        else {
            this.bankAccount = bankAccount;
        }
    }
    // float balance
    public float getBalance(){ return this.balance; }
    public void setBalance( float balance ){ this.balance = balance; }

    // float percentagePerNegativeBalance
    public float getPercentagePerNegativeBalance(){ return this.percentagePerNegativeBalance; }
    public void setPercentagePerNegativeBalance( float percentagePerNegativeBalance ){ this.percentagePerNegativeBalance = percentagePerNegativeBalance; }

    // LocalDate openDate
    public LocalDate getOpenDate(){ return this.openDate; }
    public void setOpenDate( LocalDate openDate ){ this.openDate = openDate; }

    // Other methods.
    public static boolean isValidIBAN( String IBAN ){

        boolean result = true;

        if( IBAN.length() != 24 ) {
            result = false;
        }

        if( result ){
            String country = IBAN.substring(0,2);
            if( Character.isLetter(country.charAt(0)) && Character.isLetter(country.charAt(1)) ){
                country = country.toUpperCase();
            }
            else {
                result = false;
            }
        }

        if( result ){
            String numbers = IBAN.substring(2);
            for( int i = 0; i < numbers.length(); i++ ){
                if( Character.isDigit(i)){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    // clone() Method.
    public IBAN cloneIBAN(){
        try{
            IBAN cloneObject = (IBAN) this.clone();
            cloneObject.setBankAccount("ES0000000000000000000000");
            return cloneObject;
        }
        catch ( CloneNotSupportedException cnse ){
            System.out.println("This class doesn't support the objects clone.");
            return null;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    // toString() Method.
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/Y");
        return "IBAN{" +
                "bankAccount='" + this.bankAccount + '\'' +
                ", balance=" + this.balance +
                ", percentagePerNegativeBalance=" + this.percentagePerNegativeBalance +
                ", openDate=" + this.openDate.format(dtf) +
                '}';
    }
}
