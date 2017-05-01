package prahl.daniel.superhumans;

/**
 * Created by danielprahl on 5/1/17.
 */
public class Human {
    String name;
    String age;
    String gender;
    String occupation;
    String address;
    //retrieve and output
    public Human(){
        //super();
        setName("Clark Kent");
        setAge("30");
        setGender("male");
        setOccupation("Reporter");
        setAddress("123 Fake St.");
    }

    public Human(String name, String age, String gender, String occupation, String address){
        setName(name);
        setAge(age);
        setGender(gender);
        setOccupation(occupation);
        setAddress(address);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println(getName());
    }

    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age = age;
    }

    public void printAge(){
        System.out.println(getAge());
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public void printGender(){
        System.out.println(getGender());
    }

    public String getOccupation(){
        return occupation;
    }
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public void printOccupation(){
        System.out.println(getOccupation());
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public void printAddress(){
        System.out.println(getAddress());
    }



}
