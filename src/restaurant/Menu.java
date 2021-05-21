package restaurant;

import java.util.ArrayList;


public class Menu {
    private ArrayList<MenuItem> menuItems;
    private ArrayList<MenuItem> newMenu;

    public Menu() {
        menuItems = new ArrayList<MenuItem>();
        newMenu = new ArrayList<MenuItem>();
    }

    public Menu(ArrayList<MenuItem> presentMenu) {
        for(MenuItem item : presentMenu) {
            menuItems.add(item);
        }
        newMenu  = new ArrayList<MenuItem>();
    }

    public void addMenuItem(MenuItem item) {
        if (item != null) {
            menuItems.add(item);
        }
    }

    public void removeMenuItem(String name) {

        if (name == null || name.trim() == "" || menuItems == null || menuItems.size() == 0) {
            return;
        }
        for (MenuItem itemInMenu : menuItems) {
            if (name.equalsIgnoreCase(itemInMenu.getName())) {
                menuItems.remove(itemInMenu);
                return;
            }
        }
        System.out.println("Menu Item with name '" + name + "' Not found");
    }

    public MenuItem findMenuItem(String name) {

        if (name == null || name.trim() == "" || menuItems == null || menuItems.size() == 0) {
            return null;
        }
        for (MenuItem itemInMenu : menuItems) {
            if (name.equalsIgnoreCase(itemInMenu.getName())) {
                return itemInMenu;
            }
        }

        return null;
    }
    public ArrayList<MenuItem> listAllItems() {
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
           return menuItems;
    }
}



