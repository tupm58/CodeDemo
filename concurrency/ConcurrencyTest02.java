package chap7.concurrency;

import java.util.Collection;
import java.util.Vector;

/**
 * Created by MinhTu on 11/11/2016.
 */
public class ConcurrencyTest02 {

    public static void main(String args[]) throws InterruptedException {

        Collection vector = new Vector();
//        Collection list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new CollectionAdder(vector), "Thread" + i);
            t.start();
        }

        Thread.sleep(5000L);
        System.out.printf("Size : %d\n", vector.size());
        System.out.println(vector);
    }
}
