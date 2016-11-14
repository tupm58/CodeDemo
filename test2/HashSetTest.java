package chap7.test2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by MinhTu on 11/12/2016.
 */
public class HashSetTest {
    public static void main(String args[]){
        Set hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add(1);
        hashSet.add(null);
        hashSet.add("null");
        System.out.println(hashSet);

        Map hashMap = new HashMap();
        hashMap.put(new String("a"), "cat");
        hashMap.put(new String("a"), "dog");
        System.out.println(hashMap);

    }
}
