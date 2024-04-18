import java.util.*;

class Balance {
    public int bal = 5000; //current balance in 5000
}

class Atm {
    Balance b = new Balance();
    
    public void deposit(int num) {
        b.bal += num;
        System.out.println("Successfully Deposited Money\n");
    }
    
    public void withdraw(int num) {
        if (num > b.bal) {
            System.out.println("Insufficient Funds\n");
        } else {
            b.bal -= num;
            System.out.println("Successfully Withdrawn\n");
        }
    }
    
    public int checkbalance() {
        return b.bal;
    }
    
    public int run() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter amount to be deposited: ");
                    int money = sc.nextInt();
                    deposit(money);
                    break;
                case 2:
                    System.out.println("Enter amount to be withdrawn: ");
                    int mon = sc.nextInt();
                    withdraw(mon);
                    break;
                case 3:
                    System.out.println("Available Balance: " + checkbalance());
                    break;
                case 4:
                    System.out.println("Completed\n");
                    flag = false;
                    break;
                default:
                    System.out.println("Enter a valid number\n");
                    break;
            }
        }
        return 0;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm a = new Atm();
        a.run();
    }
}