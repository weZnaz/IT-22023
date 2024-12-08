import java.util.Scanner;

public class MathHelper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Task 1: Calculate Height of a Right Triangle
        System.out.println("Task 1: Determine the height of a right triangle.");
        System.out.print("Provide the base length (base): ");
        double base = input.nextDouble();
        System.out.print("Provide the angle (angle in degrees): ");
        double angleDegrees = input.nextDouble();
        double triangleHeight = base * Math.tan(Math.toRadians(angleDegrees));
        System.out.println("Calculated Height: " + triangleHeight);

        // Task 2: Compound Interest Formula
        System.out.println("\nTask 2: Compute Compound Interest.");
        System.out.print("Enter the initial amount (principal): ");
        double principal = input.nextDouble();
        System.out.print("Provide annual interest rate (rate as decimal): ");
        double annualRate = input.nextDouble();
        System.out.print("Enter the number of times it compounds annually (frequency): ");
        int frequency = input.nextInt();
        System.out.print("Input the duration in years (years): ");
        double years = input.nextDouble();
        double totalAmount = principal * Math.pow(1 + annualRate / frequency, frequency * years);
        System.out.println("Final Amount: " + totalAmount);

        // Task 3: Cartesian to Polar Conversion
        System.out.println("\nTask 3: Convert Cartesian Coordinates to Polar.");
        System.out.print("Provide x-coordinate: ");
        double xCoord = input.nextDouble();
        System.out.print("Provide y-coordinate: ");
        double yCoord = input.nextDouble();
        double polarRadius = Math.sqrt(Math.pow(xCoord, 2) + Math.pow(yCoord, 2));
        double polarAngle = Math.toDegrees(Math.atan2(yCoord, xCoord));
        System.out.println("Polar Form: Radius = " + polarRadius + ", Angle = " + polarAngle + "°");

        // Task 4: Distance Between Two Points
        System.out.println("\nTask 4: Measure Distance Between Two Points.");
        System.out.print("Enter x-coordinate of first point (x1): ");
        double point1X = input.nextDouble();
        System.out.print("Enter y-coordinate of first point (y1): ");
        double point1Y = input.nextDouble();
        System.out.print("Enter x-coordinate of second point (x2): ");
        double point2X = input.nextDouble();
        System.out.print("Enter y-coordinate of second point (y2): ");
        double point2Y = input.nextDouble();
        double pointDistance = Math.sqrt(Math.pow(point2X - point1X, 2) + Math.pow(point2Y - point1Y, 2));
        System.out.println("Distance Between Points: " + pointDistance);

        // Task 5: Solve Quadratic Equation
        System.out.println("\nTask 5: Solve a Quadratic Equation.");
        System.out.print("Enter coefficient (a): ");
        double coefA = input.nextDouble();
        System.out.print("Enter coefficient (b): ");
        double coefB = input.nextDouble();
        System.out.print("Enter coefficient (c): ");
        double coefC = input.nextDouble();
        double delta = Math.pow(coefB, 2) - 4 * coefA * coefC;
        if (delta >= 0) {
            double solution1 = (-coefB + Math.sqrt(delta)) / (2 * coefA);
            double solution2 = (-coefB - Math.sqrt(delta)) / (2 * coefA);
            System.out.println("Solutions: " + solution1 + ", " + solution2);
            if (solution1 >= 0 && solution2 >= 0) {
                System.out.println("Smallest Positive Solution: " + Math.min(solution1, solution2));
            } else if (solution1 >= 0) {
                System.out.println("Smallest Positive Solution: " + solution1);
            } else if (solution2 >= 0) {
                System.out.println("Smallest Positive Solution: " + solution2);
            } else {
                System.out.println("No Positive Solutions.");
            }
        } else {
            System.out.println("No Real Solutions.");
        }

        input.close();
    }
}
