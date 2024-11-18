import java.util.Scanner;
import java.util.Random;
public class Ch3Ex10 {
    public static void main(String[] args) {
        //addition quiz
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(99);
        int b = random.nextInt(99);
        System.out.println(a + "+" + b + "=?");
        int answer = scan.nextInt();
        if(answer == a+b)System.out.println("Correct answer");
        else System.out.println("Wrong answer. The correct answer is " + (a+b));
    }
}
