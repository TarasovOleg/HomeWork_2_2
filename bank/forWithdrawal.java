package bank;


import java.util.Scanner;

/**
 * Created by Олег on 27.01.2017.
 */
public class forWithdrawal {
    public static void main(String[] args) {
        double balance = 7000;
        System.out.println("Your current balance is " + balance + "$");
        Scanner scan = new Scanner(System.in);
        double output = scan.nextDouble();
        commision(balance,output);

    }
    static void commision (double a, double b){
        double cmmsn = (b/100)*5;
        a = a - b - cmmsn;
        if (a<10) {
            System.out.println("Not enough money!");
        }
        if (a>=10){
            System.out.println("OK! Withdrawal: " + b + "; comission: " + cmmsn + "Your current balance is " + a + "$");
        }

    }
}
