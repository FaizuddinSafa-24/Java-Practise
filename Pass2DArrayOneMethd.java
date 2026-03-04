import java.util.Scanner;
public class Pass2DArrayOneMethd {
    public static void main(String[] args) {
        // Using only one method for exam preparation
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elem of a 2D array: ");
        System.out.println("ROws:");
        int row = scan.nextInt();
        System.out.println("Cols:");
        int col = scan.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j= 0; j < array[i].length; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j= 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("tHE SUM:"+sum );
        
    }
}
