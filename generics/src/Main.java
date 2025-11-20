import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// MyintegerClass myint = new MyintegerClass(1);
// MyDoubleClass mydouble = new MyDoubleClass(3.14);
// MyCharacterClass mychar = new MyCharacterClass('@');
// MyStringClass myString = new MyStringClass("Hello");

        MyGenericClass<Integer , Integer> myint = new MyGenericClass<>(1,7);
        MyGenericClass<Double , Double> mydouble = new MyGenericClass<>(3.14,7.67);
        MyGenericClass<Character , Character> mychar = new MyGenericClass<>('@','!');
        MyGenericClass<String , Character>  myString = new MyGenericClass<>("Hello",'!');

//        ArrayList<String> myFriends = new ArrayList<>();

        System.out.println(myint.getvalue());
        System.out.println(mydouble.getvalue());
        System.out.println(mychar.getvalue());
        System.out.println(myString.getvalue());
    }
}