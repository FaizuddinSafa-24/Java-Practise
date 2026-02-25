import java.util.Scanner;

public class Quiz2Prep5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a hexadecimal (0-9) || (A-F)");
        String input = scan.next();
        int in = Integer.parseInt(input, 16);
        String out = Integer.toBinaryString(in);
        System.out.println(out);

        // if (Integer.parseInt(input) >= 0 && Integer.parseInt(input) <= 9) {
        //     //System.out.println(input);
        //     int dec = Integer.parseInt(input);
        //     String bin = Integer.toBinaryString(dec);
        //     System.out.println(bin);
        // } else if ((input.charAt(0) >= 'A' && input.charAt(0) <= 'F') || (input.charAt(0) >= 'a' && input.charAt(0) <= 'f')){
        //     System.out.println(input);
        //     String charac = input.toUpperCase();
        //     int deci = Integer.parseInt(charac, 16);
        //     System.out.println(deci);
        //     String binaryNum = Integer.toBinaryString(deci);
        //     System.out.println(binaryNum);
        // } else {
        //     System.out.println("Error.");
        // }
        // String in = Integer.parseInt(input, 16);

        // if (Character.isDigit(input)) {
        //     if ((Integer.parseInt(input) > 9) || (Integer.parseInt(input) < 0)) {
        //         System.out.println("Error.");
        //     } else {
        //         System.out.println(input);
        //     }
        // } else if (Character.isAlphabetic(input)){
        //     String charac = Character.toUpperCase(input);// new
        //     int decimal = Integer.parseInt(charac, 16);// new radix
        //     String binary = Integer.toBinaryString(decimal); // new decimal to binary
        //     System.out.println(binary);
        // } else {
        //     System.out.println("eRROR.");
        // }
    }
}
