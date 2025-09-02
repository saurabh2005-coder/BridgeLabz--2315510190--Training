package Level_2_Arrays_Practice_Programs;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " in Physics, Chemistry, Maths:");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 80) grade[i] = 'B';
            else if (percentage[i] >= 70) grade[i] = 'C';
            else if (percentage[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Percentage = %.2f, Grade = %c\n", i + 1, percentage[i], grade[i]);
        }
        
        sc.close();
    }
}

