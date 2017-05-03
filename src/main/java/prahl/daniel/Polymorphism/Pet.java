package prahl.daniel.Polymorphism;

/**
 * Created by danielprahl on 5/2/17.
 */
public class Pet {

    private String name;
    private String type;

    //public Pet(){}

    public Pet(String name, String type) {
        setName(name);
        setType(type);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public void speak(){
        System.out.println(getName() + " the " + getType() + " begins to speak fluently in Klingon.");
    }

}
