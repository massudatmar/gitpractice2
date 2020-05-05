package day33_CustomClass;

public class catObjects {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
            cat1.setCatInfo("Calico", "White", 14, "Misty");

        System.out.println(cat1.toString());

        System.out.println("======================================");
        cat1.sleep();



    }
}
