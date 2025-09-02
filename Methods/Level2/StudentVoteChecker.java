package Level_2_Java_Methods_Practice_Problems;

import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
            System.out.println("Student " + (i + 1) + (canStudentVote(ages[i]) ? " can vote" : " cannot vote"));
        }
    }
}
