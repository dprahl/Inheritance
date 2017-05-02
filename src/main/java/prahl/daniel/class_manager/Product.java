package prahl.daniel.class_manager;

/**
 * Created by danielprahl on 5/1/17.
 */
public class Product {

    private String id;
    private String name;
    private float price;
    private static int numCreated;
    private int quantity;

    {
        name = "Product";
        price = 0.00f;
        numCreated = 0;
        quantity = 0;
    }

    public Product(){
        numCreated++;
        id = Integer.toString(numCreated);

    }

    public Product(String name, int quantity) {
        super();
        this.name = name;
        addQuantity(quantity);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if( price < 0.00f) { // zero is as low as we go
            this.price = 0.00f; // no negative prices here, clamp to lower bound
        }else{
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity(int quantity){
        this.quantity -= quantity;
    }

}
