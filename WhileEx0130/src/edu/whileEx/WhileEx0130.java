package edu.whileEx;

public class WhileEx0130 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 7) {
            System.out.println(i);
            ++i;
        }
//        while(true)     // 조건식 항상 참이라 무한루프
//            System.out.println("While 무한반복");
        // do while문 - 중괄호 생략 불가능
        int k = 0;
        do {
            System.out.println(k);
            ++k;
        } while (k <= 7);
        // do-while과 while 차이
        // while문은 조건식이 거짓이면 아예 실행 x <-> do-while은 한 번은 실행
    }

}


/* 객체 지향 프로그래밍
장점 4가지 중 가장 핵심 - 재사용성 향상(코드 재활용 가능)
객체의 필수 구성 요소 - 멤버, 변수, 상수 / 객체의 고유한 행위 - 멤버, 함수
객체 -> 추상화 -> 클래스
객체 <- 인스턴스화 <-클래스
 */