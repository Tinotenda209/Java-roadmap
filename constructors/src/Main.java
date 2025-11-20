
public class Main {
    public static void main(String[] args) {
//        constructors is a special method that is called when an object is created aka instantiated


 Human human =new Human("Rick",65,70);
        Human human1 =new Human("Tino",21,53);
        System.out.println(human.name);
        System.out.println(human1.name);

        human.eat();
        human1.eat();
        human1.drink();
        human.drink();
    }
}