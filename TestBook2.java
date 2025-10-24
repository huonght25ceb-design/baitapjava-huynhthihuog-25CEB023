package baitap2_3;

public class TestBook2 {
    public static void main(String[] args) {
        Author2 a1 = new Author2("Tan An Teck", "ahteck@nowhere.com");
        System.out.println(a1);
        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);
        System.out.println("Name is: " + a1.getName());
        System.out.println("Email is: " + a1.getEmail());
        Book2 b1 = new Book2("12345", "Java of dummies", a1, 8.8, 88);
        System.out.println(b1);
        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbc is: " + b1.getIsbn());
        System.out.println("Name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author is: " + b1.getAuthor());
        System.out.println("author 's name: " +b1.getAuthorName());
        System.out.println("author 's name: " +b1.getAuthor().getName());
        System.out.println("author 's email: " +b1.getAuthorEmail());

    }
}
