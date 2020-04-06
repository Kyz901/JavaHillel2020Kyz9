package HomeWork9;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        LinkList list1 = new LinkList();
        String[] str1 = new String[]{"Hello4", "Hello5"};
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.display();
        list.add("Hello");
        list.add("Hello1");
        list.add("Hello2");
        list.add("Hello3");
        list.addAll(str1);
        list.addAll(list1);
        list.display();
        list.delete("Hello2");
        list.delete(2);
        list.display();
        System.out.println(list.get(3));
        System.out.println(list.contains("Hello1"));
        System.out.println(list.contains("123"));
        System.out.println(list.size());
        list.clear();
        list.display();
        System.out.println(list.compare(list));
        System.out.println(list.compare(list1));






    }
}
