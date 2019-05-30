package model;

public class Items {
    private String itemName, itemImageName, itemDescription;
    private float itemPrice;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemImageName() {
        return itemImageName;
    }

    public void setItemImageName(String itemImageName) {
        this.itemImageName = itemImageName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Items(String itemName, String itemImageName, String itemDescription, float itemPrice) {
        this.itemName = itemName;
        this.itemImageName = itemImageName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }
}
