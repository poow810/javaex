package edu.oopfirst;

import java.util.Scanner;

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
    //기본생성자(default constructor) - 생성자 앞에는 반환 type 쓰지않는다.
    static char blood = 'A';
    public static void display(){
        System.out.printf("display() 메서드 안 blood = %s\n", blood);
    }
    public Person(){
        System.out.println("난 Person 기본생성자");
    }


    public Person(String pname, int page) {
        name = pname;
        age = page;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String pname) { // name 변수에 접근 가능
        name = pname;
    }

    public String getName() {
        return name;

    }
    public void talk() {      // public을 붙여주지 않으면 다른 클래스의 메소드에 접근 불가
        name = "아무개";
        System.out.println("talk() 메서드이다.");
    }         // talk 앞에 반환하는 type를 붙여주어야함 (int, string 등)
    public void talk(String shouting){
        System.out.printf("shouting=%s\n", shouting);
    }
    public void talk(String shouting, int page){        // parameter의 개수가 다르면 서로 다른 메서드로 취급한다
        System.out.printf("shouting=%s\n", shouting);
        System.out.printf("shouting=%d\n", page);
    }
    public void talk(int page,String shouting){
        System.out.printf("shouting=%d\n", page);
        System.out.printf("shouting=%s\n", shouting);
    }

    public void breathe() {
        age=1;
    }
}

public class OOPOne0130 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String myname ;
        int myage ;
        System.out.print("이름을 입력하세요 : ");
        myname = in.nextLine();
        System.out.print("나이를 입력하세요 : ");
        myage = in.nextInt();
        Person hyunbin = new Person(myname, myage);
        System.out.printf("hodong.name = %s\n", hyunbin.getName());
        System.out.printf("hodong.age = %d\n", hyunbin.getAge());


        Person hodong = new Person("호동", 45);
        System.out.printf("hodong.name=%s\n", hodong.getName());
        System.out.printf("hodong.age=%d\n", hodong.getAge());
        Person gildong = new Person();            // 위에선 Person을 class로 지정했지만 여기선 함수로 지정 -> class Person을 복제
        // Person()은 매개변수가 없는 생성자 = 기본 생성자(default constructor) - 컴파일러가 자동으로 만들어줌
        // gildong은 변수이다 = 객체를 참조함, Person을 참조하고 있으니 type도 Person
        // gildong.name = "길동";
        gildong.setName("길동"); // setName을 호출
        gildong.setAge(23);
//        System.out.printf("gildong.name=%s\n", gildong.name);
        System.out.printf("gildong.age=%d\n", gildong.getAge()); // name과 age에 접근할 수 있도록 간접적으로 메소드를 만들어주어야함.
        System.out.printf("gildong.name=%s\n", gildong.getName());

        gildong.talk();
        gildong.talk("열공하자");
        gildong.talk("박하운", 25);
        gildong.talk(gildong.getAge(), "길동");
        Person.display();
    }
}

/* 스택 영역 : main함수의 stack
   힙 영역(종적 메모리) : 인스턴스 객체

   main 함수에서 변수에 접근하기 */

// 생성자, set, get