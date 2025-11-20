//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

   Car myCar = new Car();
   Car myCar1 = new Car();


        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        myCar1.drive();
        myCar1.brake();

      System.out.println(myCar.make);
       System.out.println(myCar.model);
         myCar.drive();
         myCar.brake();

    }
}