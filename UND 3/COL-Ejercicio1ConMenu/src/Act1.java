import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Act1 {
    private ArrayList<Integer> numbers;

    public Act1(){
        this.numbers = new ArrayList<Integer>();
    }

    // Case 1: insertElement().
    public void insertElement(){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean numberOK = false;

        do{

            try {
                System.out.print("Enter a number to insert: ");
                number = sc.nextInt();
                numberOK = true;
                
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }while (!numberOK);
        this.numbers.add(Integer.valueOf(number));
    }

    // Case 2: removeElement().
    public void removeElement(){

        if( this.numbers.isEmpty() ){
            System.out.println("The list is empty.");
            return;
        }

        this.listElement();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to delete: ");
        int element = sc.nextInt();

        if( this.numbers.remove(Integer.valueOf(element)) ){
            System.out.println("The element " + element + " deleted.");
        }
        else{
            System.out.println("The element " + element + " doesn't exists.");
        }

    }

    // Case 3: searchElement().
    public void searchElement(){

        if( this.numbers.isEmpty() ){
            System.out.println("The list is empty.");
            return;
        }

        this.listElement();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to search: ");
        int element = sc.nextInt();

        int index = this.numbers.indexOf(Integer.valueOf(element));
        if( index >= 0 ){
            System.out.println("The element " + element + " is in the position " + index);
        }
        else {
            System.out.println("The element " + element + " is not in the list.");
        }
    }

    // Case 4: modifyElement().
    public void modifyElement(){
        if( this.numbers.isEmpty() ){
            System.out.println("The list is empty.");
            return;
        }

        this.listElement();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to replace: ");
        int element = sc.nextInt();

        int index = this.numbers.indexOf(element);
        if( index >= 0 ){
            System.out.print("Enter the new element: ");
            int newValue = sc.nextInt();
            this.numbers.set(index, Integer.valueOf(newValue));
        }
        else{
            System.out.println("The element " + element + " is not in the list.");
        }
    }

    // Case 5: listElement().
    public void listElement(){

        System.out.println("The currents elements in the list:");
        /*
        for( Integer i : this.numbers ){
            System.out.print(i + " ");
        }
        */

        Iterator<Integer> elements = this.numbers.iterator();
        while (elements.hasNext()){
            System.out.print(elements.next() + " ");
        }
        System.out.println();

        /*
        for( int i = 0; i < numbers.size(); i++ ){
            System.out.println(numbers.get(i));
        }
        */

        /*
        Integer[] array = new Integer[this.numbers.size()];
        this.numbers.toArray(array);

        for( int i = 0; i < array.length; i++ ){
            System.out.print(array[i] + " ");
        }
        */
    }
}
