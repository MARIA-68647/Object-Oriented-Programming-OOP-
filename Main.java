
package com.mycompany.test;
import java.util.Scanner;

class GradeCalculator {
    double obtainedMarks;
    double totalMarks;

    GradeCalculator(double obtainedMarks, double totalMarks) {
        this.obtainedMarks = obtainedMarks;
        this.totalMarks = totalMarks;
    }

    void calculateGrade() {
        double percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = input.nextDouble();

        System.out.print("Enter Total Marks: ");
        double totalMarks = input.nextDouble();

        GradeCalculator student = new GradeCalculator(obtainedMarks, totalMarks);
        student.calculateGrade();

        input.close();
    }
}