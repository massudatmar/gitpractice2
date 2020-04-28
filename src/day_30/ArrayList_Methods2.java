package day_30;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_Methods2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
                list.add("A");
                list.add("B");
                list.add("C");

                String str = "A";
           boolean r1 =   list.remove(str); // true

        list.clear();

        System.out.println(list);
        System.out.println(list.size());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);

       int num1 =  list2.indexOf(100); //Integer = int

        System.out.println(list2);
        System.out.println(num1);
    }
}
