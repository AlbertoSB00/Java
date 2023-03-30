import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeList {
    private TreeSet<Employee> employee;

    public EmployeeList(){
        employee = new TreeSet<Employee>(new EmployeeComparator());
    }

    // Case 1: insertEmployee().
    public void insertEmployee(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the department: ");
        String department = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        boolean goodDate = true;
        LocalDate birthDate = null;

        do{
            System.out.print("Enter the birthdate: ");
            String date = sc.nextLine();
            try{
                birthDate = LocalDate.parse(date, dtf);
                goodDate = true;
            }
            catch (DateTimeParseException dtpe){
                System.out.println("The date " + date + " is wrong...");
                goodDate = false;
            }
        } while ( !goodDate );

        if( this.employee.add(new Employee(name, department, birthDate)) ){
            System.out.println("The employee has been added.");
        }
        else {
            System.out.println("The employee is already in the list.");
        }
    }

    // Case 2: removeEmployee().
    public void removeEmployee(){
        this.listEmployee();

        Scanner sc = new Scanner(System.in);
        Employee toRemove = null;
        int number;

        do{
            System.out.print("Enter the number of employee to remove: ");
            number = sc.nextInt();

            if( number < 1 || number > this.employee.size() ){
                System.out.println("The number is wrong. Try it again...");
            }
        }while( number < 1 || number > this.employee.size() );

        Iterator<Employee> iterator = this.employee.iterator();
        int i = 1;
        while( iterator.hasNext() && i <= number ){
            toRemove = iterator.next();
            i++;
        }

        this.employee.remove(toRemove);
    }

    // Case 3: searchEmployee().
    public boolean searchEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee to search: ");
        String fullName = sc.nextLine();

        for( Employee e : this.employee ){
            if( e.getFullName().equalsIgnoreCase(fullName) ){
                System.out.println(fullName + " is in the list.");
                return true;
            }
            else{
                System.out.println(fullName + " is not in the list.");
            }
        }
        return false;
    }

    // Case 4: replaceElement().
    public void replaceElement(){
        System.out.println("Choose the employee to replace: ");
        this.removeEmployee();

        System.out.println("Insert the substitute employee: ");
        this.insertEmployee();
    }

    // Case 5: listEmployee().
    public void listEmployee(){
        Iterator<Employee> iterator = this.employee.iterator();
        while (iterator.hasNext() ){
            System.out.println("=============================");
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
    }
}
