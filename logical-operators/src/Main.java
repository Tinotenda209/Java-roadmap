import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int temp =25;

if(temp>30){
    System.out.println("it is hot outside");
} else if (temp>=20 && temp <= 30 ) {
    System.out.println("it is warm outside");
}else {
    System.out.println("it is cold outside");
}

// Java Operator ||
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q");
        String response = scanner.next();
        if (response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game");
        } else{
            System.out.println("You are still playing the game");
        }

// ! not logical operator

        System.out.println("You are playing a game! Press q or Q");
        String r = scanner.next();
        if (!r.equals("q") && !r.equals("Q")){ // !r not equal to
            System.out.println("You are still playing the game");
        } else{
            System.out.println("You quit the game");
        }
    }
}