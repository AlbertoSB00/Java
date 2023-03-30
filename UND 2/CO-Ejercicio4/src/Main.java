public class Main {
    public static void main(String[] args) {

        // Creamos la matriz.
        float matriz[][] = new float[15][10];

        // Contador para sumas los elementos de las filas.
        float contador = 0;

        // Inicializamos el bucle de las filas.
        for( int i = 0; i < 15; i++ ){

            // Inicializamos el bucle de las columnas.
            for( int j = 0; j < 10; j++){
                matriz[i][j] = (float) (Math.random() * 100);

                // Sumamos los elementos al contador.
                contador += matriz[i][j];

                System.out.println("Elemento " + i + "," + j + ": " + matriz[i][j]);
            }
        }
        System.out.println("La suma de todos los elementos es de: " + contador);
    }
}