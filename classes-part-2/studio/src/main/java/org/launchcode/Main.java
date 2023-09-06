package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Cheese Sticks", 5.99, "Cheesy sticks of cheese", "Appetizer", true);
        MenuItem item2 = new MenuItem("Sirloin Steak", 12.99, "Juicy steak", "Entree", false);
        MenuItem item3 = new MenuItem("Apple Pie", 6.99, "Just like your Grandma made", "Dessert", true);

        Menu menu = new Menu();
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);

    }
}
