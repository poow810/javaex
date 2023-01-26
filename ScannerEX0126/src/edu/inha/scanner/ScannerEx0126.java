package edu.inha.scanner;

import java.util.Scanner;

public class ScannerEx0126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0;
        char blood = '\0' ;
        String name = null ;  // null은 0을 의미
        Double height = 0.0 ;

        System.out.print("나이를 입력:");
        age = sc.nextInt();
        System.out.printf("age=%d\n", age);

        sc.nextLine();      // Inputstream buffer에서 엔터를 빼감.

        System.out.print("이름 입력 :");
        name = sc.nextLine();      // nextline은 공백을 포함하여 반환하기 때문에 이름 사이 공백 또한 가져옴
        System.out.printf("name=%s\n", name);

        System.out.print("혈액형 입력 :");       // 혈액형 A같은 문자 하나는 어떻게 읽어올까?
        blood = sc.next().charAt(0);           // charAt(x)이라는 함수를 통해 문자열배열에서 x번째 문자를 호출
        System.out.printf("blood=%c\n", blood);

        System.out.print("키값 입력 :");
        height = sc.nextDouble();
        System.out.printf("height =%.2f", height);
        /* 입력 순서에 따른 출력 결과 차이 발생
        이름-나이-혈액형 순일때는 결과 출력
        but, 나이-이름-혈액형 순일때는 이름 입력을 받지 않아도 공백출력
        why? 나이를 입력받을 때 (정수)(엔터) nextInt함수가 정수까지만 읽음. 따라서 age에 정수가 입력받고 age는 정상출력
        하지만 (엔터)는 그대로 남아있어 이름 입력 시 nextLine이 (엔터)를 읽음. 이것을 Null로 변환하여 return.
        name에 null이 들어감.
        nextline을 next로 바꾼다면? 정상 실행됨. next는 공백을 읽지 못함.
        */

    }
}
