/*
 Escribir un programa que rellene por teclado un vector de 1000 números aleatorios entre 0 y 1000. Al final tiene que mostrar el elemento mayor, el menor y cuantas veces se repiten cada uno.
*/
public class Act8 {
    // Properties.
    private int[] numbers;

    // Static properties.
    public static final int NUMBERS = 1000;

    // Constructor.
    public Act8(){
        numbers = new int[Act8.NUMBERS];
        this.fillArray();
    }

    // Get & Set Methods.

    // Other Methods.
    public void fillArray(){
        for( int i = 0; i < numbers.length; i++ ){
            numbers[i] = (int) (Math.random() * Act8.NUMBERS);
        }
    }

    public void showArray(){
        for( int i = 0; i < numbers.length; i++ ){
            System.out.print(numbers[i] + " - ");
        }
    }

    public void highestNumber(){
        int highest = 0;

        for( int i = 0; i < numbers.length; i++ ){
            if( numbers[i] > highest ){
                highest = numbers[i];
            }
        }
        System.out.println("The highest number is " + highest);
    }

    public void lowestNumber(){
        int lowest = 1000;

        for( int i = 0; i < numbers.length; i++ ){
            if( numbers[i] < lowest ){
                lowest = numbers[i];
            }
        }
        System.out.println("The lowest number is " + lowest);
    }

    public void howManyTimes(){
        String numbersString = "";

        for( int i = 0; i < numbers.length; i++ ){
            numbersString = numbers[i] + " - ";
        }

        for( int i = 0; i < numbers.length; i++ ){

        }
    }
}
