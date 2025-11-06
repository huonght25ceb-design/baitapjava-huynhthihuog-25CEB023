package baitap4_2;

public class TestPerson {
    public static void main(String[] args){
        Person person1 = new Person("John Doe", "123 Main Street");
        System.out.println("✓ Created Person object");
        System.out.println("  toString(): " + person1);

        // Test getter methods
        System.out.println("\n► Testing getter methods:");
        System.out.println("  getName(): " + person1.getName());
        System.out.println("  getAddress(): " + person1.getAddress());

        // Test setter method
        System.out.println("\n► Testing setter method:");
        System.out.println("  Before setAddress: " + person1.getAddress());
        person1.setAddress("456 Elm Street");
        System.out.println("  After setAddress: " + person1.getAddress());
        System.out.println("  toString(): " + person1);

        System.out.println("\n✓ Person class test completed!\n");

        Student student1 = new Student("Jane Smith", "789 Oak Avenue",
                "Computer Science", 2, 15000.50);
        System.out.println("✓ Created Student object");
        System.out.println("  toString(): " + student1);

        // Test inherited getter methods từ Person
        System.out.println("\n► Testing inherited methods from Person:");
        System.out.println("  getName(): " + student1.getName());
        System.out.println("  getAddress(): " + student1.getAddress());

        // Test Student-specific getter methods
        System.out.println("\n► Testing Student-specific getter methods:");
        System.out.println("  getProgram(): " + student1.getProgram());
        System.out.println("  getYear(): " + student1.getYear());
        System.out.println("  getFee(): $" + student1.getFee());

        // Test setter methods
        System.out.println("\n► Testing setter methods:");
        System.out.println("  Before changes:");
        System.out.println("    Address: " + student1.getAddress());
        System.out.println("    Program: " + student1.getProgram());
        System.out.println("    Year: " + student1.getYear());
        System.out.println("    Fee: $" + student1.getFee());

        student1.setAddress("101 Pine Street");
        student1.setProgram("Information Technology");
        student1.setYear(3);
        student1.setFee(16500.75);

        System.out.println("\n  After changes:");
        System.out.println("    Address: " + student1.getAddress());
        System.out.println("    Program: " + student1.getProgram());
        System.out.println("    Year: " + student1.getYear());
        System.out.println("    Fee: $" + student1.getFee());
        System.out.println("  toString(): " + student1);

        System.out.println("\n✓ Student class test completed!\n");

        Staff staff1 = new Staff("Bob Johnson", "202 Maple Drive",
                "NTU Engineering", 55000.00);
        System.out.println("✓ Created Staff object");
        System.out.println("  toString(): " + staff1);

        // Test inherited getter methods từ Person
        System.out.println("\n► Testing inherited methods from Person:");
        System.out.println("  getName(): " + staff1.getName());
        System.out.println("  getAddress(): " + staff1.getAddress());

        // Test Staff-specific getter methods
        System.out.println("\n► Testing Staff-specific getter methods:");
        System.out.println("  getSchool(): " + staff1.getSchool());
        System.out.println("  getPay(): $" + staff1.getPay());

        // Test setter methods
        System.out.println("\n► Testing setter methods:");
        System.out.println("  Before changes:");
        System.out.println("    Address: " + staff1.getAddress());
        System.out.println("    School: " + staff1.getSchool());
        System.out.println("    Pay: $" + staff1.getPay());

        staff1.setAddress("303 Cedar Lane");
        staff1.setSchool("NTU Science");
        staff1.setPay(60000.00);

        System.out.println("\n  After changes:");
        System.out.println("    Address: " + staff1.getAddress());
        System.out.println("    School: " + staff1.getSchool());
        System.out.println("    Pay: $" + staff1.getPay());
        System.out.println("  toString(): " + staff1);

        System.out.println("\n✓ Staff class test completed!\n");

        System.out.println("► Creating array of Person references:");
        Person p1 = new Person("Alice Brown", "111 First St");
        Person p2 = new Student("Charlie Davis", "222 Second St", "Engineering", 1, 12000);
        Person p3 = new Staff("Diana Evans", "333 Third St", "School of Arts", 45000);

        Person[] people = {p1, p2, p3};

        System.out.println("\n► Calling toString() on each Person reference:");
        for (int i = 0; i < people.length; i++) {
            System.out.println("  [" + i + "] " + people[i].toString());
        }

        System.out.println("\n✓ Each object calls its own version of toString()!");
        System.out.println("  (Demonstrates method overriding)\n");

        Student student2 = new Student("Frank Green", "444 Fourth St",
                "Data Science", 4, 18000);

        System.out.println("► Student object can access:");
        System.out.println("  • Inherited from Person:");
        System.out.println("    - getName(): " + student2.getName());
        System.out.println("    - getAddress(): " + student2.getAddress());
        System.out.println("    - setAddress(): ");
        student2.setAddress("555 Fifth St");
        System.out.println(student2.getAddress());

        System.out.println("\n  • Own methods:");
        System.out.println("    - getProgram(): " + student2.getProgram());
        System.out.println("    - getYear(): " + student2.getYear());
        System.out.println("    - getFee(): $" + student2.getFee());

        System.out.println("\n✓ Inheritance test completed!\n");



    }
}
