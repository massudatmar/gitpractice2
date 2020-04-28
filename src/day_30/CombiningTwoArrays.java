package day_30;

import java.util.ArrayList;

public class CombiningTwoArrays {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i < arr1.length; i++){

            String EachElement = arr1[i];
            list.add (EachElement );




        }

        for(String EachElement: arr2){
            list.add (EachElement);

        }
        System.out.println(list);

    }


}


