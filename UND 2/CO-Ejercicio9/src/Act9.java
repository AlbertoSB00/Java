
// Escribir un programa que rellene por teclado con números aleatorios una matriz de 20 filas por 50 columnas y rellene un vector de 50 elementos con la suma de las 50 columnas. Al final debe visualizar este vector.
public class Act9 {
    private int matriz[][];
    private int vector[];

    public Act9(){
        this.matriz = new int[20][50];
        this.vector = new int[50];
    }

    public void fillMatriz(){
        for( int i = 0; i < matriz.length; i++ ){
            for( int j = 0; j < matriz.length; i++ ){
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.println("Elemento " + i + "," + j + ": " + matriz[i][j]);
            }
        }
    }

    public void fillVector(){
        for( int i = 0; i < vector.length; i++ ){
            vector[i] = (int) (Math.random() * 100);
            System.out.println("Elemento " + i + ": " + vector[i]);
        }
    }
}
