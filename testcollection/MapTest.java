package chap7.testcollection;

import java.util.*;

/**
 * Created by MinhTu on 11/11/2016.
 */
public class MapTest {
    public static void main(String args[]){
        Map map1 = new HashMap();
        map1.put("A",4);
        map1.put("B",5);
        map1.put("C",9);
        map1.put("Tu",8);
        map1.put("A",5);
        map1.put(null,null);
        System.out.println(map1);

        Map map2 = new Hashtable<>();
        map2.put("A",4);
        map2.put("B",5);
        map2.put("C",9);
        map2.put("Tu",8);
        //map2.put(null,null);
        System.out.println(map2);

        Map map3 = new LinkedHashMap<>();
        map3.put("A",4);
        map3.put("B",5);
        map3.put("C",9);
        map3.put("Tu",8);
        map3.put(null,4);
        System.out.println(map3);

        Map map4 = new TreeMap<>();
        map4.put("Tu",8);
        map4.put("c",4);
        map4.put("B",5);
        map4.put("C",9);
        map4.put("Tung",8);
        map4.put("he",null);
        System.out.println(map4);
    }
}
