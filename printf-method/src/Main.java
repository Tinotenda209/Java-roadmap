
public class Main {
    public static void main(String[] args) {
//        System.out.printf("%d this is format string", 123);
        boolean myBoolean =true;
        char myChar ='@';
        String myString ="Tino";
        int myInt =50;
        double myDouble =1000;

        System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);

//        [width]
        System.out.println();
        System.out.printf(" Hello %10s", myString);
//        [precision] limit the amount of digit on doubles
        System.out.println();
        System.out.printf("You have this much money %.2f",myDouble);
//        flags
        System.out.println();
        System.out.printf("You have this much money %20f",myDouble);
        System.out.println();
        System.out.printf("You have this much money %+f",myDouble);
        System.out.println();
        System.out.printf("You have this much money %020f",myDouble);
        System.out.println();
        System.out.printf("You have this much money %,f",myDouble);
    }

}