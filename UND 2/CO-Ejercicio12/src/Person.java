import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName(){ return this.name; }
    public void setName( String name ){ this.name = name; }

    public LocalDate getBirthDate(){ return this.birthDate; }
    public void setBirthDate( LocalDate birthDate ){ this.birthDate = birthDate; }

    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        return "Person: " + this.name + " " + this.birthDate.format(dtf);
    }
}
