import java.time.LocalDate;

public class Employee implements Cloneable, CalculateSalary {

    // Property.
    private String idCard;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private boolean active;
    private String department;
    private Address address;
    private PayableData payableData;

    // Constructor for employee.
    public Employee(String idCard, String name, String surname, LocalDate birthDate){
        this.idCard = idCard;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.active = true;
    }

    public Employee(String idCard, String name, String surname, LocalDate birthDate, Address address){
        this.idCard = idCard;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.active = true;
        this.address = address;
    }

    public Employee(String idCard, String name, String surname, LocalDate birthDate, PayableData payableData){
        this.idCard = idCard;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.active = true;
        this.payableData = payableData;
    }

    public Employee(String idCard, String name, String surname, LocalDate birthDate, String department, Address address, PayableData payableData){
        this.idCard = idCard;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.active = true;
        this.department = department;
        this.address = address;
        this.payableData = payableData;

    }

    // get and set methods.

    // idCard
    public String getIdCard(){ return idCard; }
    public void setIdCard(String idCard){ this.idCard = idCard; }

    // name
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    // surname
    public String getSurname(){ return surname; }
    public void setSurname(String surname){ this.surname = surname; }

    // birthDate
    public LocalDate getBirthDate(){ return birthDate; }
    public void setBirthDate(LocalDate birthDate){ this.birthDate = birthDate; }

    // active
    public boolean getActive(){ return active; }
    public boolean isActive(){ return active; }
    public void setActive(boolean active){ this.active = active; }

    // department
    public String getDepartment(){ return department; }
    public void setDepartment(String department){ this.department = department; }

    // Address
    public Address getAddress(){ return address; }
    public void setAddress(Address address){ this.address = address; }

    // PayableData
    public PayableData getPayableData(){ return payableData; }
    public void setPayableData(PayableData payableData) { this.payableData = payableData; }

    // Other methods.
    boolean isSameDepartment(Employee e){
        return this.department.equalsIgnoreCase(e.getDepartment());
    }

    boolean isSameCategory(Employee e){
        // return this.payableData.getCategory().equalsIgnoreCase((e.payableData.getCategory()));
        String category1 = this.payableData.getCategory();
        String category2 = e.payableData.getCategory();
        return category1.equalsIgnoreCase(category2);
    }

    int getAge(){
        LocalDate today = LocalDate.now();
        int year = today.getYear() - birthDate.getYear();
        if( today.getMonthValue() < birthDate.getMonthValue() || today.getMonthValue() == today.getMonthValue() && today.getDayOfMonth() < today.getDayOfMonth()){
            --year;
        }
        return year;
    }

    public String toString(){
        return  "Employee: " + this.name + " " + this.surname + "\n" +
                this.address;
    }

    public Employee copyEmployee(){
        try{
            return (Employee) this.clone();
        }
        catch (CloneNotSupportedException cnse){
            System.out.println("The class doesn't implements Cloneable interface.");
            return null;
        }
    }

    // We need to overwrite the three methods from the CalculateSalary interface.
    public void calculateGrossSalary( PayableData pd ){
        float grossSalary = pd.getBaseSalary() + pd.getSixYearsTerm() * pd.SIX_YEARS_TERM + pd.getTrienium() * pd.TRIENIUM;

        if( pd.getExtraTime() > 0 ){
            if( pd.getIncentive() == 0 ){
                System.out.println("Tou don't have calculated the incentive yet.");
                this.calculateIncentive(pd);
            }
        }

        grossSalary += pd.getIncentive();
        pd.setGrossSalary(grossSalary);
    }

    public void calculateIncentive( PayableData pd ){
        float incentive = pd.getExtraTime() * pd.EXTRA_TIME;
        pd.setIncentive(incentive);
    }

    public void calculateNetSalary( PayableData pd ){
        float grossSalary = pd.getGrossSalary();
        float netSalary = grossSalary - grossSalary * pd.PIT - grossSalary * pd.NI;
        pd.setNetSalary(netSalary);


    }
}
