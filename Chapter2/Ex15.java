import java.util.Scanner;
public class Ch2Ex15{
    public static void main(String[] args){
          // given x1, y1, x2, y2.havo to calculate he distance 
          Scanner scan = new Scanner(System.in);
          System.out.print("Enter the coordinates of two points (x1, y1) and (x2, y2): ");
          double x1 = scan.nextDouble();
          double y1 = scan.nextDouble();
          double x2 = scan.nextDouble();
          double y2 = scan.nextDouble();
          double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
          System.out.println("The distance between the points is " + distance);
    }
}
