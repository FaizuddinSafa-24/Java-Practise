public class Array2DSmart {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        arr[0][0] = 1;
        arr[0][1] = 5;
        arr[0][2] = 3;
        arr[0][3] = 4;
        arr[0][4] = 5;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 5;
        arr[1][3] = 5;
        arr[2][0] = 6;
        arr[2][1] = 5;
        arr[2][2] = 5;
        arr[3][0] = 4;
        arr[3][1] = 5;
        

        for (int i= 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
