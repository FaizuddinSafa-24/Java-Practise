import java.util.Scanner;
public class RandomSubt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            while(true) {
                System.out.println("Exit? Enter stop. Else, Say go"); // Check whether user wants to exit
                String input = scan.nextLine();
                input = input.toLowerCase();
                if (input.contains("stop")) {
                    break; // exit tthe program
                } else {
                    int num1 = (int) (Math.random() * 10); // multiply program 
                    int num2 = (int) (Math.random() * 10);

                    if (num1 < num2) {
                        num1 = num1 + num2;
                        num2= num1 - num2;
                        num1 = num2 - num1;
                    }
                    System.out.println("What is "+ num1 + "- "+ num2+ " ?");
                    int ans = scan.nextInt();
                    scan.nextLine();
                    if (num1 - num2 == ans) {
                        System.out.println("You are corect!");
                    } else {
                        System.out.println("Your answer is wrong!");
                        System.out.println(num1+" - "+num2+ " should be "+ (num1 - num2));
                    }
                }
            }
    }
}
