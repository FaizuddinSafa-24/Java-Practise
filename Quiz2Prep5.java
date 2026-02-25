import java.util.Scanner;

public class Quiz2Prep5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a hexadecimal (0-9) || (A-F)");
        String input = scan.next();
        int in = Integer.parseInt(input, 16); // it automatically handles 0-9 & A-F and returns as int
        String out = Integer.toBinaryString(in); //it convert decimal to binary and returns as string
        System.out.println(out);

        
    }
}
