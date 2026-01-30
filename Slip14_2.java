package Slip1;

import java.util.Scanner;
import Sy.SYmarks;
import ty.TYmarks;

class Student {
    int rollNo;
    String name;
    SYmarks sy;
    TYmarks ty;

    Student(int rollNo, String name, SYmarks sy, TYmarks ty) {
        this.rollNo = rollNo;
        this.name = name;
        this.sy = sy;
        this.ty = ty;
    }

    void displayResult() {
        int total = sy.ctotal + ty.theory + ty.practical;
        float average = total / 3.0f;
        String grade;

        if (average >= 70)
            grade = "A";
        else if (average >= 60)
            grade = "B";
        else if (average >= 50)
            grade = "C";
        else if (average >= 40)
            grade = "Pass Class";
        else
            grade = "FAIL";

        System.out.println("\n--------------------------");
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Name      : " + name);
        System.out.println("SY Computer Marks : " + sy.ctotal);
        System.out.println("TY Theory Marks   : " + ty.theory);
        System.out.println("TY Practicals     : " + ty.practical);
        System.out.println("Total (Computer Subjects) : " + total);
        System.out.println("Average           : " + average);
        System.out.println("Grade             : " + grade);
    }
}

public class Slip14_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("SY Computer Marks: ");
            int syComp = sc.nextInt();
            System.out.print("SY Maths Marks: ");
            int syMaths = sc.nextInt();
            System.out.print("SY Electronics Marks: ");
            int syElec = sc.nextInt();

            SYmarks sy = new SYmarks(syComp, syMaths, syElec);

            System.out.print("TY Theory Marks: ");
            int tyTheory = sc.nextInt();
            System.out.print("TY Practicals Marks: ");
            int tyPrac = sc.nextInt();

            TYmarks ty = new TYmarks(tyTheory, tyPrac);

            students[i] = new Student(rollNo, name, sy, ty);
        }

        // Display all results
        System.out.println("\n*********** Student Results ***********");
        for (Student s : students) {
            s.displayResult();
        }
    }
}
