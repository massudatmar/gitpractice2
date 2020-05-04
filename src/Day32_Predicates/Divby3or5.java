package Day32_Predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Divby3or5 {

    public static void main(String[] args) {

        Predicate<Integer> Divisible3or5 = x -> (x%3==0 || x%5==0);

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(15,11,3,7,8,9,30));
        list.removeIf(Divisible3or5);
        System.out.println(list);


    }
}
