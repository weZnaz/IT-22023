import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.util.*;


public class javaproject {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculation Game");
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();
        System.out.print("Please enter your age : ");
        String age = sc.nextLine();
        System.out.print("Please enter your ID : ");
        String id = sc.nextLine();
        System.out.print("Please enter your email : ");
        String email = sc.nextLine();

        LocalTime nowD = LocalTime.now();
        LocalDate nowT = LocalDate.now();
        Path infopath = Paths.get("info.txt");
        String content = "Name: " + name + " " + "Age: " + age + " " + "ID: " + id + " " + "Email: " + email + " " + "Date: " + nowT + " " + "Time: " + nowD.getHour() + ":" + nowD.getMinute();
        Files.write(infopath, content.getBytes());

        System.out.println("Which level you prefer?");
        System.out.println("1. Warm-Up");
        System.out.println("2. BattleField");
        System.out.println("3. Final Boss");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                readFile("Warm-Up.txt");
                break;
            case 2:
                readFile("Battlefield.txt");
                break;
            case 3:
                readFile("Final Boss.txt");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }

    public static void readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rounds you want to play [max 100]: ");
        int round = sc.nextInt();

        while (round-- > 0) {
            String line = reader.readLine();
            //here we want to calculate the expressions answer by using exp4j-  is it possible
            
        }
        reader.close();
        sc.close();
    }
}
