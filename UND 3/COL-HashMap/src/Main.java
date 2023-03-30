import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String[] options = { "1.- Insert a new student.",
                             "2.- Remove a student.",
                             "3.- Search a student by ID Card.",
                             "4.- Search a student by its data.",
                             "5.- Modify a student.",
                             "6.- List students.",
                             "7.- List student with keys." };

        StudentList studentList = new StudentList();
        studentList.insertStudent(new Student("30A", "Alberto Sánchez Barona", LocalDate.of(2000, 11, 12)));
        studentList.insertStudent(new Student("31B", "Juan Castro Blancat", LocalDate.of(2001, 9, 24)));
        studentList.insertStudent(new Student("32C", "Javier Menchero del Val", LocalDate.of(2004, 11, 24)));
        studentList.insertStudent(new Student("33D", "Gonzalo Galindo Kushlalov ", LocalDate.of(2001, 3, 16)));

        Menu menu = new Menu(options, "- Students management menu -");
        int option = 0;

        do{
            option = menu.showMenu();
            switch (option){
                case 0:{
                    System.out.println("Exiting...");
                    break;
                }
                case 2:{
                    studentList.removeStudent();
                    break;
                }
                case 3:{
                    studentList.searchStudentIdCard();
                    break;
                }
                case 4:{
                    studentList.searchStudent();
                    break;
                }
                case 5:{
                    studentList.modifyStudent();
                    break;
                }
                case 6:{
                    studentList.listStudent();
                    break;
                }
                case 7:{
                    studentList.listStudentWithKeys();
                    break;
                }
            }
        }while( option != 0 );
    }
}