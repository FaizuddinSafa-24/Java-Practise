import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println((i + 4));
        System.out.println((d + 4));
        String s1 = "HackerRank " + s;
        System.out.println(s1);
        // System.out.println("HackerRank "+ s);

    }
}