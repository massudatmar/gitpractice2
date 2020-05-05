package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class studentObjects {

    public static void main(String[] args) {

        Students student1 = new Students();
        student1.setStudentInfo("Massud", "Afghan", (byte) 28, 2.8f, 'M', false);
        Students student2 = new Students();
        student2.setStudentInfo("Nelson", "Honduran", (byte)29, 3.4f, 'M', false);
        Students student3 = new Students();
        student3.setStudentInfo("Dan", "American",(byte)29, 3.0f, 'M', false );
        Students student4 = new Students();
        student4.setStudentInfo("Greg", "American", (byte)26, 3.4f, 'M', false);
        Students student5 = new Students();
        student5.setStudentInfo("Darla", "Fillipino", (byte)22, 3.3f, 'F', false);

        Students[] students = {student1, student2, student3, student4, student5};

        ArrayList<Students> canGraduate = new ArrayList<>(Arrays.asList(students));
        canGraduate.removeIf(p -> p.gpa <=3.0);

        System.out.println(canGraduate.size());

        for(int i = 0; i < canGraduate.size(); i++){

            Students each = canGraduate.get(i);
            System.out.println(each.name+" can graduate");


        }
    }
}
