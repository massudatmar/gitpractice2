package Day32_Predicates;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {

    public static void main(String[] args) {

        Predicate<Integer> oddNumber = x -> x%2!=0;

                ArrayList<Integer> list = new ArrayList<>();
                    list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
                    list.removeIf(oddNumber);

                    System.out.println(list);

        System.out.println("=============================================");

        Predicate<Integer> LessthanFive = x -> x<5;

                ArrayList<Integer> list2 = new ArrayList<>();
                    list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3));
                    list2.removeIf(LessthanFive);

                    System.out.println(list2);

        System.out.println("=============================================");

        Predicate<String> startswithM = s -> s.startsWith("M");

                ArrayList<String> names = new ArrayList<>();
                names.addAll(Arrays.asList("Murtaza", "Mohammed", "Boris", "Sha", "Bilal"));

                names.removeIf(startswithM);
        System.out.println(names);

        System.out.println("=============================================");

        Predicate<String> StartswithMorA = each -> each.toLowerCase().startsWith("m") || each.toLowerCase().startsWith("a");

                ArrayList<String> names2 = new ArrayList<>();
                names2.addAll(Arrays.asList("Muhtar", "Asiya", "Alex", "Dilnaz", "Radu"));

                names2.removeIf(StartswithMorA);
        System.out.println(names2);

        System.out.println("=============================================");
        Predicate<Character> digits = c -> Character.isDigit(c);

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));
        chars.removeIf(digits);

        System.out.println(chars);

        System.out.println("============================================");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        nums.removeIf(p -> p > 5);

        System.out.println(nums);




    }

}
