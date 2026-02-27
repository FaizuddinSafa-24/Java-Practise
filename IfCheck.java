import java.util.Scanner;

public class IfCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        if (x < 4) {
            x += 1;
        }
        System.out.println("x is " + x);
        int num = 45;
        boolean even = (num % 2 == 0);
        System.out.println(even);
        int age = scan.nextInt();

        if (age < 16) { // Best logic for this case
            System.out.println("Cannot get a license.");
        } else {
            System.out.println("Can get a driving License");
        }
        // System.exit(0);
        // int i,j,k;
        // i=j=k=1;
        // System.out.println(i);
        // System.out.println(j);
        // System.out.println(k);
        // int a,b,c;
        // a = 1 = b = 1 =c = 1;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // int h = 9;
        // long m = 9;
        // //float n = 9.05;
        // double p = 9.0;
        // System.out.println(h+" "+m+ " "+ " "+p);
        long timeISeconds = System.currentTimeMillis();
        System.out.println(timeISeconds);
        int second = (int)timeISeconds / 1000;
        int minute = (int) second / 60;
        int hr = minute / 60;
        System.out.printf("miliseconds: %f, seconds = %f, minutes= %d, hours = %d", timeISeconds, second, minute, hr);

    }

}
