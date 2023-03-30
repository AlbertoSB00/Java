import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CuentaBancaria {
    private ArrayList<MovimientoBancario> movimientoBancario;

    public CuentaBancaria(){
        movimientoBancario = new ArrayList<MovimientoBancario>();
    }

    // Case 1: insertarMB().
    public void insertMB(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el tipo de movimiento (Ingreso -> 1, Reintegro -> 2): ");
        int tipo = sc.nextInt();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        boolean fechaOK = true;
        LocalDate fecha = null;


        do{
            System.out.print("Introduzca la fecha del movimiento: ");
            String fechaPorTeclado = sc.nextLine();

            try{
                fecha = LocalDate.parse(fechaPorTeclado, dtf);
                fechaOK = true;

            }catch (DateTimeParseException dtpe){
                System.out.println("La fecha " + fechaPorTeclado + " no es válida...");
                fechaOK = false;
            }

        }while (!fechaOK);

        System.out.print("Introduzca el concepto: ");
        String concepto = sc.nextLine();

        System.out.print("Introduzca la cantidad: ");
        float cantidad = sc.nextFloat();

        if( this.movimientoBancario.add(new MovimientoBancario(tipo, fecha, concepto, cantidad)) ){
            System.out.println("Movimiento bancario añadido correctamente...");
        }
        else {
            System.out.println("Ha ocurrido un error con el movimiento bancario...");
        }
    }

    // Case 2: borrarMB().
    public void borrarMB(){
        this.listarMB();

        Scanner sc = new Scanner(System.in);
        MovimientoBancario aBorrar = null;
        int numero;

        do{
            System.out.print("Introduzca el número del movimiento bancario para borrarlo: ");
            numero = sc.nextInt();

            if( numero < 1 || numero > this.movimientoBancario.size() ){
                System.out.println("El número del movimiento bancario está mal, compruébelo e inténtelo de nuevo...");
            }
        }while( numero < 1 || numero > this.movimientoBancario.size() );

        Iterator<MovimientoBancario> iterator = this.movimientoBancario.iterator();
        int i = 1;
        while( iterator.hasNext() && i <= numero ){
            aBorrar = iterator.next();
            i++;
        }

        this.movimientoBancario.remove(aBorrar);
    }

    // Case 3: buscarMB().
    public boolean buscarMB(){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");

        System.out.print("Introduzca la fecha del movimiento para borrar: ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());

        for( MovimientoBancario mb : this.movimientoBancario ){
            if( mb.getFecha().equals(fecha) ){
                System.out.println("El movimiento bancario con fecha " + fecha + " está en la lista.");
                return true;
            }
            else{
                System.out.println("El movimiento bancario con fecha " + fecha + " no está en la lista.");            }
        }
        return false;
    }

    // Case 4: modificarMB().
    public void modificarMB(){
        System.out.println("Elige el movimiento bancario a reemplazar: ");
        this.borrarMB();

        System.out.println("Inserta el nuevo movimiento bancario sustituto: ");
        this.insertMB();
    }

    // Case 5: listarMB().
    public void listarMB(){
        Iterator<MovimientoBancario> iterator = this.movimientoBancario.iterator();
        while (iterator.hasNext() ){
            System.out.println("=============================");
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
    }
}