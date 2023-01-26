package edu.inha.scanner;

import java.util.Scanner;

public class day2homework {
    public static void main(String[] args) {

        // 문제 1번 성적 입력
        Scanner in = new Scanner(System.in);
        String name, department, adress;
        int english, physics, math;
        System.out.println("이름을 입력하세요!!");
        name = in.nextLine();
        System.out.println("학과명을 입력하세요");
        department = in.nextLine();
        System.out.print("영어 점수 입력:");
        english = in.nextInt();
        System.out.print("물리학 점수 입력:");
        physics = in.nextInt();
        System.out.print("미적분학 점수 입력:");
        math = in.nextInt();
        in.nextLine();
        System.out.println("주소를 입력하세요!!");
        adress = in.nextLine();
        System.out.printf("이름 = %s, 학과명 = %s\n", name, department);
        System.out.printf("영어 = %d, 물리학 = %d, 미적분학 = %d\n", english, physics, math);
        int add = english + physics + math;
        int average = add / 3;
        System.out.printf("총점 = %d, 평균 = %.1f\n", add, (float)average);
        System.out.printf("주소 = %s\n", adress);

        // 문제 2번 윤년 판단
        int year;
        System.out.print("년도를 입력하세요 : ");
        year = in.nextInt();
        if (year / 4 == 0) {
            if (year / 100 != 0 || year / 400 == 0) {
                System.out.println("윤년");
            }
        } else {
            System.out.println("윤년이 아님");

        }

    }
}