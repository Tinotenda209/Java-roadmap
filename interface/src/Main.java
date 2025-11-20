//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Rabbit rabbit = new Rabbit();
Hawk hawk = new Hawk();
        hawk.hunt();
rabbit.flee();
Fish fish = new Fish();
fish.hunt();
fish.flee();
    }
}