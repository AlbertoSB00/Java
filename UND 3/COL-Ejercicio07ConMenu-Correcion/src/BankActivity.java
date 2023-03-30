import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class BankActivity {
    private char activityType;
    private LocalDate date;
    private String description;
    private float amount;

    public static final char DEPOSIT = 'D';
    public static final char WITHDRAW = 'W';

    public BankActivity(char activityType, LocalDate date, String description, float amount){
        this.activityType = activityType;
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public char getActivityType(){ return this.activityType; }
    public void setActivityType( char activityType ){ this.activityType = activityType; }

    public LocalDate getDate(){ return this.date; }
    public void setDate( LocalDate date ){ this.date = date; }

    public String getDescription(){ return this.description; }
    public void setDescription( String description ){ this.description = description; }

    public float getAmount(){ return this.amount; }
    public void setAmount( float amount ){ this.amount = amount; }

    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        return this.activityType + " " + this.date.format(dtf) + " " + this.description + " " + this.amount + " €";
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankActivity that = (BankActivity) o;

        if (Float.compare(that.amount, amount) != 0) return false;
        return Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (amount != +0.0f ? Float.floatToIntBits(amount) : 0);
        return result;
    }
    */


}
