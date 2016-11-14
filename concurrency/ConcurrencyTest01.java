package chap7.concurrency;

import java.util.Collection;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by MinhTu on 11/11/2016.
 */
public class ConcurrencyTest01 {

    public static final ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String args[]){

        Collection vector = new Vector();
//        Collection list = new ArrayList<>();

        for (int t = 0; t < 5; t++) {
            executorService.submit(new CollectionAdder(vector));
        }

        // after all threads is finished
        executorService.shutdown();
        while (!executorService.isTerminated()) {}

        System.out.printf("Size : %d\n", vector.size());
        System.out.println(vector);
    }
}