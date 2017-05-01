package prahl.daniel.Rotate_array;

import java.util.ArrayList;

/**
 * Created by danielprahl on 5/1/17.
 */
public class RotatableList<E> extends ArrayList<E> {

    public void rotateElements(int displacement){
        for(int i = 0; i < displacement; i++) {
            this.add(this.get(0));
            this.remove(0);
        }
    }

}
