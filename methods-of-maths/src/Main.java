import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        double x = 3.14;
//        double y = -10;
//        double z = Math.max(x, y);
//        double c = Math.min(x,y);
//        double v = Math.abs(y);
//        double l = Math.sqrt(x);
//        double b = Math.round(x);
//        double n = Math.ceil(x);
//        double m = Math.floor(x);
//
//
//        System.out.println(z);
//        System.out.println(c);
//        System.out.println(v);
//        System.out.println(l);
//        System.out.println(v);
//        System.out.println(b);
//        System.out.println(n);
//        System.out.println(m);

        // find the hypotenuse
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("the hypotenuse is: "+z);
        scanner.close();
    }
}