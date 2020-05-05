package day34_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bank_of_America {

    public static void main(String[] args) {


        Tester tester1 = new Tester();
        tester1.setTesterInfo("Madina", 1112233445, "QA", 200000);
        Tester tester2 = new Tester();
        tester2.setTesterInfo("Venera", 234567834, "Senior SDET", 150000 );
        Tester tester3 = new Tester();
        tester3.setTesterInfo("Sha", 6235487, "SDET", 120000);

        ArrayList<Tester> testers = new ArrayList<>();
                testers.addAll(Arrays.asList(tester1,tester2,tester3));

                testers.removeIf( p -> !p.jobTitle.contains("SDET"));

                double totalBudget = 0;
                for( Tester each : testers){
                    System.out.println(each);
                    totalBudget+=each.salary;
                }

        System.out.println(totalBudget);
    }

}
