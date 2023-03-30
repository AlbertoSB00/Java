import java.util.Arrays;

public class Act10 {
    private float[][] marks;

    public Act10(float[][] marks){
        this.marks = marks;
    }

    public void showMarks(){
        for( int i = 0; i < this.marks.length; i++ ){
            for( int j = 0; j < this.marks[i].length; j++ ){
                System.out.println(this.marks[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*public void averageMark(){
        for( int i = 0; i < this.marks.length; i++ ){
            float average = 0;
            for( int j = 0; j < this.marks[i].length; j++ ){
                average += this.marks[i][j];
            }
            System.out.println("The average mark for the term " + i + " is " + (average/this.marks[i].length));
        }
    }*/

    public float[] averageMark(){
        float[] average = new float[2];
        Arrays.fill(average, 0);

        for( int i = 0; i < this.marks.length; i++ ){
            for( int j = 0; j < this.marks[i].length; j++ ){
                average[i] += marks[i][j];
            }
            average[i] /= this.marks[i].length;
        }

        return average;
    }

    public float[] minMark(){
        float[] min = new float[2];
        Arrays.fill(min, 0);

        for( int i = 0; i < this.marks.length; i++ ){
            for( int j = 0; j < this.marks[i].length; j++ ){

                if( marks[i][j] <= 10 ){
                    min[i] = marks[i][j];
                }
            }
        }

        return min;
    }

    public float[] maxMark(){
        float[] max = new float[2];
        Arrays.fill(max, 0);


        for( int i = 0; i < this.marks.length; i++ ){
            for( int j = 0; j < this.marks[i].length; j++ ){

                if( marks[i][j] >= 0 ){
                    max[i] = marks[i][j];
                }

            }
        }

        return max;
    }
}
