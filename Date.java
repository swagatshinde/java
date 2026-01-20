// Question: Write a Java program to define a class MyDate with day, month, and year.
// Create a user-defined exception InvalidDateException.
// Accept a date from the user and validate it (handle month limits and leap years).
// If the date is invalid, throw the exception; otherwise, display the date in dd/mm/yyyy format.

import java.util.Scanner;

class InvalidDateException extends Exception {
    public InvalidDateException(String msg) {
        super(msg);
    }
}

class MyDate {
	
	
    int day, month, year;

    public void acceptDate() throws InvalidDateException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day (dd): ");
        day = sc.nextInt();
        System.out.print("Enter month (mm): ");
        month = sc.nextInt();
        System.out.print("Enter year (yyyy): ");
        year = sc.nextInt();

        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid Date Entered!");
        }
    }

    public void displayDate() {
        System.out.println("Date: " + String.format("%02d/%02d/%04d", day, month, year));
    }

    private boolean isValidDate(int d, int m, int y) {
        if (y < 1 || m < 1 || m > 12 || d < 1) return false;
        int[] daysInMonth = {31, (isLeap(y) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return d <= daysInMonth[m - 1];
    }

    private boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}

public class Date {
    public static void main(String[] args) {
        System.out.println("Q1: MyDate Validation");
        MyDate d = new MyDate();
        try {
            d.acceptDate();
            d.displayDate();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }

    }
}



