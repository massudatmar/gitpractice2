package day_30;
import java.util.ArrayList;
import java.util.Arrays;

public class Uniques {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
                    list.add(1);
                    list.add(2);
                    list.add(1);
                    list.add(3);
                    list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>();


        for(int i =0; i< list.size(); i++){

            int count = 0;
            for(Integer each: list){

                if(each == list.get(i)){
                    count++;

                }

            }

            if(count == 1){
                uniques.add(list.get(i));
            }

        }
        System.out.println(list);
        System.out.println(uniques);
    }


}
