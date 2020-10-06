package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mall {

    private int mallId;
    public String name;
    public List<Store> stores;

    private static int idCounter = 1;

    public Mall(String name, List<Store> stores) {
        this.mallId = idCounter;
        this.name = name;
        this.stores = new ArrayList();
        this.stores.addAll(stores);
        for (Store store: this.stores) {
            System.out.println(store.name);
            for (Product product : store.products) {
                product.assignQuantityPrice();
                //System.out.println(product.name + " " + product.quantity + " " + product.price);
            }
        }
        idCount();
    }

    private void idCount(){
        idCounter++;
    }

    public void searchStoresByProduct(int option) {
        int searchCounter = 0;
        Scanner scan = new Scanner(System.in);
        String productName;
        System.out.println("Insert product name: ");
        productName = scan.next();
        for (Store store: this.stores) {
            for (Product product:store.products) {
                if (product.name.equals(productName)){
                    switch (option){
                        case 1:
                            System.out.println("Store name: " + store.name);
                            System.out.println("Store id: " + store.getStoreId());
                            System.out.println("Location: " + store.location);
                            break;
                        case 4:
                            System.out.println("Store name: " + store.name);
                            System.out.println("Price: $" + product.price);
                            break;
                    }
                    searchCounter++;
                }
            }
        }
        if (searchCounter == 0) System.out.println("There isn't any store with that product.");
        System.out.println("\n");
    }

    public boolean searchStoreByName(int option){
        Scanner scan = new Scanner(System.in);
        String storeName;
        System.out.println("Insert store name: ");
        storeName = scan.next();
        for (Store store:this.stores) {
            if(store.name.equals(storeName)) {
                switch (option)
                {
                    case 2:
                        System.out.println("I found a store! And its location is on " + store.location + "\n");
                        return true;
                    case 3:
                        int total = 0;
                        for (Product product: store.products) {
                            System.out.println(product.name + "\t Quantity: "
                                    + product.quantity + "\t Price: $"
                                    + product.price + "\t Subtotal: $"
                                    + ((product.quantity) * (product.price)));
                            total += ((product.quantity) * (product.price));
                        }
                        System.out.println("Total = $" + total + "\n");
                        return true;
                }
            }
        }
        System.out.println("There isn't any store with that name.\n");
        return false;
    }
}
