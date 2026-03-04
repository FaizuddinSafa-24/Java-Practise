import java.util.Scanner;
public class Quiz2Prep4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character:");
        char alpha = scan.next().charAt(0);
        scan.close();
        if (Character.isUpperCase(alpha)) {
            System.out.println("It is a uppercase character.");

        } else if (Character.isLowerCase(alpha)) {
            System.out.println("It is a lowercase character.");

        } else if (Character.isDigit(alpha)) {
            System.out.println("It is a digit.");

        } else {
            System.out.println("It is a special character.");
        }
    }
}
