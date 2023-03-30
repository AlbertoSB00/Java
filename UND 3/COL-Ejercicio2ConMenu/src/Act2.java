import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Act2 {
    private HashSet<String> countries;

    public Act2(){
        this.countries = new HashSet<String>();
    }

    // Case 1: insertElement().
    public void insertElement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the country: ");
        String county = sc.nextLine();

        if( !this.countries.add(county) ){
            System.out.println("The county already exists in the list.");
        }
    }

    // Case 2: deleteElement().
    public void removeElement(){
        if( this.countries.isEmpty() ){
            System.out.println("The list is empty.");
            return;
        }

        this.listElement();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the country to delete: ");
        String country = sc.nextLine();

        if( this.countries.remove(country) ){
            System.out.println("The country " + country + " has been removed.");
        }
        else{
            System.out.println("The country " + country + " doesn't exists in the list.");
        }
    }

    // Case 3: searchElement().
    public String searchElement(){
        if( this.countries.isEmpty() ){
            System.out.println("The list is empty.");
            return null;
        }

        String country = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the country to look for: ");
        String c = sc.nextLine();

        if( this.countries.contains(c) ){
            ArrayList<String> copyCountries = new ArrayList<String>();
            copyCountries.addAll(countries);

            int index = copyCountries.indexOf(c);
            country = copyCountries.get(index);
        }
        else{
            System.out.println("The country " + c + " doesn't exists in the list.");
        }
        return country;
    }

    // Case 4: modifyElement().
    public String modifyElement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the old country to replace: ");
        String oldCountry = sc.nextLine();

        if( this.countries.contains(oldCountry) ){
            String newCountry;
            do{
                System.out.print("Enter the new country: ");
                newCountry = sc.nextLine();
                if( this.countries.contains(newCountry) ){
                    System.out.println("The country " + newCountry + " is in the list.");
                    System.out.println("Try it again...");
                }

            }while ( this.countries.contains(newCountry) );
            this.countries.remove(oldCountry);
            this.countries.remove(newCountry);
        }
        else{
            oldCountry = null;
        }

        return oldCountry;
    }

    // Case 5: listElement().
    public void listElement(){
        System.out.println("The currents elements in the list:");

        Iterator<String> elements = this.countries.iterator();
        while (elements.hasNext()){
            System.out.print(elements.next() + ", ");
        }
        System.out.println();
    }
}
