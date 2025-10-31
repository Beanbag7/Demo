
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        String name = in.next();
        double balance = in.nextDouble();
        double annualInterestRate = in.nextDouble();
        Account account = new Account(id, name, balance, annualInterestRate);
        account.withdraw(2500);
        account.deposit(3000);
        account.print();
        in.close();
    }
}

/* 你的代码被嵌在这里 */
class Account {
    private int id;
    private String name;
    private double balance;
    private double annualInterestRate;

    // 有参构造方法
    public Account(int id, String name, double balance, double annualInterestRate) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    // 取款方法
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    // 存款方法
    public void deposit(double amount) {
        balance += amount;
    }

    // 获取月利率
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // 打印账户信息
    public void print() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(balance);
        System.out.printf("%.3f%%", getMonthlyInterestRate());
    }
}