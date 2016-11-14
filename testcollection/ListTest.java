package chap7.testcollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by MinhTu on 11/11/2016.
 */
public class ListTest {
    public static void main(String args[]){
        List list1 = new ArrayList<>();
        list1.add("a");
        list1.add("d");
        list1.add("b");
        list1.add(1);
        list1.add("c");
        list1.add("c");
        list1.add(null);
        System.out.println(list1);

        List list2 = new LinkedList<>();
        list2.add("a");
        list2.add("d");
        list2.add("b");
        list2.add(1);
        list2.add("c");
        list2.add(2,"hai");
        list2.add("c");
        System.out.println(list2);
    }

}
