import java.time.LocalDate;

public class PayableData {

    // Property.
    LocalDate membershipDate;
    String category;
    private float baseSalary;
    private int extraTime;

    private float saleLastMonth;
    private float salesCurrentYear;
    private float objectiveSalesPerMonth;
    private float percentageCommission;

    public static final float PIT = 0.2f;
    public static final float NI = 0.05f;
    public static final float SIX_YEARS_TERM = 130f;
    public static final float TRIENIUM = 40f;
    public static final float EXTRA_TIME = 20f;

    private float grossSalary;
    private float netSalary;
    private float incentive;

    // Constructor for PayableData
    public PayableData(LocalDate membershipDate, String category, float baseSalary){
        this.membershipDate = membershipDate;
        this.category = category;
        this.baseSalary = baseSalary;
        this.extraTime = 0;
        this.grossSalary = 0;
        this.netSalary = 0;
        this.incentive = 0;
    }

    public PayableData(LocalDate membershipDate, String category, float baseSalary, float saleLastMonth, float salesCurrentYear, float objectiveSalesPerMonth, float percentageCommission){
        this.membershipDate = membershipDate;
        this.category = category;
        this.baseSalary = baseSalary;
        this.saleLastMonth = saleLastMonth;
        this.salesCurrentYear = salesCurrentYear;
        this.objectiveSalesPerMonth = objectiveSalesPerMonth;
        this.percentageCommission = percentageCommission;
    }

    // get and set Methods.

    // memberShip
    public LocalDate getMembershipDate(){ return membershipDate; }
    public void setMembershipDate( LocalDate membershipDate ){
        LocalDate today = LocalDate.now();

        if (today.isBefore(membershipDate)){
            System.out.println("Your new membership date is wrong.");
        }
        else {
            this.membershipDate = membershipDate;
        }
    }

    // category
    public String getCategory(){ return category; }
    public void setCategory( String category ){ this.category = category; }

    // baseSalary
    public float getBaseSalary(){ return baseSalary; }
    public void setBaseSalary( float baseSalary ){ this.baseSalary = baseSalary; }

    // extraTime
    public int getExtraTime(){ return extraTime; }
    public void setExtraTime( int extraTime ){ this.extraTime = extraTime; }

    // salesLastMonth
    public float getSaleLastMonth(){ return  saleLastMonth; }
    public void setSaleLastMonth( float saleLastMonth ){ this.saleLastMonth = saleLastMonth; }

    // salesCurrentYear
    public float getSalesCurrentYear(){ return salesCurrentYear; }
    public void setSalesCurrentYear( float salesCurrentYear ){ this.salesCurrentYear = salesCurrentYear; }

    // objectiveSalesPerMonth
    public float getObjectiveSalesPerMonth(){ return  objectiveSalesPerMonth; }
    public void  setObjectiveSalesPerMonth( float objectiveSalesPerMonth ){ this.objectiveSalesPerMonth = objectiveSalesPerMonth; }

    // percentageCommission
    public float getPercentageCommission(){ return  percentageCommission; }
    public void setPercentageCommission( float percentageCommission ){ this.percentageCommission = percentageCommission; }

    // float grossSalary
    public float getGrossSalary(){ return grossSalary; }
    public void setGrossSalary( float grossSalary ){ this.grossSalary = grossSalary; }

    // float netSalary
    public float getNetSalary(){ return netSalary; }
    public void setNetSalary( float netSalary ){ this.netSalary = netSalary; }

    // float incentive
    public float getIncentive(){ return incentive; }
    public void setIncentive( float incentive ){ this.incentive = incentive; }


    // Other methods.
    int getTimeService(){
        LocalDate today = LocalDate.now();
        int years = today.getYear() - membershipDate.getYear();

        if( today.getMonthValue() < membershipDate.getMonthValue() || today.getMonthValue() == membershipDate.getMonthValue() && today.getDayOfMonth() < membershipDate.getDayOfMonth() ){
            --years;
        }
        return years;
    }

    boolean isSameTimeService(PayableData payableData){
        // return this.getTimeService() == payableData.getTimeService();
        int timeService1 = this.getTimeService();
        int timeService2 = payableData.getTimeService();
        return timeService1 == timeService2;
    }

    boolean isSameTimeService(Employee employee){
        int timeService1 = this.getTimeService();
        int timeService2 = employee.getPayableData().getTimeService();
        return timeService1 == timeService2;
    }

    boolean isSameTimeService(LocalDate localDate){
        int timeService1 = this.getTimeService();

        LocalDate today = LocalDate.now();
        int years = today.getYear() - localDate.getYear();

        if( today.getMonthValue() < localDate.getMonthValue() || today.getMonthValue() == localDate.getMonthValue() && today.getDayOfMonth() < localDate.getDayOfMonth() ){
            --years;
        }
        return  timeService1 == years;
    }

    int getTrienium(){
        int trienium = getTimeService() / 3;
        return trienium;
    }

    int getSixYearsTerm(){
        int sixYearsTerm = getTimeService() / 6;
        return sixYearsTerm;
    }

    public static void showPIT(){
        System.out.println("14.- The PIT is " + PIT);
    }

    public static void showNI(){
        System.out.println("15.- The NI is " + NI * 100 + " %");
    }
}
