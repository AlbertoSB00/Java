public class Main {
    public static void main(String[] args) {
        int[] vector = new int[10];

        WorkingWithArrays wwa1 = new WorkingWithArrays(3, 33);

        wwa1.fillArray(vector);

        for( int i = 0; i < vector.length; i++ ){
            System.out.println("Element " + i + ": " + vector[i]);
        }

        wwa1.replace(vector[2], 33);
        System.out.println("The element in position 2 is: " + vector[2]);

        wwa1.replace(vector, 2, 33);
        System.out.println("The element in position 2 is: " + vector[2]);

        float average = wwa1.calculateTheAverage(vector);
        System.out.println("The average is : " + average);

        int minValue = wwa1.minValue(vector);
        System.out.println("The min value is: " + minValue);

        int maxValue = wwa1.maxValue(vector);
        System.out.println("The max value is: " + maxValue);
    }
}