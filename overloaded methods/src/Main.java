//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      int x = add(1,2,9);

        System.out.println(x);
    }
    static int add(int a, int b){
        System.out.println("overloaded method number 1");
        return a + b;
    }
    static int add(int a, int b , int c){
        System.out.println("overloaded method number 2");
        return a + b + c;
    }
    static int add(int a, int b , int c ,int d){
        System.out.println("overloaded method number 3");
        return a + b + c + d;
    }


}