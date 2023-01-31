package edu.inheritance;
class Person {
    protected String name;
    protected int age;

    static char blood = 'A';
    public static void display(){
        System.out.printf("display() 메서드 안 blood = %s\n", blood);
    }
    public Person(){
        System.out.println("나는 Person class의 기본 생성자");
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
    public void setName(String pname) {
        name = pname;
    }

    public String getName() {
        return name;

    }
    public void talk() {
        name = "아무개";
        System.out.println("talk() 메서드이다.");
    }
    public void talk(String shouting){
        System.out.printf("shouting=%s\n", shouting);
    }
    public void talk(String shouting, int page){
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
class Man extends Person{
    private int money;
    private String job;
    public void show(){
        System.out.println(name);
        System.out.println(money);
        System.out.println(job);
    }
    public Man(){
        System.out.println("나는 Man class의 기본 생성자");
    }
    public void work(){
        System.out.println("Man이 일한다.");
    }
}
public class inheritance{
    public static void main(String[] args) {
        Person chulsu = new Person();
        chulsu.name = "철수";
        System.out.println(chulsu.name);
        Man wonbin = new Man(); // 새로운 객체 생성
        wonbin.setName("원빈"); // Man class에서 setName을 먼저 찾고 없다면
                               // 상위 class인 Person class로 가서 찾는다
        wonbin.work();
        System.out.println(wonbin.getName());

    }
}
