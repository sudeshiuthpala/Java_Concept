import java.util.ArrayList;
import java.util.Collections;
public class AddArrayList{
    public static void main(String[] args){
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("volvo");
        cars.add("x");
        cars.add("y");
        cars.add("z");
        cars.add("a");
        System.out.println(cars);
        //access the item
        System.out.println(cars.get(0));
        //change an item
        cars.set(0,"opel");
        System.out.println(cars);
        //remove
        //cars.remove(0);
        //System.out.println(cars);
        //remove all element
        //cars.clear();

        System.out.println(cars.size());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        Collections.sort(cars);
        System.out.println(cars);
    }
}
