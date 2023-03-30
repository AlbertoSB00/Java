import java.util.Scanner;
import java.util.TreeSet;

public class Act3 {
    // Propiedad (ArrayList/HashSet/TreeSet/TreeMap/HashMap).
    private TreeSet<String> names;

    // Constructor.
    public Act3(){
        this.names = new TreeSet<String>();
    }

    // Case 1: insertElement().
    public void insertElement(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String fullName = sc.nextLine();

        this.names.add(fullName);
    }

    // Case 2: removeElement().
    public void removeElement(){
        if( this.names.isEmpty() ){
            System.out.println("The list is empty.");
            return;
        }

        this.listElement();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name to delete: ");
        String nameToRemove = sc.nextLine();

        if( this.names.remove(nameToRemove) ){
            System.out.println(nameToRemove + " was removed from the list.");
        }
        else{
            System.out.println(nameToRemove + " doesn't exists in the list.");
        }
    }

    // Case 3: searchElement().
    public void searchElement(){
        if( this.names.isEmpty() ){
            System.out.println("The list is empty.");
            return;
        }

        this.listElement();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to search: ");
        int element = sc.nextInt();

        // POR ACABAR.
    }

    // Case 4: modifyElement().
    public void modifyElement(){
        if( this.names.isEmpty() ){
            System.out.println("The list is empty.");
            return;
        }

        this.listElement();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to replace: ");
        String nameToReplace = sc.nextLine();

        // POR ACABAR.
    }

    // Case 5: listElement().
    public void listElement(){
        if( this.names.isEmpty() ){
            System.out.println("The list is empty.");
            return;
        }

        System.out.println("The names in the list are:");
        for( String i : this.names ){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
