package chap7.testcollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by MinhTu on 11/11/2016.
 */
public class SetTest {
    public static void main(String args[]){
        Set set1 = new HashSet<>();
        set1.add("a");
        set1.add("d");
        set1.add("b");
        set1.add(1);
        set1.add("c");
        set1.add("c");
        set1.add(null);
        set1.add(null);

        System.out.println(set1);

        Set set2 = new LinkedHashSet<>();
        set2.add("a");
        set2.add("d");
        set2.add("b");
        set2.add(1);
        set2.add("c");
        set2.add("c");
        System.out.println(set2);

        Set set3 = new TreeSet<>();
        set3.add(3);
        set3.add(1);
        set3.add(4);
        set3.add(2);
        set3.add(6);
        System.out.println(set3);

    }
}
