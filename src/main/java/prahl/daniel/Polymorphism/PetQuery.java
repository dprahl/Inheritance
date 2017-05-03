package prahl.daniel.Polymorphism;

import java.util.Scanner;

/**
 * Created by danielprahl on 5/2/17.
 */
public class PetQuery {
    private int petCount;
    private Pet[] pets;
    private Scanner input;

    public void beginQuery(){
        input = new Scanner(System.in);
        askPetCount();
        pets = new Pet[petCount];
        gatherInfo();
        printPetList();
    }

    public void askPetCount(){
        System.out.println("How many pets do you have?");
        String temp = input.nextLine();
        if(Integer.parseInt(temp) > 0){
            setPetCount(Integer.parseInt(temp) );
        }
    }

    public void gatherInfo(){

        for (int i = 0; i < pets.length; i++) {
            askSpecies(i);
            String tp = input.nextLine();
            askName(i);
            String nm = input.nextLine();
            if(tp.equalsIgnoreCase("cat")) {
                pets[i] = new Cat(nm);
            }else if(tp.equalsIgnoreCase("dog")) {
                pets[i] = new Dog(nm);
            }else if(tp.equalsIgnoreCase("rock")){
                pets[i] = new Rock(nm);
            }else{
                pets[i] = new Pet(nm, tp);
            }

        }
    }

    public void askSpecies(int nth){
        System.out.printf("What type is your %s pet? ", getNth(nth));
        System.out.println("");
    }

    public void askName(int nth){
        System.out.printf("What is your %s pet's name? ", getNth(nth));
        System.out.println("");
    }

    public String getNth(int nth){
        String temp;
        switch (nth) {
            case 0:
                temp = "first";
                break;
            case 1:
                temp = "second";
                break;
            case 2:
                temp = "third";
                break;
            default:
                temp = (nth+1) + "th";
        }
        return temp;
    }

    public void setPetCount(int count){
        petCount = count;
    }

    public void printPetList(){
        for (Pet p:pets) {
            p.speak();
        }
    }

}
