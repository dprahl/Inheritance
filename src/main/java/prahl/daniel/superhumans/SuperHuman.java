package prahl.daniel.superhumans;

/**
 * Created by danielprahl on 5/1/17.
 */
public class SuperHuman extends Human{
    //good or bad, hero name, super ability
    String alignment; // good or bad
    String heroName;
    String superAbility;

    public SuperHuman(){
        super();
        setAlignment("good");
        setHeroName("Superman");
        setSuperAbility("Multiple super powers granted by our yellow sun.");
    }

    public SuperHuman(String name, String age, String gender, String occupation, String address,
                                            String alignment, String heroName, String superAbility){

        super( name, age, gender, occupation, address);
        setAlignment(alignment);
        setHeroName(heroName);
        setSuperAbility(superAbility);

    }


    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public void printAlignment() {
        System.out.println(getAlignment());
    }


    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void printHeroName() {
        System.out.println(getHeroName());
    }


    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public void printSuperAbility(){
        System.out.println(getSuperAbility());
    }




}
