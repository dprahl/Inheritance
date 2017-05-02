package prahl.daniel.superhumans;

/**
 * Created by danielprahl on 5/1/17.
 */
public class Main {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    public void start() {
        Human human1 = new Human("Alice Jones", "20", "female", "Student", "college dorms");
        Human human2 = new Human("Bob Smith", "40", "male", "Vagrant", "Homeless");
        Human human3 = new Human("Donald Trump", "60", "male", "U.S. President", "1600 Pennsylvania");

        SuperHuman super1 = new SuperHuman(); // no args
        SuperHuman super2 = new SuperHuman("Sue Richards", "30", "female", "Researcher", "FF Headquarters", "good", "Invisible Girl", "Invisibility");
        SuperHuman super3 = new SuperHuman("Nathaniel Essex", "unknown", "male", "unknown", "unknown", "bad", "Mr. Sinister", "unknown");

        super2.setName("Reed Richards");
        super2.setGender("male");
        super2.setHeroName("Mr. Fantastic");
        super2.setSuperAbility("Anatomical Elasticity");

        super2.printName();
        super2.printAge();
        super2.printGender();
        super2.printOccupation();
        super2.printAddress();

        super2.printAlignment();
        super2.printHeroName();
        super2.printSuperAbility();
    }

}
