package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem newItem = new MenuItem("Cheese Sticks", 15, "Cheesy sticks of cheese", MenuItemCategoryEnum.APPETIZER, true);
        Menu currentMenu = new Menu(new java.util.Date(), new ArrayList<MenuItem>());
        currentMenu.getItems().add(newItem);
    }
}


