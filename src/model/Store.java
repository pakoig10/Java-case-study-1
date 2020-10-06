package model;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private int storeId;
    public String name;
    public String location;
    public List<Product> products;

    private static int idCounter = 1;

    public Store(String name, String location, List<Product> products) {
        this.storeId = idCounter;
        this.name = name;
        this.location = location;
        this.products = products;
        idCount();
    }
    public int getStoreId() {
        return storeId;
    }

    private void idCount(){
        idCounter++;
    }
}
