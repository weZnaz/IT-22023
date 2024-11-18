import java.util.Scanner;
public class Ch3Ex9 {
    public static void main(String[] args) {
        //a nine digit number will be input.have to find the tenth digit of isbn number using given formula
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a 9-digit ISBN number: ");
        int isbn = scan.nextInt();
        int mul = 9;
        int sum = 0;
        int n = isbn;
        if(isbn/100000000 == 0)System.out.print("0");
        while(mul>0)
        {
            int digit = n % 10;
            sum += digit * mul;
            n /= 10;
            mul--;
        }
        sum%=11;
        if(sum==10)System.out.println(isbn+"X");
        else 
        {
            System.out.println(isbn + "" + sum);
        }
    }
}
