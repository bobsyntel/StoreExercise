import java.util.ArrayList;

public class Store {

   private ArrayList<Vendor> vendors;
   private  ArrayList<Product> storeProd;
   private int availableProd;
   private  ArrayList<Product> cart;

   public Store(ArrayList<Vendor> vendor){
       vendors = vendor;
       cart = new ArrayList<Product>();

   }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void addToCart(Product prod){
        System.out.println("The cart's size is :"+cart.size());
       //Product product = storeProd.get(index);
       cart.add(prod);
        System.out.println(cart.size());
       storeProd.remove(prod);
        System.out.println("available products "+storeProd.size());
   }

    public int getAvailableProd() {
        return availableProd;
    }

    public void setAvailableProd(int availableProd) {
        this.availableProd = availableProd;
    }



    public ArrayList<Vendor> getVendors() {
        return vendors;
    }

    public ArrayList<Product> getStoreProd() {
        return storeProd;
    }

    public void setStoreProd(ArrayList<Product> storeProd) {
        this.storeProd = storeProd;
    }

    public void setVendors(ArrayList<Vendor> vendors) {
        this.vendors = vendors;
    }
}
