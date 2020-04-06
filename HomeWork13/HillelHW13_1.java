package HomeWork13;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class HillelHW13_1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(10);
        array.add(20);
        array.add(25);
        array.add(13);
        array.add(14);
        array.add(16);
        System.out.println(array);
        System.out.println();
        System.out.printf("%.3f",average(array));
        System.out.println();

    }

    public static double average(List<Integer> list){
        IntSummaryStatistics sum = list.stream().mapToInt((i) -> i).summaryStatistics();
        double aver = sum.getAverage();
        return  aver;
    }


}
