package day33_CustomClass;

public class carObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.Brand = "BMW";
        car1.model = "X5";
        car1.year = 2020;
        car1.color = "Red";

        System.out.println(car1.Brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        Car car2 = new Car();
        car2.Brand = "Toyota";
        car2.model = "Corolla";
        car2.year = 2020;
        car2.color = "White";

        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        car2.start();

        car2.drive();

        car2.getCarInfo();

        System.out.println("==========================================");

        Car car3 = new Car();
        car3.Brand = "Mercedes-Benz";
        car3.model = "C Class";
        car3.year = 2020;
        car3.color = "Black";


        car3.getCarInfo();
        car3.start();
        car3.drive();

        System.out.println("===========================================");
        String str = "A";
        String str2 = "B";

        String[] arr = {str, str2};

        Car[] cars = {car1, car2, car3};

        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();

        Car car4 = new Car();
        car4.Brand = "Honda";
        car4.model = "Civic";
        car4.year = 2010;
        car4.color = "Red";

        Car car5 = new Car();
        car5.Brand = "Saab";
        car5.model = "9-3";
        car5.year = 2002;
        car5.color = "Blue";

        System.out.println("======================================================");

        Car[] cars2 = {car1, car2, car3, car4, car5};

        for(int i = 0; i < 5; i++){

            cars2[i].getCarInfo();

        }





    }
}
