public class LeapYear {
    public static void calculation(int year){
        if(year % Constants.FOUR == 0 && year % Constants.HUNDRED != 0)
            System.out.println(""+year+" is a leap year.");
        else
            System.out.println(""+year+" is not a leap year.");
    }
}
