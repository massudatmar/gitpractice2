package Day32_Predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class RemoveSpecialCharacters {

    public static void main(String[] args) {
        Predicate<Character> specialchar = s -> (s >= 33 && s <= 47);
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('C', '!', '5', '%', '9'));
        list.removeIf(specialchar);
        System.out.println(list);



    }
}
