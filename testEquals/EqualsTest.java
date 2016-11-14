package chap7.testEquals;

/**
 * Created by MinhTu on 11/7/2016.
 */
public class EqualsTest {
    public static void main(String[] args){
        Dog one = new Dog(8,"a");
        Dog two = new Dog(8,"a");
        if (one.equals(two)){
            System.out.println("bang nhau");
        }

    }
}
