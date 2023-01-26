package edu.ifforex;

import java.util.Scanner;

public class IfForEx0126 {
    public static void main(String[] args) {
        int a = 0;

        if (a > 0) {
            System.out.printf("a = %d는 양수임\n", a);
        } else if (a < 0) {
            System.out.printf("a = %d는 음수임\n", a);

        }
        else{
            System.out.printf("a = %d\n", a);
        }
        // 학점 판별 문제
        Scanner sc = new Scanner(System.in);
        System.out.println("JAVA점수 입력(0~100점) : ");
        int score = sc.nextInt();
        String grade;
        if (score >= 90 ){
            grade = "A";
        }
        else if (score >= 80 ){
            grade = "B";
        }
        else if (score >= 70) {
            grade = "C";
        }
        else if (score >= 60){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.printf("학점은 : %s\n", grade);


        if (score%10 >=9){
            grade="A";
        }
        else if (score%10 >=8){
            grade="B";
        }
        System.out.println("학점은 "+ grade);
    }
}