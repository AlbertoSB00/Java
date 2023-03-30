import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// public class Employee implements Comparable<Employee> {
public class Employee{
    private String fullName;
    private String department;
    private LocalDate birthDate;

    public Employee(String fullName, String department, LocalDate birthDate){
        this.fullName = fullName;
        this.department = department;
        this.birthDate = birthDate;
    }

    public String getFullName(){ return this.fullName; }
    public void setFullName( String fullName ){ this.fullName = fullName; }

    public String getDepartment(){ return this.department; }
    public void setDepartment( String department ){ this.department = department; }

    public LocalDate getBirthDate(){ return this.birthDate; }
    public void setBirthDate( LocalDate birthDate ){ this.birthDate = birthDate; }

    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        return "Name: " + fullName + "\n" +
               "Department: " + department + "\n" +
               "Birth Date: " + birthDate.format(dtf);
    }

    /*
    @Override
    public int compareTo(Employee e){
        int result = this.department.compareTo(e.department);

        if( result == 0 ){
            result = this.fullName.compareTo(e.fullName);
        }

        return result;

        int result = 0;
        if( this.birthDate.isBefore(e.birthDate) ){
            result = -1;
        }
        if( this.birthDate.isAfter(e.birthDate) ){
            result = 1;
        }

        return result;
    }
    */
}
