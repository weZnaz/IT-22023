import java.util.Scanner;
public class Ch2Ex12{
    public static void main(String[] args){
        //Given the accelaration and speed of a plane.havo to calculate runway length
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the accelaration and speed :");
        double a = scan.nextDouble();
        double v = scan.nextDouble();
        double runwayLength = (v * v) / (2 * a);
        System.out.println("The runway length is " + runwayLength);
    }
}
