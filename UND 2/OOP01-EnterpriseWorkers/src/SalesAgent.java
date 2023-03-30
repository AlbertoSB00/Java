public class SalesAgent implements Cloneable, CalculateSalary {

    // Properties.
    private String idCard;
    private String name;
    private String surname;
    private String regionCovered;
    private Address address;
    private PayableData payableData;

    // Constructor.
    public SalesAgent(String idCard, String name, String surname, String regionCovered){
        this.idCard = idCard;
        this.name = name;
        this.surname = surname;
        this.regionCovered = regionCovered;
    }

    public SalesAgent(String idCard, String name, String surname, String regionCovered, Address address, PayableData payableData){
        this.idCard = idCard;
        this.name = name;
        this.surname = surname;
        this.regionCovered = regionCovered;
        this.address = address;
        this.payableData = payableData;
    }

    // Get & Set methods.

    // String idCard
    public String getIdCard(){ return  idCard; }
    public void setIdCard( String idCard ){ this.idCard = idCard; }

    // String name
    public String getName(){ return name; }
    public void setName( String name ){ this.name = name; }

    // String surname
    public String getSurname(){ return surname; }
    public void setSurname( String surname ){ this.surname = surname; }

    // String regionCovered
    public String getRegionCovered(){ return regionCovered; }
    public void setRegionCovered( String regionCovered ){ this.regionCovered = regionCovered; }

    // Address address
    public Address getAddress(){ return address; }
    public void setAddress( Address address ){ this.address = address; }

    // PayableData payableData
    public PayableData getPayableData(){ return payableData; }
    public void setPayableData( PayableData payableData ){ this.payableData = payableData; }

    public String toString(){
        return "Sales agent: " + this.idCard + " " + this.name;
    }

    public SalesAgent copySalesAgent(){
        try{
            return (SalesAgent) this.clone();
        }
        catch (CloneNotSupportedException cnse){
            System.out.println("23.- The class doesn't implements Cloneable interface.");
            return null;
        }
    }

    // We implement the three methods from the CalculateSalary interface.
    public void calculateGrossSalary( PayableData pd ){
        float grossSalary = pd.getBaseSalary() + pd.getSaleLastMonth() * pd.getPercentageCommission();
        pd.setGrossSalary(grossSalary);
    }

    public void calculateIncentive( PayableData pd ){
        float incentive = 0;
        if( pd.getSaleLastMonth() > pd.getObjectiveSalesPerMonth() ){
            incentive = 200;
        }
        pd.setIncentive(incentive);
    }

    public void calculateNetSalary( PayableData pd ){
        float grossSalary = pd.getGrossSalary();
        float incentive = pd.getIncentive();
        float total = grossSalary + incentive;
        float netSalary = total - total * pd.PIT - total * pd.NI;
        pd.setNetSalary(netSalary);
    }

}
