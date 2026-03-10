import java.util.Scanner;
public class AlphaCheck {
    public static void main(String[] args) {
        char alpha;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character from English alphabet: ");
        alpha = scan.next().charAt(0);
        scan.close();
        System.out.println(alpha);
        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
            System.out.println("You entered a vowel.");
        } else {
            System.out.println("You entered a consonant.");
        }
        double record = 156.36;
        System.out.printf("%-30s%-15f\n","Total area of circle is ",record);
            
    }
}
