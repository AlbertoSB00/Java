/*
Escribir un programa que rellene un vector de 100 números enteros aleatorios y al final visualice cuantos son negativos, cuantos positivos, cuantos son pares y cuantos son impares.
*/

public class Act7 {
    // Properties.
    private int[] numbers;

    // Static properties.
    public static final int NUMBERS = 100;

    // Constructor.
    public Act7(){
        numbers = new int[Act7.NUMBERS];
        this.fillArray();
    }

    // Get & Set Methods.

    // Other Methods.
    public void fillArray(){
        for( int i = 0; i < numbers.length; i++ ){
            numbers[i] = (int) (Math.random() * Act7.NUMBERS);
        }
    }

    public void showArray(){
        for( int i = 0; i < numbers.length; i++ ){
            System.out.print(numbers[i] + " - ");
        }
    }

    public void negativeNumber(){
        int counter = 0;

        for( int i = 0; i < numbers.length; i++ ){
            if( numbers[i] < 0 ){
                counter++;
            }
        }
        System.out.println("The are " + counter + " negative numbers.");
    }

    public void positiveNumber(){
        int counter = 0;

        for( int i = 0; i < numbers.length; i++ ){
            if( numbers[i] > 0 ){
                counter++;
            }
        }
        System.out.println("The are " + counter + " positive numbers.");
    }

    public void evenNumber(){
        int counter = 0;

        for( int i = 0; i < numbers.length; i++ ){
            if( numbers[i] % 2 == 0 ){
                counter++;
            }
        }
        System.out.println("The are " + counter + " even numbers.");
    }

    public void oddNumber(){
        int counter = 0;

        for( int i = 0; i < numbers.length; i++ ){
            if( numbers[i] % 2 != 0 ){
                counter++;
            }
        }
        System.out.println("The are " + counter + " odd numbers.");
    }
}
