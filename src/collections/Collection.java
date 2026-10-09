package collections;
import java.util.ArrayList;

public class Collection {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(9);
        arr.add(1);
        arr.add(0);
        arr.add(8);
        arr.add(4);
        arr.add(0);
        arr.add(6);
        arr.add(9);
        System.out.println(arr);
        arr.set(0,9);
        arr.set(1,4);
        System.out.println(arr);
    }
}
