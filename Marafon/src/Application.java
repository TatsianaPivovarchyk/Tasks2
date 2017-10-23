
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by user on 10/22/2017.
 */

class Person{
    public String name;
    public int result;
}

public class Application {

    public static void main(String[] args){

        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] time = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

        for (int i = 0; i < time.length; i++) {
            Person[] runners = new Person[time.length];
            runners[i] = new Person();
            runners[i].name = names[i];
            runners[i].result = time[i];
            System.out.print(runners[i].name + " ");
            System.out.println(runners[i].result + " ");
        }

        Arrays.sort(());
        for (int i = 0; i <names.length; i++) {
            System.out.print(names[i] + " ");
        }

    }
}
