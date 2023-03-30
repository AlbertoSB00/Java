import java.util.Arrays;

public class Act9 {
    private int[][] numbers;
    private int[] additions;

    public Act9(){
        this.numbers = new int[20][50];

        for( int i = 0; i < this.numbers.length; i++ ){
            for( int j = 0; i < this.numbers[i].length; i++ ){
                this.numbers[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public void getAdditions(){
        this.additions = new int[50];
        Arrays.fill(this.additions, 0);

        for( int j = 0; j < this.additions.length; j++ ){
            for( int i = 0; i < this.numbers.length; i++ ){
                this.additions[j] += this.numbers[i][j];
            }
        }
    }

    public void showMatrix(){
        for( int i = 0; i < this.numbers.length; i++ ){
            for( int j = 0; i < this.numbers[i].length; i++ ){
                System.out.println(this.numbers[i][j] + "-");
            }
            System.out.println();
        }
    }

    public void showVector(){
        for( int i = 0; i < this.additions.length; i++ ){
            System.out.println(this.additions[i] + "-");
        }
    }
}
