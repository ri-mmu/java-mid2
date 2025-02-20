package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
/*        int[] students = {90, 80, 70, 60, 50};
        for (int i = 0; i < students.length; i++) {
            list.add(students[i]);
        }*/

        list.add(90);
        list.add(80);
        list.add(70);
        list.add(60);
        list.add(50);

        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        double average = (double) total / list.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
