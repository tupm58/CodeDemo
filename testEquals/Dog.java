package chap7.testEquals;

/**
 * Created by MinhTu on 11/11/2016.
 */
public class Dog {
    private int height;
    private String name;
    public Dog(int val,String name){
        this.height = val;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public boolean equals(Object o){
        if ((o instanceof Dog) && (((Dog)o).getHeight()==this.height)){
            return true;
        }else{
            return false;
        }
    }
    public int hashCode(){
        return name.hashCode();
    }
}