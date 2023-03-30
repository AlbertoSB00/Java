import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // We create the scanner object.
        Scanner sc = new Scanner(System.in);

        // We create the array with 10 elements.
        float[] marks = new float[10];

        // We ask for elements with a for loop.
        for( int i = 0; i < marks.length; i++ ){
            System.out.print("Enter the mark " + i + ": ");
            marks[i] = sc.nextFloat();
        }

        float averageMark = 0;
        int passed = 0;
        int failed = 0;

        for( int i = 0; i < marks.length; i++ ){
            averageMark += marks[i];

            if( marks[i] >= 5 ){
                passed++;
            }
            else{
                failed++;
            }
        }

        averageMark /= marks.length;
        System.out.println("The average mark is: " + averageMark);
        System.out.println("There are " + passed + " passed marks and " + failed + " failed marks.");
    }
}