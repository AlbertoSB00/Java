import java.util.Arrays;

public class Act8 {
    private int[] numbers;

    public Act8(){
        this.numbers = new int[1000];

        for( int i = 0; i < numbers.length; i++ ){
            this.numbers[i] = (int) (Math.random() * 1000);
        }
    }

    public void findHighest(){
        int highest = this.numbers[0];
        int howMany = 1;

        for( int i = 1; i < numbers.length; i++ ){
            if( this.numbers[i] > highest ){
                highest = this.numbers[i];
                howMany = 1;
            }
            else if( this.numbers[i] == highest ){
                howMany++;
            }
        }

        System.out.println("The highest is: " + highest);
        System.out.println("and it is " + howMany + " times.");
    }

    public void findLowest(){
        int lowest = this.numbers[0];
        int howMany = 1;

        for( int i = 1; i < numbers.length; i++){
            if( this.numbers[i] < lowest ){
                lowest = this.numbers[i];
                howMany = 1;
            }
            else if ( this.numbers[i] == lowest ) {
                howMany++;
            }
        }
        System.out.println("The highest is: " + lowest);
        System.out.println("and it is " + howMany + " times.");
    }

    public void findHighestLowest(){
        // We sort the array.
        Arrays.sort(this.numbers);

        int i = 1;
        while( this.numbers[i] == this.numbers[0] ){
            i++;
        }

        // The array is sorted.
        System.out.println("The lowest is " + this.numbers[0]);
        System.out.println("and it is " + i + " times.");

        i = this.numbers.length - 2;
        int howMany = 1;

        while( this.numbers[i] == this.numbers.length - 1 ){
            howMany++;
            i--;
        }

        System.out.println("The highest is " + this.numbers[999]);
        System.out.println("and it is " + howMany + " times.");
    }
}
