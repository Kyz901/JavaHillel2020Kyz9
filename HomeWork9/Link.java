package HomeWork9;




public class Link {
    String str;
    String[] strArr;

    Link next;
    Link prev;

    public Link(String str) {
        this.str = str;

    }



    public void displayLink()
    {

        System.out.print(str+ " ");
    }
}

