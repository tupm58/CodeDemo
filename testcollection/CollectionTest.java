package chap7.testcollection;

import java.util.*;

/**
 * Created by MinhTu on 11/10/2016.
 */
public class CollectionTest {
   public static void main(String args[]) {
       Queue q1 = new PriorityQueue();
       q1.add(1);
       q1.add(2);
       q1.add(3);
       q1.add(4);
       q1.add(5);
       q1.add(6);
       System.out.println(q1);
       q1.remove();
       System.out.println(q1);
       q1.remove();
       System.out.println(q1);
   }
}
