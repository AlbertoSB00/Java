import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ItemList {
    TreeMap<String,Item> itemList;

    public ItemList(){
        this.itemList = new TreeMap();
    }

    public void insertItem(String reference, Item it){
        this.itemList.put(reference, it);
    }

    public Item searchItem(){
        Scanner sc = new Scanner(System.in);
        String reference;
        System.out.print("Enter the reference: ");
        reference = sc.nextLine();

        Item it = this.itemList.get(reference);

        if( it != null ){
            System.out.println("Ref: " + reference + " " + it);
        }
        else{
            System.out.println("The item with reference " + reference + " doesn't exists...");
        }

        return it;
    }

    public void listItems(){
        Set<Map.Entry<String,Item>> items = this.itemList.entrySet();

        for( Map.Entry<String, Item> en : items ){
            String ref = en.getKey();
            Item it = en.getValue();
            System.out.println("Ref:  " + ref + ": " + it);
        }
    }
}
