import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CuentaBancaria cuentaBancaria = new CuentaBancaria();

        int opcion = 0;

        do{
            System.out.println("|----------------------------------------|");
            System.out.println("| 1.- Insertar nuevo movimiento bancario |");
            System.out.println("| 2.- Eliminar movimiento bancario       |");
            System.out.println("| 3.- Buscar movimiento bancario         |");
            System.out.println("| 4.- Modificar movimiento bancario      |");
            System.out.println("| 5.- Listar movimientos bancarios       |");
            System.out.println("| 0.- SALIR                              |");
            System.out.println("|----------------------------------------|");

            System.out.print("Introduzca su opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 0:{
                    System.out.println("Saliendo del programa...");
                    break;
                }
                case 1:{
                    cuentaBancaria.insertMB();
                    break;
                }
                case 2:{
                    cuentaBancaria.borrarMB();
                    break;
                }
                case 3:{
                    cuentaBancaria.buscarMB();
                    break;
                }
                case 4:{
                    cuentaBancaria.modificarMB();
                    break;
                }
                case 5:{
                    cuentaBancaria.listarMB();
                    break;
                }
                default:{
                    System.out.println("La opción " + opcion + " no es válida, asegúrate de elegir entre el 0 y 5. Inténtelo de nuevo...");
                    continue;
                }
            }
        }while (opcion != 0);
    }
}