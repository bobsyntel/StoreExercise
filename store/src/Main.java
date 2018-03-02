import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Product vendor1prod1 = new Product("Nature Valley", "Granola bar", 2.99);
        Product vendor1prod2 = new Product("Iphone 6", "Cell phone", 200.00);
        Product vendor1prod3 = new Product("Toyota Camry", "Automobile", 12200.00);
        Product vendor1prod4 = new Product("Samsung s8", "cell phone", 799.99);
        Product vendor1prod5 = new Product("Mercedes Benz", "Automobile", 20000.00);


        Product vendor2prod1 = new Product("Axe", "deodorant", 12.99);
        Product vendor2prod2 = new Product("Iphone 8", "Cell Phone", 2222.99);
        Product vendor2prod3 = new Product("Honda Accord", "Automobile", 50000.99);
        Product vendor2prod4 = new Product("Samsung Edge", "Cell Phone", 800.99);
        Product vendor2prod5 = new Product("Nature Valley", "Granola bar", 2.99);

        Product vendor3prod1 = new Product("Axe", "deodorant", 12.99);
        Product vendor3prod2 = new Product("Iphone 8", "Cell Phone", 2222.99);
        Product vendor3prod3 = new Product("Honda Accord", "Automobile", 50000.99);
        Product vendor3prod4 = new Product("Samsung Edge", "Cell Phone", 800.99);
        Product vendor3prod5 = new Product("Nature Valley", "Granola bar", 2.99);

        ArrayList<Product> vendor1Prods = new ArrayList<Product>();
        vendor1Prods.add(vendor1prod1);
        vendor1Prods.add(vendor1prod2);
        vendor1Prods.add(vendor1prod3);
        vendor1Prods.add(vendor1prod4);
        vendor1Prods.add(vendor1prod5);

        Vendor vendor1 = new Vendor(vendor1Prods);

        ArrayList<Product> vendor2Prods = new ArrayList<Product>();
        vendor2Prods.add(vendor2prod1);
        vendor2Prods.add(vendor2prod2);
        vendor2Prods.add(vendor2prod3);
        vendor2Prods.add(vendor2prod4);
        vendor2Prods.add(vendor2prod5);

        Vendor vendor2 = new Vendor(vendor2Prods);

        ArrayList<Product> vendor3Prods = new ArrayList<Product>();
        vendor3Prods.add(vendor3prod1);
        vendor3Prods.add(vendor3prod2);
        vendor3Prods.add(vendor3prod3);
        vendor3Prods.add(vendor3prod4);
        vendor3Prods.add(vendor3prod5);

        Vendor vendor3 = new Vendor(vendor3Prods);

        ArrayList<Vendor> storeVendors = new ArrayList<Vendor>();
        storeVendors.add(vendor1);
        storeVendors.add(vendor2);
        storeVendors.add(vendor3);

        Store store = new Store(storeVendors);
        ArrayList<Product> storeProd = new ArrayList<Product>();
        storeProd.add(vendor1Prods.get(0));
        storeProd.add(vendor1Prods.get(2));
        storeProd.add(vendor2Prods.get(3));
        storeProd.add(vendor3Prods.get(2));
        storeProd.add(vendor2Prods.get(0));

        store.setStoreProd(storeProd);

        HashMap<Integer,Product> cartItems = new HashMap<Integer, Product>();
        System.out.println(store.getStoreProd().get(1).getName());
        System.out.println("What are the available products in the store?");
        for (int i = 0; i < storeProd.size(); i++) {
            System.out.println(i +" "+storeProd.get(i).getName()+" "+storeProd.get(i).getDescription()+" "+storeProd.get(i).getPrice());
            cartItems.put(i,storeProd.get(i));
        }

        System.out.println("Do you want to add or remove items from the cart?");
        Scanner sc = new Scanner(System.in);
        String addOrRemove = sc.nextLine();
        String done ="no";
        if (addOrRemove.equals("add")) {
            System.out.println("Add your item to the cart");
          //  int prod = sc.nextInt();

        while (store.getStoreProd().size() > 0 && done.equals("no")){
            int prod = sc.nextInt();

             switch (prod) {
                 case 0:
                     //store.getStoreProd().get(1);
                     System.out.println(cartItems.get(0).getName()) ;
                     store.addToCart(cartItems.get(0));
                     break;
                 case 1:
                     store.addToCart(cartItems.get(1));
                     break;
                 case 2:
                     store.addToCart(cartItems.get(2));
                     break;
                 case 3:
                     store.addToCart(cartItems.get(3));
                     break;
                 case 4:
                     store.addToCart(cartItems.get(4));
                     break;
                 default:
                     System.out.println("Item not in store ");


             }

            System.out.println("Are you done");
            Scanner d = new Scanner(System.in);
            done = d.nextLine();
         }
        }

        System.out.println("The items in your cart are :");
        for(int i = 0; i < store.getCart().size();i++){
            System.out.println(store.getCart().get(i).getName());
        }
    }
}
