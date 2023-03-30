import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Act5 myDates = new Act5();
        myDates.showDates();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate oldest = myDates.oldestDate();
        System.out.println("The oldest date is: " + oldest.format(dtf));

        LocalDate mostRecent = myDates.mostRecentDate();
        System.out.println("The most recent date is: " + mostRecent.format(dtf));

        Period period = Period.between(oldest, mostRecent);
        System.out.println("The period of time between oldest date and most recent one is: " + period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days.");

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        myDates.fillDates();
        oldest = myDates.oldestDate();
        System.out.println("The oldest date is: " + oldest.format(dtf));

        mostRecent = myDates.mostRecentDate();
        System.out.println("The most recent date is: " + mostRecent.format(dtf));

        period = Period.between(oldest, mostRecent);
        System.out.println("The period of time between oldest date and most recent one is: " + period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days.");

    }
}