public class RomanNumbers {
    public static void calculation(int number){
        int i;
        for(i =0;i<number / Constants.THOUSAND;i++)
            System.out.print("M");
        number = number % Constants.THOUSAND;
        if(number / Constants.HUNDRED == 9){
            System.out.print("CM");
        }
        else if(number / Constants.HUNDRED < 9 && number / Constants.HUNDRED > Constants.FIVE){
            System.out.print("D");
            for(i = 0;i < number / Constants.HUNDRED - Constants.FIVE; i++)
                System.out.print("C");
        }
        else if(number / Constants.HUNDRED == Constants.FIVE)
            System.out.print("D");
        else if(number / Constants.HUNDRED == 4)
            System.out.print("CD");
        else{
            for(i = 0;i < number / Constants.HUNDRED; i++)
                System.out.print("C");
        }
        number = number % Constants.HUNDRED;
        if(number / Constants.TEN == 9){
            System.out.print("XC");
        }
        else if(number / Constants.TEN < 9 && number / Constants.TEN > Constants.FIVE){
            System.out.print("L");
            for(i = 0;i < number / Constants.TEN - Constants.FIVE; i++)
                System.out.print("X");
        }
        else if(number / Constants.TEN == Constants.FIVE)
            System.out.print("L");
        else if(number / Constants.TEN == 4)
            System.out.print("XL");
        else{
            for(i = 0;i < number / Constants.TEN; i++)
                System.out.print("X");
        }
        number = number % Constants.TEN;
        if(number / Constants.ONE == 9){
            System.out.print("IX");
        }
        else if(number / Constants.ONE < 9 && number / Constants.ONE > Constants.FIVE){
            System.out.print("V");
            for(i = 0;i < number / Constants.ONE - Constants.FIVE; i++)
                System.out.print("I");
        }
        else if(number / Constants.ONE == Constants.FIVE)
            System.out.print("V");
        else if(number / Constants.ONE == 4)
            System.out.print("IV");
        else{
            for(i = 0;i < number / Constants.ONE; i++)
                System.out.print("I");
        }
    }
}
