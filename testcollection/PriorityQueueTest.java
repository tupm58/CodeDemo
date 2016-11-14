package chap7.testcollection;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by MinhTu on 11/11/2016.
 */
public class PriorityQueueTest {
    public static void main(String args[]){
        Queue q = new PriorityQueue();
        q.add(12);
        q.add(26);
        q.add(3);
        q.add(4);
        q.add(9);
        q.add(11);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}
