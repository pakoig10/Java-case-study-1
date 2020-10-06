import helpers.Helper;
import model.Mall;
import model.Product;
import model.Store;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        List<Product> products = new ArrayList();
        products.addAll(Helper.prepareProducts());
        List<Store> stores = new ArrayList();
        stores.addAll(Helper.prepareStores(products));
        Mall myMall = new Mall("Plaza Sania", stores);
        for (Store store: myMall.stores) {
            System.out.println(store.name);
            for (Product product: store.products) {
                //product.assignQuantityPrice();
                System.out.println(product.name + " " + product.quantity + " " + product.price);
            }
        }
        String decision;
        Scanner scan = new Scanner(System.in);
        do {
            Helper.welcome();
            decision = scan.next();
            switch (decision){
                case "1": myMall.searchStoresByProduct(1); break;
                case "2": myMall.searchStoreByName(2); break;
                case "3": myMall.searchStoreByName(3); break;
                case "4": myMall.searchStoresByProduct(4);
                case "5": System.out.println("Bye bye"); break;
                default: System.out.println("Wrong number. Try again.");
            }
        }while(!decision.equals("5"));
    }
}
