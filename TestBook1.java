package baitap2_2;

public class TestBook1 {
    public static void main(String[] args) {
        Author1[] authors = new Author1[2];
        authors[0] = new Author1("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author1("Paul Tan", "Paul@nowhere.com", 'm');

// Declare and allocate a Book instance
        Book1 javaDummy = new Book1("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
    }
}
