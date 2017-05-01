package prahl.daniel.Rotate_array;



/**
 * Created by danielprahl on 5/1/17.
 */
public class Main {
    public static void main(String[] args){
        RotatableList<Integer> myList = new RotatableList<>();
        int initialSize = 16;
        for(int i = 0; i <= initialSize; i++) {
            myList.add(i);
        }
        System.out.println(myList);
        int displacementCount = 6;
        myList.rotateElements(displacementCount);
        System.out.println("after " + displacementCount + " rotations:");
        System.out.println(myList);

    }

}
