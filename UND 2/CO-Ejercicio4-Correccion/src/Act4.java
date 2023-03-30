public class Act4 {

    // Properties.
    private int[][] numbers;

    // Static properties.
    public static final int ROWS = 15;
    public static final int COLUMNS = 10;

    // Constructor.
    public Act4(){
        numbers = new int[Act4.ROWS][Act4.COLUMNS];
        this.fillArray();
    }

    public Act4( int[][] numbers ){
        this.numbers = numbers;
    }

    // Get & Set Methods.

    // Other Methods.
    public void fillArray(){
        for( int i = 0; i < Act4.ROWS; i++ ){

            for( int j = 0; j < Act4.COLUMNS; j++ ){
                numbers[i][j] = (int) (Math.random() * 1000);
            }

        }
    }

    public void showArray(){
        for( int i = 0; i < Act4.ROWS; i++ ){

            for( int j = 0; j < Act4.COLUMNS; j++ ){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void additionRows(){
        for( int i = 0; i < Act4.ROWS; i++){
            int totalRow = 0;

            for(int j = 0; j < Act4.COLUMNS; j++){
                totalRow += numbers[i][j];
            }

            System.out.println("The total in the row " + i + " is: " + totalRow);
        }
    }

    // toString() Method.

    // cloneAct4() Method.

}
