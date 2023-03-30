import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Act5 {

    // Properties.
    private LocalDate[] dates;

    // Static properties.
    public static final int LENGTH = 5;

    // Constructor.
    public Act5(){
        dates = new LocalDate[Act5.LENGTH];

        dates[0] = LocalDate.of(2000, 2, 20);
        dates[1] = LocalDate.of(2025, 7, 21);
        dates[2] = LocalDate.of(1990, 12, 1);
        dates[3] = LocalDate.of(2012, 1, 15);
        dates[4] = LocalDate.of(2055, 8, 17);
    }

    // Other Methods.
    public void showDates(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        for( int i = 0; i < Act5.LENGTH; i++ ){
            System.out.println("Date " + i + ": " + this.dates[i].format(dtf));
        }
    }

    public LocalDate oldestDate(){
        LocalDate oldest = dates[0];
        for( int i = 1; i < Act5.LENGTH; i++ ){
            if( oldest.isAfter(dates[i]) ){
                oldest = dates[i];
            }
            if( dates[i].isBefore(oldest) ){
                oldest = dates[i];
            }
        }
        return oldest;
    }

    public LocalDate mostRecentDate(){
        LocalDate mostRecent = dates[0];
        for( int i = 1; i < Act5.LENGTH; i++ ){
            if( mostRecent.isBefore(dates[i]) ){
                mostRecent = dates[i];
            }
            if( dates[i].isAfter(mostRecent) ){
                mostRecent = dates[i];
            }
        }
        return mostRecent;
    }

    public void fillDates(){
        String[] formats = { "d-M-yyyy", "d/M/yyyy", "M-d-yyyy", "M/d/yyyy" };
        Scanner sc = new Scanner(System.in);

        int i = 0;

        do{
            System.out.print("Enter a date " + i + " in format d-M-yyyy, d/M/yyyy, M-d-yyyy, M/d/yyyy: ");
            String date = sc.next();

            int j = 0;
            boolean goodDate = false;

            while( j < formats.length && !goodDate ){
                try{
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formats[j]);
                    dates[i] = LocalDate.parse(date,dtf);
                    goodDate = true;
                }
                catch ( DateTimeParseException dtpe){
                    System.out.println("Format: " + formats[j] + " doesn't fit to the entered date...");
                    j++;
                }
            }

            if( goodDate ){
                i++;
            }
            else {
                System.out.println("Please, just fit to the date format.");
                System.out.println("It could be d-M-yyyy, d/M/yyyy, M-d-yyyy, M/d/yyyy");
            }
        }while ( i < Act5.LENGTH );
    }
}
