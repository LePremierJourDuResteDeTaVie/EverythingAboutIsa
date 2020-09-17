//(x^2+y^2-1)^3-x^2*y^3=0
public class IsaIsBadBadDemo {
    public static void main(String[] args) {
        for (double y = (double)1.5;y > -1.5; y -= 0.1){
            for (double x = (double) -1.5; x < 1.5; x += 0.07){
                double a = x*x +y*y-1;
                if ((a*a*a-x*x * y*y*y)<=0.0){
                    System.out.print("Isa");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
