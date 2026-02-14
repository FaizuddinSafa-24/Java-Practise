public class Arr2DBoundarySum {
    public static void main (String[] args) {
        // array initialize
        int[][] arr = new int[4][4];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0 ; j <arr.length ; j++) {
                arr[i][j] = (int) (Math.random()*10);
            }
        }
        // test print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j <arr.length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
        int sum = 0;
        int i = 0 ,j = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0 ; j <arr.length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0|| j == arr.length - 1) {

                    sum += arr[i][j];
                }
            }
            System.out.println();
        }
        // sum
       
        // final print
        for (i = 0; i <arr.length; i++) {
            for (j = 0 ; j <arr.length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(sum);
    }
}
