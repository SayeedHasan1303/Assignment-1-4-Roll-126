import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Tax Calculation Program");
        Scanner in = new Scanner(System.in);
        System.out.println("Your income: ");
        double income = in.nextDouble();
        System.out.println("Are you married?(Enter 1 if married or enter 0) ");
        int A = in.nextInt();
        if(A == 1) {
            Tax.married(income);
            }
        if(A == 0){
            Tax.unmarried(income);
        }


        System.out.println("Decimal To Roman Number");
        System.out.println("Give a number:");
        int N = in.nextInt();
        RomanNumbers.calculation(N);


        System.out.println("Leap Year Program");
        System.out.println("Enter year");
        int Y = in.nextInt();
        LeapYear.calculation(Y);
    }
}
