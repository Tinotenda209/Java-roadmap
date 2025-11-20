import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Random random = new Random();
       int x = random.nextInt(6)+1;//1 to 6
        double z = random.nextDouble();
        boolean c = random.nextBoolean();

        System.out.println(x);
        System.out.println(z);
        System.out.println(c);
    }
}