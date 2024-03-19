import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String message1,message2,message3,message4,message5;
        int year,calculator1,calculator2,calculator3;

        message1 = "Welcome to leap year calculator";
        message2 = "Please enter the year you want to calculate : ";
        message3 = " is a leap year.";
        message4 = " is not a leap year.";

        System.out.print(message1 + "\n" + message2);
        year = entry.nextInt();

        calculator1 = year % 4;
        calculator2 = year % 100;
        calculator3 = year % 400;

        if (calculator1 == 0){
            if (calculator2 == 0){
                if (calculator3 == 0)
                System.out.println(year + message3);

            } else {
                System.out.println(year + message3);
            }
        } else {
            System.out.println(year + message4);
        }

    }
}
