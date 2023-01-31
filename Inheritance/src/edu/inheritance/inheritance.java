package edu.inheritance;
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
public class inheritance{
    public static void main(String[] args) {

    }
}
