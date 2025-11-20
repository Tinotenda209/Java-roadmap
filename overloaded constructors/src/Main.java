
public class Main {
    public static void main(String[] args) {
//        overloaded constructors are multiple constructors within a clas with same
//        name but have different parameters
//        name + parameters = signature

//Pizza pizza = new Pizza("thick crust","tomato","mazzerella","pepperoni");
//        Pizza pizza = new Pizza("thick crust","tomato","mazzerella");
//        Pizza pizza = new Pizza("thick crust","tomato");
        Pizza pizza = new Pizza("thick crust");
        System.out.println("There are the ingredients of the pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}