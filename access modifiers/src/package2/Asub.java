package package2;
import package1.*;

public class Asub extends A {

//    accessing the  default access modifier
//    public static void main(String[] args) {
//        C c = new C();
//        System.out.println(c.defaultMessage);
//    }
public static void main(String[] args) {
 Asub asub = new Asub();
    System.out.println(asub.protectedMessage);
}

}
