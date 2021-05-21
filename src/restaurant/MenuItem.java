package restaurant;

//import java.util.Date;

public class MenuItem {
    private int itemID;
    private final String name;
    private final double price;
    private final String category; //appetizers, entrees or desserts
    private String description;
    //private boolean newItem;
    //private Date updatedItem;

    public MenuItem(String name, String category, double price, String description) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    public MenuItem(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }


/*public static Boolean isItemNew() {

}*/

/*public static Date dateItemUpdated() {

}*/

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MenuItem: ");
        sb.append("name = ").append(name);
        sb.append(", price = ").append(price);
        sb.append(", category = ").append(category);
        /*sb.append(", description='").append(description).append('\'');
        sb.append(", newItem=").append(newItem);
        sb.append(", updatedItem=").append(updatedItem);*/
        return sb.toString();
    }

}