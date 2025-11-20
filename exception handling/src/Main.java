import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println("results " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (InputMismatchException e) {

            System.out.println("please input a number");
        } catch (Exception e) {
            System.out.println("Can catch any exception");
        }

//        this will always print mostly used to close scanners
        finally {
            scanner.close();
        }
    }
}