package edu.inha.scanner;

import java.util.Scanner;

public class ScannerEx0126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0;
        char blood = '\0' ;
        String name = null ;  // null은 0을 의미
        System.out.print("나이를 입력:");
        age = sc.nextInt();
        System.out.printf("age=%d\n", age);
        System.out.println("혈액형 입력 :");

    }
}
