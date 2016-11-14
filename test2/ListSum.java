package chap7.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MinhTu on 11/12/2016.
 */
public class ListSum {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        System.out.println(sum(list));
    }

    private static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list){
            sum += num.doubleValue();
        }
        return sum;
    }
}
