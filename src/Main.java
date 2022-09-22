public class Main {
    // ДЗ 1.
    public static void leapYear(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " - Год високосный");
        } else {
            System.out.println(year + " - Год не високосный");
        }
    }

    public static void main(String[] args) {
        int year = 2022;
        leapYear(year);


    }

}
