import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final byte MONTH_IN_YEAR= 12 ;
        final byte PRECENT=100;

        Scanner scanner = new Scanner(System.in);

      int principal=0;
      float
              monthlyInterest=0;
      int numberOfPayments=0;
       //addition
        while (true){
            System.out.println("please enter loan amount : ");
             principal = scanner.nextInt();
            if (principal>=1000 && principal<=1000_000_000)
                break;
            System.out.println("put  between 1000 till 1000_000");
        }

        // addition

        while (true){
            System.out.println("Annual Interest Rate : ");
            float annualInterest= scanner.nextFloat();
            if (annualInterest>=1 && annualInterest<=10){
             monthlyInterest = annualInterest / PRECENT / MONTH_IN_YEAR;
                break;
            }else {
                System.out.println("annual interest can be just between 1 till 10 % ");
            }
        }

        while (true){
            System.out.println(" period (years) : ");
            byte years = scanner.nextByte();
            if (years>=1&& years<=30){
                numberOfPayments= years * MONTH_IN_YEAR;
            break;}
            System.out.println("years of pay back can be 1 till 30 ");

        }



        double mortgageFormula= Math.pow(monthlyInterest+1,numberOfPayments);

        double mortgage= principal * (monthlyInterest*(mortgageFormula))/(mortgageFormula -1);

        String mortgageFormatted= NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println(" your mortgage is : " + mortgageFormatted);

        double extraAmount= (mortgage*numberOfPayments) - principal;
        String eA= NumberFormat.getCurrencyInstance().format(extraAmount);
        System.out.println("your principle is : "+principal +" also your payback money is : " + (mortgage*numberOfPayments));
        System.out.println(eA+" thats amount of money you shoud pay more ");





    }
}