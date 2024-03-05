import java.util.Scanner;

public class ShoppingList {
    private GroceryListManager glm;
    private Scanner scanner;

    public ShoppingList(){
        glm = new GroceryListManager();
        scanner = new Scanner(System.in);
    }

    public void addItems(){
        while(true){
            System.out.println("1. Add to list, 2. Add to list with cost, 3. Add to list with category, 4. Add to list with quantity, 5. Exit.");
            int nro = Integer.parseInt(scanner.nextLine());
            if(nro == 1){
                System.out.println("Give item");
                String item = scanner.nextLine();
                glm.addItem(item);
            } else if (nro == 2) {
                System.out.println("Give item and cost");
                String item = scanner.nextLine();
                double cost = Double.parseDouble(scanner.nextLine());
                glm.addItem(item, cost);
            } else if (nro == 3) {
                System.out.println("Give item and category");
                String item = scanner.nextLine();
                String cat = scanner.nextLine();
                glm.addItemWithCategory(item, cat);
            } else if (nro == 4) {
                System.out.println("Give item and quantity");
                String item = scanner.nextLine();
                int quantity = Integer.parseInt(scanner.nextLine());
                glm.addItem(item, quantity);
            } else if (nro == 5) {
                break;
            }else{
                System.out.println("Give proper command.");
            }
        }
    }

    public void removeItem(){
        System.out.println("Give item");
        String item = scanner.nextLine();
        glm.removeItem(item);
    }

    public void displayList(String category){
        glm.displayList();
        glm.displayAvailableItems();
        glm.displayByCategory(category);
    }
}
