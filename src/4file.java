import java.util.Scanner;

public class file4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String arr[] = new String[12];
        arr[0] = "January";
        arr[1] = "February";
        arr[2] = "March";
        arr[3] = "April";
        arr[4] = "May";
        arr[5] = "June";
        arr[6] = "July";
        arr[7] = "August";
        arr[8] = "September";
        arr[9] = "October";
        arr[10] = "November";
        arr[11] = "December";

        int month;
        month = in.nextInt();

        if( month>12 || month < 1) {
            System.out.println("Ошибка(неверный порядковый номер месяца)");
            return ;
        }
        System.out.println(arr[month-1]);

    }
}
