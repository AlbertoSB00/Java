import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaring an array.
        int numbers[] = new int[10];

        // Accessing to the third element of the array.
        numbers[2] = 8;
        System.out.println("The third element is: " + numbers[2]);

        // We can go through the array with a for loop.
        for( int i = 0; i < numbers.length; i++ ){
            numbers[i] = (int) (Math.random() * 100);
        }

        for( int i =0; i < numbers.length; i++ ){
            System.out.println("Element " + i + ": " + numbers[i]);
        }

        // Array length -> Number of elements in the array.
        // Array dimension -> Number of indexes necessary to access an element.

        // Second way to declare an array. With [] after the data type.
        String[] names = new String[5];
        names[0] = "María";
        names[1] = "Rafael";
        names[2] = "Alberto";
        names[3] = "Juan";
        names[4] = "Mitosis1332";

        for( int i = 0; i < names.length; i++ ){
            System.out.println("The name " + i + " is: " + names[i]);
        }

        // Third way to declare an array: Static declaration.
        double heights[] = { 1.95, 1.56, 1.76, 2.05, 1.85 };

        for( int i = 0; i < heights.length; i++ ){
            System.out.println("The height " + i + " is: " + heights[i]);
        }

        // Bidimensional arrays or matrix.
        float matrix[][] = new float[5][4];

        // The outer for loop goes through the rows of the matrix.
        for( int i = 0; i < 5; i++ ){
            // The inner for loop goes through the columns in a row.
            for( int j = 0; j < 4; j++ ){
                matrix[i][j] = (float) (Math.random() * 10);
                System.out.println("Element " + i + "," + j + ": " + matrix[i][j]);
            }
        }

        System.out.println("-----------------------------------------------------------------------------");

        matrix = new float[5][];
        matrix[0] = new float[4];
        matrix[1] = new float[4];
        matrix[2] = new float[4];
        matrix[3] = new float[4];
        matrix[4] = new float[4];

        for( int i = 0; i < 5; i++ ){
            // The inner for loop goes through the columns in a row.
            for( int j = 0; j < 4; j++ ){
                matrix[i][j] = (float) (Math.random() * 10);
                System.out.println("Element " + i + "," + j + ": " + matrix[i][j]);
            }
        }

        System.out.println("-----------------------------------------------------------------------------");

        // Static declaration for a matrix.
        int[][] staticMatrix ={ { 9, 4, 0, 1 },
                { 7, 2, 5, 9 },
                { 1, 4, 6, 2 }
        };

        for( int i = 0; i < staticMatrix.length; i++ ){
            for( int j = 0; j < staticMatrix[i].length; j++ ){
                System.out.println("Element " + i + "," + j + ": " + staticMatrix[i][j]);
            }
        }
    }
}