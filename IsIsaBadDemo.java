import java.lang.Math;
import java.util.Random;

public class IsIsaBadDemo {
    public static void main(String[] args) {
        /*while(true) {
            int num = (int)(Math.random()*100);
            if (num < 50) {
                System.out.println("Isa is bad bad.");
            } else {
                System.out.println("Isa is good good.");
            }
        }*/
        Random random = new Random();
        int num = random.nextInt(999);
        if (num <= 500){
            System.out.println("Isa bad bad.");
        }else {
            System.out.println("Isa good good.");
        }
    }
}
