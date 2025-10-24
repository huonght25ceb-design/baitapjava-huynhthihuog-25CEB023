package baitap2_2;

public class Book1 {
    private String name;
    private Author1[] authors;
    private double price;
    private int qty = 0;

    public Book1(String name, Author1[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book1(String name, Author1[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author1[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        StringBuilder authorsStr = new StringBuilder();
        for (Author1 a : authors) {
            authorsStr.append(a.toString()).append(",");
        }
        if (authorsStr.length() > 0) {
            authorsStr.setLength(authorsStr.length() - 1);
        }
        return "Book1[name=" + name + ", authors={" + authorsStr + "}, price=" + price + ", qty=" + qty + "]";
    }

    public String getAuthorName() {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            names.append(authors[i].getName());
            if (i < authors.length - 1) names.append(", ");
        }
        return names.toString();
    }
}
