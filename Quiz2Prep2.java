import java.util.Scanner;

public class Quiz2Prep2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = scan.nextInt();
        System.out.print("Enter a month(1-12):");
        int mon = scan.nextInt();
        scan.close();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("The year %d is a leap year.\n", year);
        } else {

            System.out.printf("The year %d is not a leap year.\n", year);
        }

        switch (mon) {
            case 1:
            case 2:
            case 12:
                System.out.println("This is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is summer");
                break;
            case 9:
            case 10:
            case 11:

                System.out.println("This is fall");
                break;

            default:
                System.out.println("Error.");
                break;
        }
    }
}
