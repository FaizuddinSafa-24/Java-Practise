import java.util.Scanner;
public class BabylonianSqrt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to get squre root:");
        double num = scan.nextDouble();
        double guess =num/2.0;
        double e = 0.0001;
        while((Math.abs(num - guess) < e)) {
            double newGuess= ((num/guess)+guess)*0.5;
            guess = newGuess;
        }
        System.out.println(guess);
    }
}