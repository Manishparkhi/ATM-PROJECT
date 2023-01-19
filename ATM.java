import java.io.*;
import java.util.*;

public class ATM {
    public static void main(String[] args) {
        ATM4 op = new ATM4();
        System.out.println("!! WELCOME !!");
        Scanner scn = new Scanner(System.in);
        int AccNo = 12345;
        int Pin = 123;
        System.out.print("Enter Your Account Number : ");
        int Accno = scn.nextInt();
        if (AccNo == Accno) {
            System.out.print("Enter Your Pin : ");
            int n = scn.nextInt();
            if (Pin == n) {

                while (true) {
                    System.out.print(
                            "1.View Available balance." + "\n" + "2.Withdraw Money." + "\n" + "3.Deposite Money." + "\n"
                                    + "4.View Minny Statement." + "\n" + "5.Exit\n");
                    System.out.print("Enter Choice: ");
                    int Number = scn.nextInt();
                    if (Number == 1) {

                        op.ViewBalance();

                    } else if (Number == 2) {

                        System.out.print("Enter Withdraw Ammount :");
                        double x = scn.nextDouble();
                        op.WithdrawAmmont(x);

                    } else if (Number == 3) {
                        System.out.print("Enter Deposited Ammont :");
                        double x = scn.nextDouble();
                        op.deposieAmmont(x);

                    } else if (Number == 4) {
                        op.miniStatement();
                    } else if (Number == 5) {
                        System.out.println("!!! Thanks For Using ATM !!!");
                        System.exit(0);

                    } else {
                        System.out.println("Enter Valid Number");
                    }

                }
            } else {
                System.out.println("Enter valid password And Collect Your Card");
            }
        } else {
            System.out.println("Enter valid Account Number  And Collect Your Card");
        }
    }
}
