import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];

        for( int i = 0; i < names.length; i++ ){
            System.out.print("Enter the name " + i + ": ");
            names[i] = sc.nextLine();
        }

        System.out.print("Enter the name you are looking for: ");
        String nameToFind = sc.nextLine();
        int howManyTimes = 0;

        for( int i = 0; i < names.length; i++ ){
            if( names[i].equalsIgnoreCase(nameToFind) ){
                howManyTimes++;
                System.out.println("The name is in the position " + i);
            }
        }

        System.out.println("The name " + nameToFind + " is " + howManyTimes + " times in the array.");

    }
}