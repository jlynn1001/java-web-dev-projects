package org.launchcode;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private MenuItemCategoryEnum category;
    private boolean isNew;

    public String getName() { return name; }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public MenuItemCategoryEnum getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }


    public MenuItem(String n, double p, String d, MenuItemCategoryEnum c, boolean iN) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setName(String name) { this.name = name; }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(MenuItemCategoryEnum category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}

