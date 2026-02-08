public class Test {
    public static void main(String[] args) {
        double[] r = new double[100];
        for (int i = 0; i < r.length; i++) {
        r[i] = Math.abs((Math.random()-100));
        }
        for (Double i : r) {
            System.out.println(i);
        }
        System.out.println("\n\n");
    }
}
