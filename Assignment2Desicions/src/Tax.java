    public class Tax{
        public static void unmarried(double taxableincome){
            double tax = 0;
            if(taxableincome <= Constants.EIGHTK)
                tax = tax + taxableincome * Constants.TENPERC;
            if(taxableincome > Constants.EIGHTK && taxableincome <= Constants.THIRTYTWOK)
                tax = tax + (taxableincome - Constants.EIGHTK) * Constants.FIFTEENPERC ;
            if(taxableincome > Constants.THIRTYTWOK)
                tax = tax + (taxableincome - Constants.THIRTYTWOK) * Constants.TWENTYFIVEPERC ;

            System.out.println(""+tax);


        }
        public static void married(double taxableincome){
            double tax = 0;
            if(taxableincome <= Constants.EIGHTK *Constants.TWO)
                tax = tax + taxableincome * Constants.TENPERC;
            if(taxableincome > Constants.EIGHTK * Constants.TWO && taxableincome <= Constants.THIRTYTWOK * Constants.TWO)
                tax = tax + (taxableincome - Constants.EIGHTK * Constants.TWO) * Constants.FIFTEENPERC + Constants.EIGHTHUNDRED * Constants.TWO;

            if(taxableincome > Constants.THIRTYTWOK * Constants.TWO)
                tax = tax + (taxableincome - Constants.THIRTYTWOK * Constants.TWO) * Constants.TWENTYFIVEPERC + Constants.FOURFOURZEROZERO * Constants.TWO;
            System.out.println(""+tax);

        }
    }


