package helpers;

import model.Product;
import model.Store;

import java.util.ArrayList;
import java.util.List;

public class Seed {

    public static List<Store> seeder(){
        List<Store> stores = new ArrayList();
        List<Product> E1 = new ArrayList<>();
        List<Product> E2 = new ArrayList<>();
        List<Product> C1 = new ArrayList<>();
        List<Product> C2 = new ArrayList<>();
        List<Product> W1 = new ArrayList<>();
        List<Product> W2 = new ArrayList<>();
        String[] electronics = {"Keyboard", "Microphone", "Mouse", "Monitor"};
        String[] cloths = {"Shirt", "Short", "Jeans", "Sweater"};
        String[] weapons = {"Sword", "Hammer", "Knife", "Axe"};

        for (String name: electronics) {
            Product product = new Product(name, "Electronics");
            E1.add(product);
        }
        for (String name: electronics) {
            Product product = new Product(name, "Electronics");
            E2.add(product);
        }
        for (String name: cloths) {
            Product product = new Product(name, "Clothing");
            C1.add(product);
        }
        for (String name: cloths) {
            Product product = new Product(name, "Clothing");
            C2.add(product);
        }
        for (String name: weapons) {
            Product product = new Product(name, "Clothing");
            W1.add(product);
        }
        for (String name: weapons) {
            Product product = new Product(name, "Clothing");
            W2.add(product);
        }
        Store e1 = new Store("E1", "First floor", E1);
        Store e2 = new Store("E2", "Second floor", E2);
        Store c1 = new Store("C1", "Second floor", C1);
        Store c2 = new Store("C2", "Third floor", C2);
        Store w1 = new Store("W1", "Third floor", W1);
        Store w2 = new Store("W2", "First floor", W2);

        stores.add(e1);
        stores.add(e2);
        stores.add(c1);
        stores.add(c2);
        stores.add(w1);
        stores.add(w2);

        return stores;
    }
}
