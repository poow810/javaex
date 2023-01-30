package edu.oopfirst;

/* 객체 지향 프로그래밍
장점 4가지 중 가장 핵심 - 재사용성 향상(코드 재활용 가능)
객체의 필수 구성 요소 - 멤버 변수, 상수 / 객체의 고유한 행위 - 멤버 함수
객체 -> 추상화 -> 클래스
객체 <- 인스턴스화 <-클래스
 */
class Person {
    private String name; // 접근 권한 지정자 private는 접근 권한 x
    private int age; // 캡슐화(private)
    // 1) information hiding / 2) class bonding

    public void setName() { // name 변수에 접근 가능
        name = "길동";
    }

    public void talk() {      // public을 붙여주지 않으면 다른 클래스의 메소드에 접근 불가
        name = "아무개";
        System.out.println("talk() 메서드이다.");
    }         // talk 앞에 반환하는 type를 붙여주어야함 (int, string 등)

    public void breathe() {
        age = 26;
        System.out.println("breathe() 메서드이다.");
    }
}

public class OOPOne0130 {
    public static void main(String[] args) {
        Person gildong = new Person();            // 위에선 Person을 class로 지정했지만 여기선 함수로 지정 -> class Person을 복제
                                                  // gildong은 변수이다 = 객체를 참조함, Person을 참조하고 있으니 type도 Person
        // gildong.name = "길동";
        gildong.setName(); // setName을 호출
        gildong.age = 23;
        System.out.printf("gildong.name=%s\n", );
        System.out.printf("gildong.age=%d\n", gildong.age); // name과 age에 접근할 수 있도록 간접적으로 메소드를 만들어주어야함.
        gildong.talk();                                    // -공개된 인터페이스를 통해서.
    }
}

/* 스택 영역 : main함수의 stack
   힙 영역(종적 메모리) : 인스턴스 객체

   main 함수에서 변수에 접근하기
 */