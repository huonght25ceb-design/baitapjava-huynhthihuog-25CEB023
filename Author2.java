package baitap2_3;

public class Author2 {
    private String name, email;

    public Author2(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author2[name=" + name + ", email=" + email + "]";
    }
}
