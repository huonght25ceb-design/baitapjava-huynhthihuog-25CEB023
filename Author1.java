package baitap2_2;

public class Author1 {
    private String name;
    private String email;
    private char gender;

    public Author1(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String email() {
        return email;
    }
    public char gender() {
        return gender;
    }
    public String toString() {
        return "[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }

}
