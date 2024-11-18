public class Ch1Ex11{
    public static void main(String[] args){
        //population after 5 years.one birth every 7 seconds, death 13 seconds ,new immigrant 45 seconds
        int born = (86400/7) * 365 * 5;
        int death = (86400/13) * 365 * 5;
        int immigrants = (86400/45) * 365 * 5;
        System.out.println("Population after 5 years = " + (born + immigrants - death));
    }
}
