import java.sql.Struct;

public class NaturalPerson implements Cloneable, LoanVariableCalculation {

    // Properties.
    private String idCard;
    private String name;
    private String surname;
    private boolean paySlip;
    private float paySlipAmount;
    private String address;
    private IBAN iban;
    private char costumerValuation;
    private LoanRequest loanRequest;

    // Constructor.
    public NaturalPerson(String idCard, String name, String surname, boolean paySlip, float paySlipAmount, String address, IBAN iban, LoanRequest loanRequest){

        // this.idCard
        this.idCard = idCard;

        // this.name
        this.name = name;

        // this.surname
        this.surname = surname;

        // this.paySlip
        this.paySlip = paySlip;

        // this.paySlipAmount
        this.paySlipAmount = paySlipAmount;

        // this.address
        this.address = address;

        //this.iban
        this.iban = iban;

        // this.loanRequest
        this.loanRequest = loanRequest;
    }

    // Get & Set Methods.

    // String idCard;
    public String getIdCard(){ return this.idCard; }
    public void setIdCard( String idCard ){ this.idCard = idCard; }

    // String name;
    public String getName(){return this.name; }
    public void setName( String name ){ this.name = name; }

    // String surname;
    public String getSurname(){ return this.surname; }
    public void setSurname( String surname ){ this.surname = surname; }

    // boolean paySlip;
    public boolean getPaySlip(){ return this.paySlip; }
    public void setPaySlip( boolean paySlip ){ this.paySlip = paySlip; }

    // float paySlipAmount;
    public float getPaySlipAmount(){ return this.paySlipAmount; }
    public void setPaySlipAmount( float paySlipAmount ){ this.paySlipAmount = paySlipAmount; }

    // String address;
    public String getAddress(){ return this.address; }
    public void setAddress( String address ){ this.address = address; }

    // IBAN iban;
    public IBAN getIban(){ return this.iban; }
    public void setIban( IBAN iban ){ this.iban = iban; }

    // LoanRequest loanRequest;
    public LoanRequest getLoanRequest(){ return this.loanRequest; }
    public void setLoanRequest( LoanRequest loanRequest ){ this.loanRequest = loanRequest; }

    // Other methods.
    public void assignValuation(){
        if( this.loanRequest.getType() == LoanRequest.PERSONAL && this.paySlipAmount < LoanVariableCalculation.LOWER_PAYSLIP_LIMIT ){
            this.costumerValuation = 'C';
        }
        else if ( this.loanRequest.getType() == LoanRequest.PERSONAL && this.paySlipAmount >= LoanVariableCalculation.LOWER_PAYSLIP_LIMIT && this.paySlipAmount < LoanVariableCalculation.UPPER_PAYSLIP_LIMIT && this.loanRequest.getCapital() > LoanVariableCalculation.PERSONAL_CAPITAL_LIMIT ) {
            this.costumerValuation = 'B';
        }
        else if ( this.loanRequest.getType() == LoanRequest.PERSONAL && this.paySlipAmount >= LoanVariableCalculation.LOWER_PAYSLIP_LIMIT && this.paySlipAmount < LoanVariableCalculation.UPPER_PAYSLIP_LIMIT && this.loanRequest.getCapital() < LoanVariableCalculation.PERSONAL_CAPITAL_LIMIT ) {
            this.costumerValuation = 'A';
        }
        else if ( this.loanRequest.getType() == LoanRequest.PERSONAL && this.paySlipAmount >= LoanVariableCalculation.LOWER_PAYSLIP_LIMIT && this.paySlipAmount > LoanVariableCalculation.UPPER_PAYSLIP_LIMIT ) {
            this.costumerValuation = 'A';
        }
        else if ( this.loanRequest.getType() == LoanRequest.MORTGAGE ) {
            if( this.paySlipAmount < LoanVariableCalculation.LOWER_PAYSLIP_LIMIT ){
                this.costumerValuation = 'C';
            }
            if( this.paySlipAmount >= LoanVariableCalculation.LOWER_PAYSLIP_LIMIT && this.loanRequest.getCapital() > LoanVariableCalculation.MORTGAGE_CAPITAL_LIMIT ){
                this.costumerValuation = 'B';
            }
            if( this.paySlipAmount >= LoanVariableCalculation.LOWER_PAYSLIP_LIMIT && this.loanRequest.getCapital() <= LoanVariableCalculation.MORTGAGE_CAPITAL_LIMIT ){
                this.costumerValuation = 'A';
            }
        }
    }

    public void interestCalculation(){
        if( this.getLoanRequest().getType() == LoanRequest.PERSONAL ){
            this.getLoanRequest().setInterestType(LoanRequest.FIXED_INTEREST);
            if( this.costumerValuation == 'A' ){
                if( this.getLoanRequest().getDeadLine() > 60 ){
                    this.getLoanRequest().setPercentFixedInterest(0.03f);
                }
                else {;
                    this.getLoanRequest().setPercentFixedInterest(0.035f);
                }
            }
            else if( this.costumerValuation == 'B' ){
                this.getLoanRequest().setPercentFixedInterest(0.04f);
            }
            else if( this.costumerValuation == 'C' ){
                this.getLoanRequest().setPercentFixedInterest(0.05f);
            }
        }
        else if( this.getLoanRequest().getType() == LoanRequest.MORTGAGE ){
            this.getLoanRequest().setInterestType(LoanRequest.VARIABLE_INTEREST);
            if( this.costumerValuation == 'A' ){
                if( this.getLoanRequest().getDeadLine() < 240 ){
                    this.getLoanRequest().setReferenceIndex(LoanRequest.EURIBOR);
                    this.getLoanRequest().setPercentDifference(0.01f);
                    this.getLoanRequest().setReviewPeriod(6);
                }
                else{
                    this.getLoanRequest().setReferenceIndex(LoanRequest.EURIBOR);
                    this.getLoanRequest().setPercentDifference(0.01f);
                    this.getLoanRequest().setReviewPeriod(12);
                }
            }
            else if( this.costumerValuation == 'B' ){
                if( this.getLoanRequest().getDeadLine() < 240 ){
                    this.getLoanRequest().setReferenceIndex(LoanRequest.IRS);
                    this.getLoanRequest().setPercentDifference(0.015f);
                    this.getLoanRequest().setReviewPeriod(12);
                }
                else{
                    this.getLoanRequest().setReferenceIndex(LoanRequest.IRS);
                    this.getLoanRequest().setPercentDifference(0.025f);
                    this.getLoanRequest().setReviewPeriod(6);
                }
            }
            else if( this.costumerValuation == 'C' ){
                this.getLoanRequest().setReferenceIndex(LoanRequest.MIBOR);
                this.getLoanRequest().setPercentDifference(0.03f);
                this.getLoanRequest().setReviewPeriod(6);
            }
        }

    }

    // clone() Method.
    public NaturalPerson cloneNaturalPerson(){
        try {
            return (NaturalPerson) this.clone();
        }
        catch ( CloneNotSupportedException cnse ){
            System.out.println("This call doesn't support objects clone.");
            return null;
        }
    }

    // toString() Method.
    @Override
    public String toString() {
        return "NaturalPerson{" +
                "idCard='" + this.idCard + '\'' +
                ", name='" + this.name + '\'' +
                ", surname='" + this.surname + '\'' +
                ", paySlip=" + (this.paySlip ? "Yes" : "No") +
                ", address='" + this.address + '\'' +
                ", valuation='" + this.costumerValuation + '\'' +
                ", iban='" + this.iban + '\'' +
                ", loanRequest=" + this.loanRequest +
                '}';
    }
}
