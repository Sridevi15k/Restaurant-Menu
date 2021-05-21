package restaurant;

//import java.util.HashMap;
//import java.util.Scanner;

public class Restaurant {
    //static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Chilli Chicken", "Appetizer", 12);
        MenuItem item2 = new MenuItem("Baby Corn Majestic", "Appetizer", 10);
        MenuItem item3 = new MenuItem("Lamb Chops", "Appetizer", 14);
        MenuItem item4 = new MenuItem("Chicken Biryani", "Entree", 14);
        MenuItem item5 = new MenuItem("Veggie Delight", "Entree", 8);
        MenuItem item6 = new MenuItem("Chicken Alfredo", "Entree", 14);
        MenuItem item7 = new MenuItem("Tiramisu", "Dessert", 6);
        MenuItem item8 = new MenuItem("Baklava", "Dessert", 5);
        MenuItem item9 = new MenuItem("Butter Cake", "Dessert", 4);

        Menu menu = new Menu();

        System.out.println("Adding Menu Items:");
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);
        menu.addMenuItem(item4);
        menu.addMenuItem(item5);
        menu.addMenuItem(item6);
        menu.addMenuItem(item7);
        menu.addMenuItem(item8);
        menu.addMenuItem(item9);

        System.out.println("\nListing Menu Items:");
        menu.listAllItems();

        System.out.println("\nRemoving Menu Item with name '" + item3.getName() + "'");
        menu.removeMenuItem(item3.getName());

        System.out.println("\nListing Menu Items after remove:");
        menu.listAllItems();

        System.out.println("\nFinding Menu Item with name '" + item5.getName() + "'");
        System.out.println(menu.findMenuItem(item5.getName()));

        // If 2 menu items are equal
        //menu.itemsEqual();

    }
}
