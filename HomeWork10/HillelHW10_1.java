package HomeWork10;



import java.util.*;

public class HillelHW10_1 {




    public static void main(String[] args) {

        NoDublicatedCopy noDublicatedCopy = new NoDublicatedCopy();



        List<Integer> list1 = new ArrayList<>();
        List<Double> list2 = new LinkedList<>();
        List<String> list3 = new ArrayList<>();


        list1.add(2);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        list1.add(3);

        list2.add(4.0);
        list2.add(5.0);
        list2.add(4.0);
        list2.add(7.0);
        list2.add(7.0);

        list3.add("1");
        list3.add("1");
        list3.add("3");
        list3.add("1");
        list3.add("2");
        list3.add("1");


        System.out.println("Integer arraylist ----> " + list1);
        noDublicatedCopy.withoutDublicate(list1);
        System.out.println("Double linkedlist ----> " + list2);
        noDublicatedCopy.withoutDublicate(list2);
        System.out.println("String arraylist ----> " + list3);
        noDublicatedCopy.withoutDublicate(list3);


        System.out.println("Integer arraylist ----> " + list1);
        System.out.println("Double linkedlist ----> " + list2);
        System.out.println("String arraylist ----> " + list3);
    }









}
