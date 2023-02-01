package edu.polymor;
abstract class Mammal {
    public Mammal(){
        System.out.println("난 Mammal 기본 생성자");
    }
    abstract public void moving();
    public void talk(){
    }
    public void show(){

    }
}
abstract class Person extends Mammal{
    protected final int IQ = 140;
    protected String name;
    protected int age;

    public Person() {
        System.out.println("나는 Person class 기본 생성자");
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
        System.out.println("나는 매개변수 두 개인 Person 생성자");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }
    public void show(){
        System.out.println(this.name+","+this.age);
    }
    public void talk(){
        System.out.println("Person의 talk() 메서드이다.");
    }
    public void moving(){
    }

}

class Man extends Person {
    private final int IQ = 150;
    private int money;

    private String job;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getjob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Man() {
        System.out.println("나는 Man class의 기본 생성자");
    }

    public Man(String name, int age, int money, String job) {
        super(name, age);
        this.money = money;
        this.job = job;

        System.out.println("난 인자 4개인 Man 생성자");
    }

    public void talk() {// public을 붙여주지 않으면 다른 클래스의 메소드에 접근 불가
        name = "재석";
        System.out.println("talk() 메서드이다.");
    }         // talk 앞에 반환하는 type를 붙여주어야함 (int, string 등)
    public void show() {
        System.out.println(name + "," + age + "," + money + "," + job);
        System.out.print(super.IQ);
    }
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
    public void moving(){
        System.out.println("Man이 움직인다");
    }
}

public class polymor0201 {
    public static void main(String[] args) {
        Mammal jaesuk = new Man("유재석", 51, 70000, "국민 MC");
        jaesuk.talk();
        jaesuk.show();
        jaesuk.moving();
    }
}
