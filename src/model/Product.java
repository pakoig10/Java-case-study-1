package model;

import java.util.Random;

public class Product {

    public int productId;
    public String name;
    public String type;
    public int quantity;
    public int price;

    private static int idCounter = 1;

    public Product(String name, String type) {
        this.productId = idCounter;
        this.name = name;
        this.type = type;
        this.assignQuantityPrice();
        idCount();
    }

    private void idCount(){
        idCounter++;
    }

    public void assignQuantityPrice(){
        Random rand = new Random();
        this.quantity = rand.nextInt(15) + 1;
        this.price = rand.nextInt(1000) + 50;
    }
}
