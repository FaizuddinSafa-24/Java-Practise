import java.util.Scanner;
public class PitfallSelection {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean even;
        int number = scan.nextInt();
        // Don't follow this
        if(number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        // Follow this 
        if (number %2 == 0) {
            even = true;
        } else {
            even = false;
        } 
        System.out.println("The number is even: " + even);
    }
}