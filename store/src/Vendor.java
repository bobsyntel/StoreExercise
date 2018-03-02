import java.util.ArrayList;

public class Vendor {

    private ArrayList<Product> products;

    public Vendor(ArrayList<Product> prod){
        this.products = prod;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
