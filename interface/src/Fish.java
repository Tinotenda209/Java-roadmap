public class Fish implements Prey, Predator{
    @Override
    public void hunt() {
        System.out.println("fish hunting");
    }

    @Override
    public void flee() {
        System.out.println("fish fleeing");
    }
}
