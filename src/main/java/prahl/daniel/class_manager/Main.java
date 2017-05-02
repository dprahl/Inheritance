package prahl.daniel.class_manager;

/**
 * Created by danielprahl on 5/1/17.
 */
public class Main {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    public void start() {

        Inventory inventory = new Inventory();
        Product p1 = new Product("iPod", (int) (Math.random() * 100));
        Product p2 = new Product("iPad", (int) (Math.random() * 100));
        Product p3 = new Product("iPhone", (int) (Math.random() * 100));
        Product p4 = new Product("Macbook Pro", (int) (Math.random() * 100));
        Product p5 = new Product("Macbook Air", (int) (Math.random() * 100));
        Product p6 = new Product("iMac", (int) (Math.random() * 100));

        p1.setPrice( (float) Math.random() * 1000);
        p2.setPrice( (float) Math.random() * 1000);
        p3.setPrice( (float) Math.random() * 1000);
        p4.setPrice( (float) Math.random() * 1000);
        p5.setPrice( (float) Math.random() * 1000);
        p6.setPrice( (float) Math.random() * 1000);

        inventory.intake(p1);
        inventory.intake(p2);
        inventory.intake(p3);
        inventory.intake(p4);
        inventory.intake(p5);
        inventory.intake(p6);

        inventory.createReport();

    }

}
