package prahl.daniel.abstract_class;

/**
 * Created by danielprahl on 5/1/17.
 */
public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    public void start() {
        ATM atm = new ATM();
        atm.activate();
    }

}
