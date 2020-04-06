package HomeWork10;

import java.util.*;

public class NoDublicatedCopy {



    public <O> List<O> withoutDublicate(List<O> list) {

        Set<O> set = new HashSet<O>(list);
        list.clear();
        list.addAll(set);


        return list;
    }





}
