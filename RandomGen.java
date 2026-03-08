import java.util.Random;
import java.security.SecureRandom;

public class RandomGen {
    public static void main(String[] args) {
        //Random gen1 = new Random();
        //Random gen2 = new Random(3);
        SecureRandom s1 = new SecureRandom();
        SecureRandom s2 = new SecureRandom();
        System.out.println("From gen1:");
        for(int i= 0; i < 10;i++) {
            //System.out.print(gen1.nextInt(100)+" ");
            System.out.print(s1.nextInt(100)+" ");
        }
        System.out.println("From gen2:");
        for(int i= 0; i < 10;i++) {
            //System.out.print(gen2.nextInt(10000)+" ");
            System.out.print(s2.nextInt(10000)+" ");
        }
        System.out.println(s1.getProvider()); // provider of encrypted random value
        System.out.println(s1.getAlgorithm()); // the algo used for it
    }
}
