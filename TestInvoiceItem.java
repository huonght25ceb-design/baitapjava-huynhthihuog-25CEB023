package baitap1_5;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem in1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(in1);
        in1.setQty(999);
        in1.setUnitPrice(0.99);
        System.out.println(in1);
        System.out.println("id is: " + in1.getId());
        System.out.println("desc is: " + in1.getDesc());
        System.out.println("qty is: " + in1.getQty());
        System.out.println("unitPrice is: " + in1.getUnitPrice());
        System.out.println("the Total is: " + in1.getTotal());

    }
}
