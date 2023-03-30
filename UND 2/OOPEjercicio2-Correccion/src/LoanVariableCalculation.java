public interface LoanVariableCalculation {
    public void assignValuation();

    public void interestCalculation();

    public static final int LOWER_PAYSLIP_LIMIT = 1300;
    public static final int UPPER_PAYSLIP_LIMIT = 2500;
    public static final int PERSONAL_CAPITAL_LIMIT = 20000;
    public static final int MORTGAGE_CAPITAL_LIMIT = 100000;

    public static final int BALANCE_LIMIT = 50000;
}
