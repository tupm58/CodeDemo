package chap7.testHashcode;

import chap7.testEquals.Dog;

/**
 * Created by MinhTu on 11/11/2016.
 */
public class TestHashcode {
    public static void main(String args[]){
        Dog dog1 = new Dog(8,"a");
        Dog dog2 = new Dog(8,"a");
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.hashCode() == dog2.hashCode());

        dog2 = dog1;
        System.out.println(dog1.hashCode() == dog2.hashCode());

    }
}
