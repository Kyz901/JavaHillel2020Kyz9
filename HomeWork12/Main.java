package HomeWork12;

public class Main  {
    public static void main(String[] args) {

    MyStringCollection collection = new MyStringCollection();


        collection.printMas();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        collection.add("6");
        collection.add("7");
        collection.add("8");
        collection.add("9");
        collection.add("6");
        collection.printMas();
        collection.add("11",10);
        collection.add("11");
        collection.printMas();
        collection.delete(2);
        collection.delete("2");
        collection.printMas();
        System.out.println(collection.get(4));
        System.out.println(collection.isContains("5"));
        System.out.println(collection.isEquals(1,5));
        System.out.println(collection.isEquals(3,7));
        System.out.println("Index of '11' is - ["+collection.indexOf("11")+"]");
        System.out.println("Number of values in array - "+collection.getSize());

        System.out.println(" ");
        collection.clear();
        collection.printMas();
        System.out.println("Number of values in array - "+collection.getSize());




    }
}
