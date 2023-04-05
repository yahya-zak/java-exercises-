package BankeExerciece;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();
        a1.insert(9563145, "Belal", 100);
        a1.deposit(50);
        a1.withdraw(140);
        a1.checkBalance();
        System.out.println(a1.toString());

        a2.insert(445123, "Mohammad", 10000);
        a2.deposit(12000);
        a2.withdraw(2000);
        a2.checkBalance();
        System.out.println(a2.toString());

        a3.insert(445123, "Ahmad", 500);
        a3.deposit(550);
        a3.withdraw(10);
        a3.checkBalance();
        System.out.println(a3.toString());
    }
}
