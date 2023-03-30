import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // We create iban1 object.
        IBAN iban1 = null;
        try{
            iban1 = new IBAN("es0012345678901234567890", 1500f, 0.1f, LocalDate.of(2020, 12, 12));
            System.out.println(iban1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            iban1 = new IBAN("es0012345678901234567", 1500f, 0.1f, LocalDate.of(2020, 12, 12));
            System.out.println(iban1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        // We create iban2 object and clone.
        IBAN iban2 = iban1.cloneIBAN();
        System.out.println(iban2);

        // We create lr1 object.
        LoanRequest lr1 = null;
        try{
            lr1 = new LoanRequest(1, 500000f, LoanRequest.MORTGAGE, LocalDate.now(), '€', 360);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(lr1);

        NaturalPerson np1 = new NaturalPerson("30000034A", "María", "Pérez Pérez", true, 1500f, "23th Mayor Street St 15000", iban1, lr1);

        LoanRequest lr2 = null;
        Enterprise e1 = null;
        try{
            lr2 = new LoanRequest(2, 500000f, LoanRequest.ENTERPRISE, LocalDate.now(), '€', 60);
            e1 = new Enterprise("315", "Online Shop", Enterprise.PUBLIC_LIMITED_COMPANY, "Commerce", iban2, lr2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(np1);
        System.out.println(e1);

        // We calculate the customer valuation and the interest.
        np1.assignValuation();
        np1.interestCalculation();
        System.out.println(np1);

        e1.assignValuation();
        e1.interestCalculation();
        System.out.println(e1);
    }
}