import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[][] programmingMarks = new float[2][3];

        Scanner sc = new Scanner(System.in);
        sc.useLocale( new Locale("es-ES") );

        for( int i = 0; i < programmingMarks.length; i++ ){
            for( int j = 0; j < programmingMarks[i].length; j++ ){
                System.out.print("Enter the mark " + i + "," + j + ": ");
                programmingMarks[i][j] = sc.nextFloat();
            }
        }

        Act10 act10 = new Act10(programmingMarks);
        act10.showMarks();

        // act10.averageMark();
        float[] average = act10.averageMark();
        System.out.println("The average mark in first term is " + average[0] + " and the one in second term is " + average[1]);

        // act10.minMark();
        float[] minMark = act10.minMark();
        System.out.println("The min mark in first term is " + minMark[0] + " and the one in second term is " + minMark[1]);

        // act10.maxMark();
        float[] maxMark = act10.maxMark();
        System.out.println("The max mark in first term is " + maxMark[0] + " and the one in second term is " + maxMark[1]);
    }
}