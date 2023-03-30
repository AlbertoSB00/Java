import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        int result = e1.getDepartment().compareTo(e2.getDepartment());

        if( result == 0 ){
            result = e1.getFullName().compareTo(e2.getFullName());
        }
        return result;
    }
}
