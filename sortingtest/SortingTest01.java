package chap7.sortingtest;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by MinhTu on 11/12/2016.
 */
public class SortingTest01 {
    public static void main(String args[]){
            ArrayList<String> stuff = new ArrayList<String>(); // #1
            stuff.add("Denver");
            stuff.add("Boulder");
            stuff.add("Vail");
            stuff.add("Aspen");
            stuff.add("Telluride");
            System.out.println("unsorted " + stuff);
            Collections.sort(stuff); // #2
            System.out.println("sorted " + stuff);

    }

}
