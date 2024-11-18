import java.util.Scanner;
public class Ch2Ex16{
    public static void main(String[] args){
          //side of hexagon given.have to calculate its area
          Scanner scan = new Scanner(System.in);
          System.out.print("Enter the side length of the hexagon: ");
          double sideLength = scan.nextDouble();
          double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);
          System.out.println("The area of the hexagon is " + area);
    }
}
