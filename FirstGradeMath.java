import java.util.Scanner;
public class FirstGradeMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int)Math.random()*16;
        int nup = (int)Math.random()*16;
        if(num < nup){
            int temp= num;
            num = nup;
            nup = temp;
        } else {
            System.out.printf("%d - %d ?:", num, nup);
            int ans = scan.nextInt();
            if(ans ==(num - nup)) {
                System.out.println("You're answer is correct.");
            } else 
                System.out.printf("You're answer is not correct.Correct answer is %d", (num - nup));
        }

    }
}
