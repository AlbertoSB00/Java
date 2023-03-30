import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Act12 act12 = new Act12();

        if( act12.addPerson(new Person("Alberto", LocalDate.of(2000,11,12)), 0) ){
            System.out.println("The new person has been added in the array.");
        }
        else{
            System.out.println("The position in the array is taken.");
        }

        if( act12.addPerson(new Person("Juan", LocalDate.of(2001, 9, 23)), 1) ){
            System.out.println("The new person has been added in the array.");
        }
        else {
            System.out.println("The position in the array is taken.");
        }

        Person p = act12.getPerson(1);
        if( p != null ){
            System.out.println(p);
        }
    }
}