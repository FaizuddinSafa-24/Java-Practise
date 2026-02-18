import java.util.Scanner;
public class FirstGradeMathLoop {
    public static void main(String[] args) {
        int num = (int) Math.random()*16; 
        int nup = (int) Math.random()*16; 
        if(num < nup){
            int temp = num;
            num = nup;
            nup =temp;
        } else {
            System.out.printf("What is %d - %d",num, nup);
            Scanner scan = new Scanner(System.in);
            int ans = scan.nextInt();
            if(ans == (num - nup)){
                System.out.println("You're answer is correct");
            } else {
                System.out.println("You're answer is not correct");

            }
        }
    }
}
