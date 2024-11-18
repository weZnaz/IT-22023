import java.util.Random;
public class Ch3Ex4{
    public static void main(String[] args){
          //random number will be generated between 1 to 12.Have to print the name of month correspoding to that number
          Random random = new Random();
          int monthNumber = random.nextInt(12)+1;
          String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
          System.out.println("The month is " + months[monthNumber - 1]);
    }
}
