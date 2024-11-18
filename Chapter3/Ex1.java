import java.util.Scanner;
public class Ch3Ex1{
    public static void main(String[] args){
          //give a,b,c have to calculate two roots
          Scanner scan = new Scanner(System.in);
          System.out.print("Enter the coefficients a, b, and c: ");
          double a = scan.nextDouble();
          double b = scan.nextDouble();
          double c = scan.nextDouble();
          double d = b * b - 4 * a * c;
          if(d > 0)
          {
              double root1 = (-b + Math.sqrt(d)) / (2 * a);
              double root2 = (-b - Math.sqrt(d)) / (2 * a);
              System.out.println("The roots are " + root1 + " and " + root2);
          }
          else if(d == 0)
          {
              double root = -b / (2 * a);
              System.out.println("The root is " + root);
          }
          else System.out.println("No root");

    }
}
