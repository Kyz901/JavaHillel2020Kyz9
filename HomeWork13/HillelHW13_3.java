package HomeWork13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HillelHW13_3 {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("hell");
        strList.add("Hello");
        strList.add("null");
        strList.add("case");
        strList.add("Inte");
        strList.add("HELL");
        strList.add("maub");
        System.out.println(strList);
        sort(strList);
    }

    public static void sort(List<String> list){
        List<String> sortlist = list.stream().filter(x-> x.equals(x.toLowerCase())).filter(x-> x.length()==4).collect(Collectors.toList());
        System.out.println(sortlist);
    }



}
