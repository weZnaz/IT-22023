import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.util.*;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class javaproject {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculation Game");
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Please enter your age: ");
        String age = sc.nextLine();
        System.out.print("Please enter your ID: ");
        String id = sc.nextLine();
        System.out.print("Please enter your email: ");
        String email = sc.nextLine();
          
        System.out.println("Which level you prefer?");
        System.out.println("1. Warm-Up");
        System.out.println("2. BattleField");
        System.out.println("3. Final Boss");
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                readFile("Warm-Up.txt", name, age, id, email);
                break;
            case 2:
                readFile("Battlefield.txt", name, age, id, email);
                break;
            case 3:
                readFile("Final Boss.txt", name, age, id, email);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }

    public static void readFile(String filename, String name, String age, String id, String email) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many rounds do you want to play [max 100]: ");
        int round = sc.nextInt();
        int xround=round;
        
       
        if (round < 1 || round > 100) {
            System.out.println("Invalid number of rounds. Setting rounds to 10.");
            round = 10;  
        }
        
        int score = 0;
        
        while (round-- > 0) {
            String line = reader.readLine();
            if (line == null) break; 
            
            String expression = line;
            System.out.println("What is the answer of this expression: " + line);
            double userans = sc.nextDouble();

            Expression exp = new ExpressionBuilder(expression).build();
            double result = Math.round(exp.evaluate() * 100.0) / 100.0;

            if (result == userans) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong.");
            }
        }

        
        LocalTime nowD = LocalTime.now();
        LocalDate nowT = LocalDate.now();
        Path infopath = Paths.get("info.txt");
        String content = "Name: " + name + " Age: " + age + " ID: " + id + " Email: " + email + " Date: " + nowT + " Time: " + nowD.getHour() + ":" + nowD.getMinute() + " Score: " + score+"\n";
        Files.write(infopath, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);

        System.out.println("Your score is : "+score+"/"+xround);

        reader.close();
        sc.close();
    }
}
