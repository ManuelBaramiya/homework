package homework.baramiya.Class.Java;

public class Class5 {
    public static void main (String[] args) {
        int year = 2020;
        if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
            System.out.println("год високосный"); }
        else {
            System.out.println("год не високосный"); }
        }
    }
