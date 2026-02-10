import java.util.Scanner;
public class GuessNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int)(Math.random() * 101);
        System.out.println("Enter a number to guess: ");
        int guess = scan.nextInt();
        while(true) {
            if(num == guess) {
                System.out.println("You got right. It is "+ num);
                break;
            } else if (num > guess) {
                System.out.println("You're guess is too low.");
                guess = scan.nextInt();
                
            } else if (num < guess) {
                System.out.println("You're guess is too high.");
                guess = scan.nextInt();
            } else {
                System.out.println("Error!");
                guess = scan.nextInt();
            }
        }
    }
}
