package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
        this.lastUpdated = LocalDate.now();
    }


    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem item) {
    this.menuItems.add(item);
    this.lastUpdated = LocalDate.now();
    }
    public void removeMenuItem(String name) {

    }
}


