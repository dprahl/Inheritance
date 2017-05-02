package prahl.daniel.class_manager;

import java.util.ArrayList;

/**
 * Created by danielprahl on 5/1/17.
 */
public class Inventory {

        ArrayList<Product> products;
        int totalItems;
        float totalValue;

        public Inventory() {
            products = new ArrayList<>();
            totalItems =0;
            totalValue = 0.00f;
        }

        public void intake(Product items){
            products.add(items);
        }

        public void purge(int index){
            products.remove(index);
        }

    public int getTotalItems() {
        totalItems = 0;
        for (Product i: products) {
            totalItems += i.getQuantity();
        }
        return totalItems;
    }

        public float getTotalValue() {
            totalValue = 0.00f;
            for (Product i: products) {
                totalValue += ( i.getPrice() * i.getQuantity());
            }
            return totalValue;
        }


        public void createReport(){
            System.out.println("___Inventory Report___");
            for (Product i: products) {
                System.out.print(i.getQuantity() + " " + i.getName() + "s @ $");
                System.out.printf( "%3.2f", i.getPrice());
                System.out.println(" each");
            }
            System.out.println("");
            System.out.println("Total items: " + getTotalItems());
            System.out.print("Total value: $");
            System.out.printf( "%8.2f", getTotalValue());
            System.out.println("");
        }


}
