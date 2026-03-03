import java.util.Scanner;
import java.util.ArrayList;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter digits :");
        int num = scan.nextInt();
        scan.nextLine();
        scan.close();
        //int[] num1 = new int[3];
        //num1 = num;
        int digit = num;
        // do it without loops and array
        while(num > 0) {
            int unit = num % 10;
            list.add(unit);
            num/= 10;
        }
        // if (list.get(0) == list.get(2)) {
        //     System.out.println("The number is palindrome");
        // }                                                            // palindrome for three digits only
        boolean cond = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == list.get(list.size() - 1- i)) {
                
            } else {
                cond = true;
                break;
            }
        }
        if (cond == true) {
            System.out.printf("The number %d is not palindrome.\n", digit);
        } else {
            System.out.printf("The number %d is palindrome.\n", digit);
        }

        double x = 0.0/5.0;
        System.out.println(x); 
        double y = 5/0.0; // prints positve inifinity
        System.out.println(y); //Infinity
        double z = -5/0.0; // prints negative infinity
        System.out.println(z); // -Tnfinity
        double m = 0.0/0.0;
        System.err.println(m);
    }
}
