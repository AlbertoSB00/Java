import java.time.LocalDate;
import java.time.Period;

public class Enterprise implements Cloneable, LoanVariableCalculation {

    // Properties.
    private String idCard;
    private String name;
    private int type;
    private String activity;
    private IBAN iban;
    private char customerValuation;
    private LoanRequest loanRequest;

    // Static properties.
    public static final int PUBLIC_LIMITED_COMPANY = 1;
    public static final int PUBLIC_LIABILITY_COMPANY = 2;
    public static final int SELF_EMPLOYED = 3;

    // Constructor.
    public Enterprise(String idCard, String name, int type, String activity, IBAN iban, LoanRequest loanRequest) throws Exception {

        // this.idCard
        this.idCard = idCard;

        // this.name
        this.name = name;

        // this.type
        this.setType(type);

        // this.activity
        this.activity = activity;

        // this.iban
        this.iban = iban;

        // this.loanRequest
        this.loanRequest = loanRequest;
    }

    // Get & Set Methods.

    // String idCard
    public String getIdCard(){ return this.idCard; }
    public void setIdCard( String idCard ){ this.idCard = idCard; }

    // String name
    public String getName(){return this.name; }
    public void setName( String name ){ this.name = name; }

    // int type
    public int getType(){ return this.type; }
    public void setType( int type ) throws Exception {
        if( type != Enterprise.PUBLIC_LIMITED_COMPANY && type != Enterprise.PUBLIC_LIABILITY_COMPANY && type != Enterprise.SELF_EMPLOYED ){
            throw new Exception("The type is wrong.");
        }
        else{
            this.type = type;
        }
    }

    // String activity
    public String getActivity(){ return this.activity; }
    public void setActivity( String activity ){ this.activity = activity; }

    // IBAN iban
    public IBAN getIban(){ return this.iban; }
    public void setIban( IBAN iban ){ this.iban = iban; }

    // LoanRequest loanRequest
    public LoanRequest getLoanRequest(){ return this.loanRequest; }
    public void setLoanRequest( LoanRequest loanRequest ){ this.loanRequest = loanRequest; }

    // Other methods.
    public void assignValuation(){
        if( this.iban.getBalance() >= LoanVariableCalculation.BALANCE_LIMIT ){
            if( this.type == Enterprise.PUBLIC_LIMITED_COMPANY ){
                this.customerValuation = 'A';
            }
            else if( this.type == Enterprise.SELF_EMPLOYED ){
                this.customerValuation = 'C';
            }
            else {
                this.customerValuation = 'B';
            }
        }
        else {
            if( this.type == Enterprise.PUBLIC_LIMITED_COMPANY ){
                this.customerValuation = 'B';
            }
            else {
                this.customerValuation = 'C';
            }
        }
    }

    public void interestCalculation(){

        LocalDate today = LocalDate.now();
        Period difference = today.until(this.iban.getOpenDate());
        // Period difference = Period.between(this.iban.getOpenDate(), today);

        this.loanRequest.setInterestType(LoanRequest.FIXED_INTEREST);

        if( this.customerValuation == 'A' ){
            if( difference.getYears() >= 10 ){
                this.loanRequest.setPercentFixedInterest(0.015f);
            }
            else {
                this.loanRequest.setPercentFixedInterest(0.025f);
            }
        }
        else if( this.customerValuation == 'B' ){
            if( this.loanRequest.getDeadLine() >= 5 ){
                this.loanRequest.setPercentFixedInterest(0.03f);
            }
            else {
                this.loanRequest.setPercentFixedInterest(0.035f);
            }
        }
        else {
            System.out.println("The loan request has been request.");
        }
    }

    // clone() Method.
    public Enterprise cloneEnterprise(){
        try {
            return (Enterprise) this.clone();
        }
        catch (CloneNotSupportedException cnse){
            System.out.println("This class doesn't support clone object.");
            return null;
        }
    }

    // toString() Method.
    @Override
    public String toString() {
        return "Enterprise{" +
                "idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", activity='" + activity + '\'' +
                ", valuation='" + this.customerValuation + '\'' +
                ", loanRequest=" + this.loanRequest +
                '}';
    }
}
