import java.util.Scanner;

public class HexDec {
    public static void main(String[] args) {
        System.out.println("Enter a hexadecimal to convert Binary: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int decimal = Integer.parseInt(input);
        String binary = Integer.toBinaryString(decimal);
        System.out.printf("The binary of %s is %s\n", input, binary);
    }
    
}
