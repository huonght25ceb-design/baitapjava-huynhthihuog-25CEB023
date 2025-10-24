package baitap2_5;

import baitap2_4.Customer;

public class Account1 {
    private int id;
    private Customer1 customer;
    private double balance = 0.0;

    public Account1(int id, Customer1 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public  Account1(int id, Customer1 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer1 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.getName() + "(" + id + ") balance=$" + balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account1 deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account1 withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
