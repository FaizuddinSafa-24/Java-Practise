import java.util.Scanner;
public class CountFrequency {
    public static void main(String[] args) {
        System.out.println("Enter the integers between 1 and 50: ");
        int[] num = arr();
        int[]  times = count(num);
        printCount(num, times);
    }
    
    public static int[] arr(){
        int[]  num = new int[50];
        Scanner scan= new Scanner(System.in);
       for (int i = 0; num[i] != 0; i++) {
        num[i] = scan.nextInt();
       }
       return num;
    }

    public static int[] count(int[] arr) {
        int[] count = new int[50];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        return count;
    }
    public static void printCount(int[] num, int[] count) {
        for (int i = 0 ; i <count.length; i++) {
            if ((i+ 1) % 10 ==0) {
                System.out.println("The number "+ num[i]+ " is "+ count[i]);
            } else {
                System.out.println("The number "+ num[i]+ " is "+ count[i]);
            }
        }
    }
}
