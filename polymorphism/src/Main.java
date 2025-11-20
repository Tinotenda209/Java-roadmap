//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//       polymorphism ABILITY OF AN OBJECT TO BE IDENTFIED AS MORE THAN ONE TYPE
  Car car = new Car();
  Bicycle bicycle= new Bicycle();
  Boat boat = new Boat();

  Vehicle[] racers = {car, bicycle,boat};
  car.go();
  boat.go();
  bicycle.go();

//  OR
       for (Vehicle x :racers){
           x.go();
       }
    }
}