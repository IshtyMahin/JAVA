import java.util.Scanner;

public class _5_Math {
    public static void main(String[] args) {
        // double x = 3.14;
        // double y = -10;
        

        // max,min, floor,cell,sqrt,abs
        // double z = Math.ceil(x);
        // System.out.println(z);

        double x ;
        double y ;
        double z;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = input.nextDouble();
        System.out.println("Enter side y: ");
        y = input.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is : "+z);
        input.close();
        
    }
}
