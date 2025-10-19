package baitap1_6;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("A101", "Tan An Teck", 88);
        System.out.println(acc1);
        Account acc2 = new Account("A102", "Kumar", 0);
        System.out.println(acc2);
        System.out.println("ID: " + acc1.getId());
        System.out.println("Name: " + acc1.getName());
        System.out.println("Balance: " + acc1.getBalance());
        acc1.credit(100);
        System.out.println(acc1);
        acc1.debit(50);
        System.out.println(acc1);
        acc1.debit(500);  // debit() error
        System.out.println(acc1);

        acc1.transfer(acc2, 100);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
