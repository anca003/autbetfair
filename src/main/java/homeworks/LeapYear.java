package homeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

    public static boolean isLeapYear(int nr) {
        if ((nr % 4 == 0) && (nr % 100 != 0 || nr % 400 == 0))
            return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year;

        do {
            System.out.println("Please enter a year between 1900 and 2016: ");
            year = Integer.parseInt(br.readLine());

            if (year >= 1900 && year <= 2016) {
                if (isLeapYear(year)) {
                    System.out.println(year + " is leap year and February has 29 days");
                } else {
                    System.out.println(year + " is not a leap year and February has 28 days");
                }
            }
        } while (year < 1900 || year > 2016);
    }
}







