package edu.ifforex;

import java.util.Scanner;

public class day2homework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, department, adress;
        int age, english, physics, math;
        System.out.println("이름을 입력하세요!!\n");
        name = in.nextLine();
        System.out.println("학과명을 입력하세요\n");
        department = in.nextLine();
        System.out.println("영어 점수 입력:\n");
        System.out.println("물리학 점수 입력:\n");
        System.out.println("미적분학 점수 입력:\n");
        english = in.nextInt();
        physics = in.nextInt();
        math = in.nextInt();
        System.out.println("주소를 입력하세요!!\n");
        adress = in.next();
        System.out.printf("이름 = %s", name, "학과명 = %s", department );
        System.out.printf("영어 = %d", english, "물리학 = %d", physics, "미적분학 = %d", math);
        int add = english + physics + math;
        int average = add/3;
        System.out.printf("총점 = %d", add, "평균 = %d", average);
        System.out.printf("주소 = %s", adress);
    }
}
