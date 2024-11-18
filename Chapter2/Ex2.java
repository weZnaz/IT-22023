import java.util.Scanner;
public class Ch2Ex1{
    public static void main(String[] args){
        //celcius to fahrenheit
        Scanner scan = new Scanner(System.in);
        double celcius = scan.nextDouble();
        double fahrenheit = (9.0/5.0) * celcius + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
