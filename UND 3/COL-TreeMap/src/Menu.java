import java.util.Scanner;

public class Menu {
    private String[] options;
    private String title;
    private int option;

    public Menu(String[] options, String title){
        this.options = options;
        this.title = title;
    }

    public int showMenu(){
        Scanner sc = new Scanner(System.in);
        int optionChosen = 0;

        do{
            System.out.println(this.title);
            for( String op : this.options ){
                System.out.println(op);
            }
            System.out.println("0.- EXIT");

            System.out.print("Enter your option: ");
            optionChosen = sc.nextInt();

            if( optionChosen < 0 || optionChosen > this.options.length ){
                System.out.println("The option chosen is wrong. Try it again...");
            }

        }while(optionChosen < 0 || optionChosen > this.options.length);

        return optionChosen;
    }
}
