public class FactorionFinder {
    public static void main(String[] args) {
        FactorionUtils utils = new FactorionUtils(); 

        int start = 1, end = 100000; 
        System.out.println("Factorion numbers between " + start + " and " + end + ":");
        
        for (int i = start; i <= end; i++) {
            if (utils.isFactorion(i)) {
                System.out.println(i);
            }
        }
    }
}
