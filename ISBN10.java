import java.util.ArrayList;
import java.util.Scanner;
public class ISBN10 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter ISBN 9 digits:");
        int num = scan.nextInt();
        int input = num;
        while (num > 0) {
            int remainder = num % 10;
            list.add(remainder);
            num/= 10;
        }
        int sum = 0;
        for (int i= 0; i < list.size(); i++) {
            sum += (i+1) * list.get(i);
        }
        int tenth = (sum) % 11;
        System.out.println("The ISBN with 10th digit: "+ input + tenth);
    }
}
