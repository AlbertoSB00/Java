public class WorkingWithArrays {

    // Properties.
    private int minValue;
    private int maxValue;

    // Constructor.
    public WorkingWithArrays(int minValue, int maxValue){
        if( minValue < maxValue ){
            this.minValue = minValue;
            this.maxValue = maxValue;
        }
        else {
            this.minValue = maxValue;
            this.maxValue = minValue;
        }
    }

    // Get & Set Method.

    // int minValue.
    public int getMinValue(){ return this.minValue; }
    public void setMinValue( int minValue ){ this.minValue = minValue; }

    // int maxValue.
    public int getMaxValue(){ return this.maxValue; }
    public void setMaxValue( int maxValue ){ this.maxValue = maxValue; }

    // Other Methods.

    public void fillArray(int[] array){
        for( int i = 0; i < array.length; i ++ ){
            array[i] = (int) (Math.random() * (this.maxValue - this.minValue) + minValue);
        }
    }

    public void replace(int source, int newValue){
        if( newValue >= this.minValue && newValue <= maxValue ){
            source = newValue;
        }
        else{
            System.out.println("The new value is not within the range.");
        }
    }

    public void replace(int[] array, int position, int newValue){
        if( newValue >= this.minValue && newValue <= maxValue ){
            array[position] = newValue;
        }
        else {
            System.out.println("The new value is not within the range.");
        }
    }

    public float calculateTheAverage(int[] array){
        float average = 0;
        for( int i = 0; i < array.length; i++){
            average += array[i];
        }

        return average /= array.length;
    }

    public int minValue(int[] array){
        int min = array[0];

        for( int i = 1; i < array.length; i++){
            if( array[i] < min ){
                min = array[i];
            }
        }

        return min;
    }

    public int maxValue(int[] array){
        int max = array[0];

        for( int i = 1; i < array.length; i++){
            if( array[i] > max ){
                max = array[i];
            }
        }

        return max;
    }

    // toString() Method.
    public String toString(){
        return "- MinValue: " + this.minValue + "\n" +
               "- MaxValue: " + this.maxValue + "\n";
    }

    // clone() Method.
}
