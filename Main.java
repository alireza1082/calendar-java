import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 1401): ");
        int year = scanner.nextInt();

        System.out.print("Enter month in number between 1 and 12: ");
        int month = scanner.nextInt();
        String a = getMonthName(month);

        System.out.print("\t\t\t--" + year + "  " + a + " \n");
        System.out.print(
                "جمعه" +
                        "\t\tينج‌شنبه" +
                        "\t\tجهارشنبه" +
                        "\t\tسه‌شنبه" +
                        "\t\tدوشنبه" +
                        "\t\tبكشنبه" +
                        "\t\tشنبه\n");

        System.out.print("End");
    }

    private static String getMonthName(int month) {
        String a = "";
        switch (month) {
            case 1:
                a = "January";
                break;
            case 2:
                a = "February";
                break;
            case 3:
                a = "March";
                break;
            case 4:
                a = "April";
                break;
            case 5:
                a = "May";
                break;
            case 6:
                a = "June";
                break;
            case 7:
                a = "July";
                break;
            case 8:
                a = "August";
                break;
            case 9:
                a = "September";
                break;
            case 10:
                a = "October";
                break;
            case 11:
                a = "November";
                break;
            case 12:
                a = "December";
            default:
        }
        return a;
    }
}
