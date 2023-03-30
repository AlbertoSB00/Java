import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;

public class StudentList {
    private HashMap<String, Student> studentList;

    public StudentList() {
        this.studentList = new HashMap<String, Student>();
    }

    public void insertStudent(Student st){
        Student previous = this.studentList.put(st.getIdCard(), st);
        if( previous == null ){
            System.out.println("The element " + st + " is new.");
        }
        else{
            System.out.println(previous + " has been replaced.");
        }
    }

    public void removeStudent(){
        Student st = this.searchStudentIdCard();

        if( st != null ){
            this.studentList.remove(st.getIdCard());
            System.out.println("The student removed is " + st);
        }
    }

    public Student searchStudentIdCard(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student ID card: ");
        String idCard = sc.nextLine();
        Student st = null;

        if( this.studentList.containsKey(idCard) ){
            st = this.studentList.get(idCard);
            System.out.println(st);
        }
        else{
            System.out.println("The student with ID card " + idCard + " doesn't exists...");
        }

        return st;
    }

    public void searchStudent(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        LocalDate birthDate = getDate("Enter the birthdate: ");

        boolean goodDate = false;

        ArrayList<Student> al = new ArrayList<Student>(this.studentList.values());
        Iterator<Student> iterator = al.iterator();

        int howMany = 0;

        while(iterator.hasNext()){
            Student st = iterator.next();

            if(st.getFullName().toUpperCase().contains(name.toUpperCase()) && st.getBirthDate().isEqual(birthDate) ){
                ++howMany;
                System.out.println(st);
            }
        }
        System.out.println("There are " + howMany + " students.");
    }

    public void modifyStudent(){
        Student st = searchStudentIdCard();
        Scanner sc = new Scanner(System.in);

        if( st != null ){
            System.out.println("Student to modify: " + st);

            System.out.print("Enter the ID Card: ");
            String idCard = sc.nextLine();

            System.out.print("Enter the name: ");
            String name = sc.nextLine();

            LocalDate birthDate = this.getDate("Enter the birthdate: ");

            if( st.getIdCard().equals(idCard) ){
                this.studentList.put(idCard, new Student(idCard, name, birthDate));
            }
            else{
                this.studentList.remove(st.getIdCard());
                this.studentList.put(idCard, new Student(idCard, name, birthDate));
            }
        }
    }

    private LocalDate getDate(String title){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        Scanner sc = new Scanner(System.in);
        LocalDate date = null;
        boolean goodDate = false;

        do{
            System.out.print(title);
            String inputDate = sc.nextLine();

            try{
                date = LocalDate.parse(inputDate, dtf);
                goodDate = true;
            }catch (DateTimeParseException dtpe){
                System.out.println(dtpe.getMessage());
            }

        }while( !goodDate );

        return date;
    }

    public void listStudent(){
        Iterator<Student> iterator = this.studentList.values().iterator();
        while(iterator.hasNext() ){
            System.out.println(iterator.next());
        }

        System.out.println("There are " + this.studentList.size() + " students.");

    }

    public void listStudentWithKeys(){
        Set<Map.Entry<String,Student>> list = this.studentList.entrySet();
        Iterator<Map.Entry<String,Student>> iterator = list.iterator();

        System.out.println("List of student with entrySet(): ");
        while( iterator.hasNext() ){
            Map.Entry<String,Student> student = iterator.next();
            String key = student.getKey();
            Student value = student.getValue();
            System.out.println("Key: " + key + ", value: " + value);
        }
    }
}
