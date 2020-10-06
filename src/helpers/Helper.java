package helpers;
import model.Product;
import model.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Helper {

    public static List<Product> prepareProducts(){
        List<Product> products = new ArrayList<>();
        String[] types = {"Electronics", "Clothing", "Weapons"};
        String[] electronics = {"Keyboard", "Microphone", "Mouse", "Monitor"};
        String[] cloths = {"Shirt", "Short", "Jeans", "Sweater"};
        String[] weapons = {"Sword", "Hammer", "Knife", "Axe"};
        for(String type: types){
            String[] names;
            if (type.equals("Electronics")) names = electronics;
            else if(type.equals("Clothing")) names = cloths;
            else names = weapons;
            for(String name: names){
                Product product = new Product(name, type);
                products.add(product);
            }
        }
        return products;
    }

    public static List<Store> prepareStores(List<Product> products){
        String type = new String();
        List<Store> stores = new ArrayList(6);
        String[] names = {"E1", "E2", "C1", "C2", "W1", "W2"};
        String[] locations = {"First floor", "Second floor", "Third floor"};
        int counter = 0;
        for (String name: names) {
            Random rand = new Random();
            List<Product> productsByType = new ArrayList();
            String location = locations[rand.nextInt(locations.length)];
            if(name.equals("E1")||name.equals("E2")) type = "Electronics";
            else if(name.equals("C1")||name.equals("C2")) type = "Clothing";
            else if(name.equals("W1")||name.equals("W2")) type = "Weapons";
            for (Product product: products) {
                if (product.type.equals(type)) {
                    product.assignQuantityPrice();
                    productsByType.add(product);
                }
            }
            Store store = new Store(name, location, productsByType);
            stores.add(counter, store);
            counter++;
        }
        return stores;
    }

    public static void welcome(){
        System.out.println("Hello human.");
        System.out.println("Choose an option (1-5)");
        System.out.println("1.-Display the store details with Store id, name and location for the given product name.");
        System.out.println("2.-Display the location details to the user for the requested store name.");
        System.out.println("3.-Display the Total products asset value of the store for the requested store name.");
        System.out.println("4.-Compare the prices of the requested product name by the user in all the relevant stores in the mall and display.");
        System.out.println("5.-Exit");
    }
}
