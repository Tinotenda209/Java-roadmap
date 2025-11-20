//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Hero hero= new Hero("Batman" ,50,"tech");
        Hero hero1= new Hero("Superman" ,10,"tech");
        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.power);

        System.out.println(hero1.toString());
    }
}