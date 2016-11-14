package chap7.testEquals;

/**
 * Created by MinhTu on 11/10/2016.
 */
public class EqualsTest2 {
    public static void main(String args[]){
        System.out.println("1");
        String x = "test";
        String y = new String("test");
        System.out.println(x==y);
        System.out.println(x.equals(y));

        System.out.println("2");
        String a = "3";
        System.out.println(a.equals(3));
        System.out.println(new Integer(3).equals(a));

        System.out.println("3");
        Integer b = new Integer(3);
        System.out.println(b.equals(3));

        System.out.println("4");
        int z = 1;
        Integer c = new Integer(1);
        System.out.println(c.equals(z));
    }
}
