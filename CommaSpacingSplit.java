import java.util.Scanner;

public class CommaSpacingSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] arr = input.split(" ,");
            for (String word : arr) {

                System.out.println(word);
            }
        }
    }
}
