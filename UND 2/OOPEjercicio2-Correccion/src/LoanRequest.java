import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LoanRequest implements Cloneable {

    // Properties.
    private int id;
    private float capital;
    private char type;
    private LocalDate requestDate;
    private char currency;
    private int deadLine;

    // Other properties.
    private int interestType;
    private float percentFixedInterest;
    private int referenceIndex;
    private float percentDifference;
    private int reviewPeriod;


    // Static properties.
    public static final char PERSONAL = 'P';
    public static final char MORTGAGE = 'M';
    public static final char ENTERPRISE = 'E';
    public static final int MAXIMUM_CAPITAL_PERSONAL = 50000;
    public static final int MAXIMUM_CAPITAL_MORTGAGE = 250000;
    public static final int MAXIMUM_CAPITAL_ENTERPRISE = 1000000;

    // Other static properties.
    public static final int FIXED_INTEREST = 1;
    public static final int VARIABLE_INTEREST = 2;
    public static final int IRS = 3;
    public static final int EURIBOR = 4;
    public static final int MIBOR = 5;


    // Constructor.
    public LoanRequest(int id, float capital, char type, LocalDate requestDate, char currency, int deadLine) throws Exception{

        // this.id
        this.id = id;

        // this.capital
        this.setCapital(capital, type);

        // this.type
        this.setType(type);

        // this.requestDate
        this.requestDate = requestDate;

        // this.currency
        this.setCurrency(currency);

        // this.deadLine
        this.deadLine = deadLine;

    }

    // Get & Set Methods.

    // int id
    public int getId(){ return this.id; }
    public void setId( int id ){ this.id = id; }

    // float capital
    public float getCapital(){ return this.capital; }
    public void setCapital( float capital, char type ){
        int maximumCapital = 0;
        switch (type){
            case LoanRequest.PERSONAL:{
                maximumCapital = LoanRequest.MAXIMUM_CAPITAL_PERSONAL;
                break;
            }
            case LoanRequest.MORTGAGE:{
                maximumCapital = LoanRequest.MAXIMUM_CAPITAL_MORTGAGE;
                break;
            }
            case LoanRequest.ENTERPRISE:{
                maximumCapital = LoanRequest.MAXIMUM_CAPITAL_ENTERPRISE;
                break;
            }
        }

        if( capital > maximumCapital ){
            this.capital = maximumCapital;
        }
        else {
            this.capital = capital;
        }
    }

    // char type
    public char getType(){ return type; }
    public void setType( char type ) throws Exception{
        if( Character.toUpperCase(type) != this.PERSONAL && Character.toUpperCase(type) != this.MORTGAGE && Character.toUpperCase(type) != this.ENTERPRISE ){
            throw new Exception("The type is not valid.");
        }
        else {
            this.type = Character.toUpperCase(type);
        }
    }

    // LocalDate requestDate
    public LocalDate getRequestDate(){ return this.requestDate; }
    public void setRequestDate( LocalDate requestDate ){ this.requestDate = requestDate; }

    // char currency
    public char getCurrency(){ return this.currency; }
    public void setCurrency( char currency ){
        if( currency != '€' || currency != '$' ){
            this.currency = '€';
        }
        else {
            this.currency = currency;
        }
    }

    // int deadLine
    public int getDeadLine(){ return this.deadLine; }
    public void setDeadLine( int deadLine ){ this.deadLine = deadLine; }

    // int interestType
    public void setInterestType( int interestType ){ this.interestType = interestType; }

    // float percentFixedInterest
    public void setPercentFixedInterest( float percentFixedInterest ){ this.percentFixedInterest = percentFixedInterest; }

    // int referenceIndex
    public void setReferenceIndex( int referenceIndex ){ this.referenceIndex = referenceIndex; }

    // float percentDifference
    public void setPercentDifference( float percentDifference ){ this.percentDifference = percentDifference; }

    // int reviewPeriod
    public void setReviewPeriod( int referenceIndex ){ this.reviewPeriod = reviewPeriod; }


    // Other methods.


    // clone() Method.
    public LoanRequest cloneLoanRequest(){
        try{
            return (LoanRequest) this.clone();
        }
        catch ( CloneNotSupportedException cnse ){
            System.out.println("This class doesn't support object clone.");
            return null;
        }
    }

    // toString() Method.
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/Y");
        String loan =  "LoanRequest{" +
                "id=" + this.id +
                ", capital=" + this.capital +
                ", type=";

        switch (this.type){
            case LoanRequest.PERSONAL:{
                loan += "PERSONAL";
                break;
            }
            case LoanRequest.MORTGAGE:{
                loan += "MORTGAGE";
                break;
            }
            case LoanRequest.ENTERPRISE:{
                loan += "ENTERPRISE";
                break;
            }
        }

        loan += ", requestDate=" + this.requestDate.format(dtf) +
                ", currency=" + this.currency;

        // We find out the deadLine date just by adding the deadLine month in the request date.
        LocalDate estimatedDeadLine = this.requestDate.plusMonths(deadLine);
        loan += ", deadLine=" + estimatedDeadLine.format(dtf);
        loan += ", interestType=" + this.interestType;
        loan += ", fixedInterest=" + this.percentFixedInterest;
        loan += ", referenceIndex=" + this.referenceIndex;
        loan += ", differentPercentage" + this.percentDifference;
        loan += ", reviewPeriod" + this.reviewPeriod;

        return loan;
    }
}
