package Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class VectorTask {
    public static void main(String[] args){

        Vector<Integer> vector = new Vector<>();

        int mainArray[] = {7,1,3,4,5};

        addIntElementsToVector(vector, mainArray);

        System.out.println(vector);

        Collection<Integer> c = new ArrayList<>();
        int cArray[] = {8, 9};

        addIntElementsToVector(c, cArray);

        vector.addAll(2, c);
        vector.remove(vector.size()-1);

        System.out.println(vector);
    }

    public static void addIntElementsToVector(Collection vector, int[] array){    //Додавання елементів у вектор
        for(int a : array)
            vector.add(a);
    }
}
