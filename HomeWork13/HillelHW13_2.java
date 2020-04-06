package HomeWork13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HillelHW13_2 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("hell");
        strList.add("Hello");
        strList.add("null");
        strList.add("case");
        strList.add("Inte");
        strList.add("Hillel");
        strList.add("maub");
        System.out.println(strList);
        System.out.println(pair(strList));



    }

    public static List<Pair<String, String>> pair(List<String> list){

        List<Pair<String,String>> listNew = new ArrayList<Pair<String,String>>();
        listNew = list.stream().map(i-> new Pair<String,String>(i,i.toUpperCase())).collect(Collectors.toList());
        return listNew;
    }
}
