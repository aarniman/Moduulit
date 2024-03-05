import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GroceryListManager {
    public static void main(String[] args) {

        GroceryListManager glm = new GroceryListManager();
        glm.addItem("Apple");
        glm.addItem("Milk");
        glm.addItem("Bread");

        glm.checkItem("Milk");

        glm.removeItem("Milk");

    }
    private ArrayList<String> groceryList = new ArrayList<>();
    private Map<String, Double> costList = new HashMap<>();
    private Map<String, String> category = new HashMap<>();
    private Map<String, Integer> quantityList = new HashMap<>();

    public void addItem(String item){
        this.groceryList.add(item);
    }

    public void addItem(String item, double cost){
        this.costList.put(item, cost);

    }public void addItemWithCategory(String item, String category){
        this.category.put(item, category);
    }

    public void addItemWithQuantity(String item, int quantity){
        this.quantityList.put(item, quantity);
    }

    public void updateQuantity(String item, int newQuantity){
        this.quantityList.remove(item);
        this.quantityList.put(item, newQuantity);
    }

    public void removeItem(String item){
        System.out.println("Removing '" + item + "' from the list...");
        this.groceryList.remove(item);
    }

    public void displayList(){
        System.out.println("Grocery List");
        for (int i = 0; i < this.groceryList.size(); i++) {
            System.out.println(i+1 + ". " + this.groceryList.get(i));
        }
    }

    public void displayByCategory(String category){
        for(Map.Entry<String, String> entry: this.category.entrySet()){
            if(Objects.equals(entry.getKey(), category)){
                System.out.println(entry.getValue());
            }
        }
    }

    public void displayAvailableItems(){
        for(Map.Entry<String, Integer> entry: this.quantityList.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + " kpl.");
        }
    }

    public boolean checkItem(String item){
        System.out.println("Is " + item + " in the grocery list? ");
        return this.groceryList.contains(item);
    }

    public void calculateTotalCost(){
        double costs = 0;
        for (Map.Entry<String, Double> entry : this.costList.entrySet()) {
            costs += entry.getValue();
        }
        System.out.println("Total cost of the groceries is " + costs + " €");
    }
}


