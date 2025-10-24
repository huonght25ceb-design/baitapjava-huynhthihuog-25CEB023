package baitap2_4;

public class TestInvoice1 {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Tan An Teck", 10);
        System.out.println(c1);
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " +  c1.getId());
        System.out.println("name is: " +  c1.getName());
        System.out.println("discount is: " +  c1.getDiscount());

        Invoice1 in1 = new Invoice1(101, c1, 888.8);
        System.out.println(in1);
        in1.setAmount(999.9);
        System.out.println(in1);
        System.out.println("id is: " +  in1.getId());
        System.out.println("Customer is: " + in1.getCustomer());
        System.out.println("amount is: " +  in1.getAmount());
        System.out.println("Customer 's id is: " +  in1.getCustomerId());
        System.out.println("Customer 's Name is: " +  in1.getCustomerName());
        System.out.println("Customer 's discount is: " +  in1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", in1.getAmountAfterDiscount());
    }
}
