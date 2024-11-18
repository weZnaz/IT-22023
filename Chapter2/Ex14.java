import java.util.Scanner;
public class Ch2Ex14{
    public static void main(String[] args){
        //Given the weight and height in pound and inch.Have to calculate the BMI
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight in pounds and height in inches: ");
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        double bmi = (weight * 0.45359237) / (height * height * 0.0254 * 0.0254);
        System.out.println("BMI is " + bmi);
    }
}
