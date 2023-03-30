import java.util.Random;

public class Act7 {
    private int[] numbers;

    public Act7( int[] numbers ){
        this.numbers = numbers;
    }

    public Act7(){
        this.numbers = new int[100];

        Random r = new Random(System.currentTimeMillis());
        for( int i = 0; i < numbers.length; i++ ){
            numbers[i] = r.nextInt();
        }
    }

    public void findOutNumbers(){
        int positive = 0, negative = 0, odd = 0, even = 0;

        for( int i = 0; i < numbers.length; i++ ){
            if( this.numbers[i] % 2 == 0 ){
                even++;
            }
            else {
                odd++;
            }

            if( this.numbers[i] > 0 ){
                positive++;
            }
            else {
                negative++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Odd numbers: " + odd);
        System.out.println("Even numbers: " + even);
    }
}
