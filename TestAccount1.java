package baitap2_5;

public class TestAccount1 {
    public static void main(String[] args) {
                Customer1 c = new Customer1(101, "Alice", 'f');
                System.out.println(c); // Alice(101)
                System.out.println("Id: " + c.getId());
                System.out.println("Name: " + c.getName());
                System.out.println("Gender: " + c.getGender());

                Account1 a1 = new Account1(555, c, 100.5);
                System.out.println(a1); // Alice(101) balance=$100.50
                System.out.println("Id: " + a1.getId());
                System.out.println("Customer: " + a1.getCustomer());
                System.out.println("Customer name: " + a1.getCustomerName());
                System.out.println("Balance: " + a1.getBalance());

                a1.deposit(20.25);
                System.out.println(a1); // balance=$120.75

                a1.withdraw(30);
                System.out.println(a1); // balance=$90.75

                a1.withdraw(200); // amount exceeds, sẽ in thông báo
                System.out.println(a1);
            }
        }

