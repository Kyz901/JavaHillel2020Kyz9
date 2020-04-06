package HomeWork9;




public class LinkList implements CustomCollection {

    private Link first;
    private Link last;
    private int size;


    public void LinkList() {

    }

    public boolean isEmpty() {
        return (first == null);
    }





    public boolean add(String str) {


        Link newLink = new Link(str);
        if (isEmpty()) {
            last = newLink;
            first = newLink;
        } else {

            Link current = last;
            newLink.next = null;
            last = newLink;

            newLink.prev = current;
            current.next = newLink;

        }
        size++;
        return true;
    }



    public boolean addAll(String[] strArr) {


        for (int i = 0; i < strArr.length; i++) {
            Link newLink = new Link(strArr[i]);
            if (isEmpty()) {
                last = newLink;
                first = newLink;
            } else {

                Link current = last;
                newLink.next = null;
                last = newLink;

                newLink.prev = current;
                current.next = newLink;

            }
            size++;
        }
        return true;
    }

    public boolean addAll(LinkList collection) {

        for(int i = 0;i<collection.size();i++){
            String value = collection.get(i);


            Link newLink = new Link(value);
            if (isEmpty()) {
                last = newLink;
                first = newLink;
            } else {

                Link current = last;
                newLink.next = null;
                last = newLink;

                newLink.prev = current;
                current.next = newLink;

            }
            size++;
        }
        return true;
    }

    public boolean delete(int index) {
        Link current = first;
        int curIndex;
        for (curIndex = 0; curIndex < index; curIndex++) {
            current = current.next;
            if (current == null)
                return false;
        }
        if (current == first)
            first = current.next;
        else

            current.prev.next = current.next;
        if (current == last)
            last = current.prev;
        else

            current.next.prev = current.prev;
        size--;
        return true;
    }

    public boolean delete(String str) {
        Link current = first;
        while (!current.str.equals(str)) {
            current = current.next;
            if (current == null)
                return false;
        }
        if (current == first)
            first = current.next;
        else

            current.prev.next = current.next;
        if (current == last)
            last = current.prev;
        else

            current.next.prev = current.prev;
        size--;
        return true;
    }


    public String get(int index) {
        Link current = first;
        int curIndex;
        for (curIndex = 0; curIndex < index; curIndex++) {
            if (current.next == null)
                return null;
            else
                current = current.next;
        }
        return current.str;
    }


    public boolean contains(String str) {
        Link current = first;
        while (!current.str.equals(str)) {
            current = current.next;
            if (current == null)
                return false;
        }
        if (current == first)
            first = current.next;
        else

            current.prev.next = current.next;
        if (current == last)
            last = current.prev;
        else

            current.next.prev = current.prev;
        return true;
    }

    public boolean clear() {
        while (!isEmpty()) {
            Link temp = last;
            if (first.next == null)
                first = null;
            else
                last.prev.next = null;
            last = last.prev;
        }

        return true;
    }

    public int size() {
        return size;
    }

    public boolean trim(){
        return true;
    }

    public boolean compare(LinkList coll){
        return (this == coll) ? true
                : (coll != null)
                && (coll.size() == size());



    }




    public void display() {

        Link current = first;
        System.out.print("Collection -->  ");
        while (current != null) {
            current.displayLink();

            current = current.next;
        }
        System.out.println("");
    }


}
