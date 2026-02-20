import java.util.Scanner;
public class Pass2DArray {
    public static void main(String[] args) {
        System.out.println("Enter inputs for a 2D array:");
        int[][] array = arrayInput();
        int sum = arraySum(array);
        System.out.println("The sum of the elements of the array: "+sum);
    }
    public static int[][] arrayInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many rows:");
        int row = scan.nextInt();
        System.out.print("How many cols:");
        int col = scan.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }
    public static int arraySum(int[][]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }


}
// main method access another method data
