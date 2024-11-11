import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Calendar calendar = new JalaliCalendar();
    static int year;
    static int month;
    static String monthName;
    static int monthLength;

    public static void main(String[] args) {
        getInputs();

        printMonth();
        System.out.print("End");
    }

    private static void getInputs() {
        System.out.print("Enter full year (e.g., 1401): ");
        year = scanner.nextInt();

        System.out.print("Enter month in number between 1 and 12: ");
        month = scanner.nextInt();
        monthName = getMonthName(month);
    }

    private static int calculateFirstDate() {
        JalaliCalendar.YearMonthDate a =
                new JalaliCalendar.YearMonthDate(year, month - 1, 0);
        return JalaliCalendar.dayOfWeek(a);
    }

    private static String getMonthName(int month) {
        String a = "";
        switch (month) {
            case 1:
                a = "فروردین";
                monthLength = 31;
                break;
            case 2:
                a = "اردیبهشت";
                monthLength = 31;
                break;
            case 3:
                a = "خرداد";
                monthLength = 31;
                break;
            case 4:
                a = "تیر";
                monthLength = 31;
                break;
            case 5:
                a = "مرداد";
                monthLength = 31;
                break;
            case 6:
                a = "شهریور";
                monthLength = 31;
                break;
            case 7:
                a = "مهر";
                monthLength = 30;
                break;
            case 8:
                a = "آبان";
                monthLength = 30;
                break;
            case 9:
                a = "آذر";
                monthLength = 30;
                break;
            case 10:
                a = "دی";
                monthLength = 30;
                break;
            case 11:
                a = "بهمن";
                monthLength = 30;
                break;
            case 12:
                a = "اسفند";
                monthLength = JalaliCalendar.isLeepYear(year) ? 30 : 29;
            default:
        }
        return a;
    }

    private static void printMonth() {
        System.out.print(
                "جمعه" +
                        "\t\tينج‌شنبه" +
                        "\t\tجهارشنبه" +
                        "\t\tسه‌شنبه" +
                        "\t\tدوشنبه" +
                        "\t\tبكشنبه" +
                        "\t\tشنبه\n");
        int startIndex = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 0) startIndex = 7 - calculateFirstDate();
            else startIndex = 7 * i + calculateFirstDate();
            System.out.print("   ");
            for (int j = startIndex; j > startIndex - 7 && j > 0; j--) {
                if (j > monthLength) System.out.print("\t\t\t\t");
                else System.out.print(j + "\t\t\t ");
            }
            System.out.print("\n");
        }
    }
    enum Date {
        Saturday,
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
    }
}