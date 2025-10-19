package baitap1_7;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(01, 02, 2014);
        System.out.println(d1);
        Date d2 = new Date(9, 12, 2099);
        System.out.println(d2.toString());

        System.out.println("Month: " + d2.getMonth());
        System.out.println("Day: " + d2.getDay());
        System.out.println("Year: " + d2.getYear());

        Date d3 = new Date(03, 04, 2016);
        System.out.println(d3);
    }
}
