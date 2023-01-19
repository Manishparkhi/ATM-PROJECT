import java.io.*;
import java.util.*;

public class ATM4 implements ATM3 {
    HashMap<String, Double> p = new HashMap<>();
    ATM2 atm = new ATM2();

    @Override
    public void ViewBalance() {
        System.out.println("Available Balance is : " + atm.getBalance());
        System.out.println();
        p.put("Available Balance is : ", atm.getBalance());
    }

    @Override
    public void WithdrawAmmont(double withdraw) {
        if (atm.getBalance() >= withdraw) {
            p.put("Withdraw Ammont is : ", withdraw);
            System.out.println("Collect Your Cash is " + withdraw);

            atm.setBalance(atm.getBalance() - withdraw);
            ViewBalance();
            System.out.println();
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void deposieAmmont(double depositeAmm) {
        p.put("Deposite Ammont is : ", depositeAmm);
        System.out.println("Succesfully Deposited Ammont :" + depositeAmm);

        atm.setBalance(depositeAmm + atm.getBalance());
        ViewBalance();
        System.out.println();
    }

    @Override
    public void miniStatement() {
        for (String val : p.keySet()) {
            System.out.println(val + p.get(val));
            System.out.println();
        }

    }

}
