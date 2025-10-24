package baitap2_5;

public class Customer1 {
    private int id;
    private String name;
    private char gender;

    public Customer1(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender; // 'm' hoặc 'f'
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public char getGender() { return gender; }

    public String toString() {
        return name + "(" + id + ")";
    }
}
