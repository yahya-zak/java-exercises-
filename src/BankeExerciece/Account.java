package BankeExerciece;

public class Account {
    public int accountNo;
    public String name;
    public float amount;

    public void insert(int a, String n, float amt) {
        this.accountNo = a;
        this.name = n;
        this.amount = amt;
    }

    public void deposit(float amt) {
        this.amount = this.amount + amt;
        System.out.println(amt + "depoited");
    }

    public void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            this.amount = this.amount - amt;
            System.out.println(amt + "withdrawn");
        }
    }

    public void checkBalance() {
        System.out.println("Balance = " + amount);
    }

    public String toString() {
        return "Account Nb =" + accountNo + '\n' +
                "Name =" + name + '\n' +
                "Amount =" + amount + '\n';
    }
}


