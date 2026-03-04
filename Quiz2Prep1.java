public class Quiz2Prep1 {
    public static void main(String[] args) {
        int year = 0;
        double tuition = 10000;
        double increaseRate = 1.07;
        double target = 2 * tuition;
        while (tuition < target) {
            

            tuition = tuition * increaseRate;
            System.out.println(tuition);
            year++;
            System.out.println(year);

        }
        System.out.printf("The year %d is required to double the tuition.", year);
    }
}
