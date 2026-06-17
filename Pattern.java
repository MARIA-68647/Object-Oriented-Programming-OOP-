
package com.mycompany.test;

 import java.util.Scanner;

class NumberPattern {
    int n;

    NumberPattern(int n) {
        this.n = n;
    }

    void printPattern() {
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Please enter a positive number.");
        }
    }
}

public class Pattern {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        NumberPattern pattern = new NumberPattern(rows);
        pattern.printPattern();

        input.close();
    }
}
    

