package chap7.concurrency;

import java.util.Collection;

/**
 * Created by MinhTu on 11/11/2016.
 */
public class CollectionAdder implements Runnable {
    private Collection collection;

    public CollectionAdder(Collection collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        String currentThreadName = Thread.currentThread().getName();
        for (int i = 0; i < 5; i ++) {
            collection.add(currentThreadName + "(" + i + ")");
        }
    }
}
