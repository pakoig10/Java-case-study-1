import helpers.Helper;
import helpers.Seed;
import model.Mall;
import model.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        List<Store> stores = new ArrayList();
        stores.addAll(Seed.seeder());
        Mall myMall = new Mall("Plaza Sania", stores);
        String decision;
        Scanner scan = new Scanner(System.in);
        do {
            Helper.welcome();
            decision = scan.next();
            switch (decision){
                case "1": myMall.searchStoresByProduct(1); break;
                case "2": myMall.searchStoreByName(2); break;
                case "3": myMall.searchStoreByName(3); break;
                case "4": myMall.searchStoresByProduct(4); break;
                case "5": System.out.println("Bye bye"); break;
                default: System.out.println("Wrong character. Try again."); break;
            }
        }while(!decision.equals("5"));
    }
}
