public class _1_swap{
    public static void main(String[] args) {
         String x = "water";
         String y = "Kool-Aid";
         System.out.println("X "+x);
         System.out.println("Y "+y);
         
         String temp = x;
         x=y;
         y=temp;
         System.out.println("X "+x);
         System.out.println("Y "+y);
    }
}