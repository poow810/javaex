package edu.inheritance;

class Person {
    protected final int IQ = 140;
    protected String name;
    protected int age;

    public Person() {
        System.out.println("나는 Person class의 기본 생성자");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("1");
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

}

class Man extends Person {
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

    public Man(String name, int age, int money, int IQ, String job) {
        super(name, age);
        this.money = money;
        this.job = job;
    }
    public void show(){
        System.out.print(name+","+age+","+money+","+job);
        System.out.println(IQ);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Person chulsu = new Person();
        chulsu.name = "철수";
        System.out.println(chulsu.name);
        Man wonbin = new Man();  // 새로운 객체 생성
        wonbin.setName("원빈");   // Man class에서 setName을 먼저 찾고 없다면
        // 상위 class인 Person class로 가서 찾는다
        System.out.println(wonbin.getName());
        wonbin.setJob("연예인");
        System.out.println();
        System.out.println(wonbin.getjob());

        Man jaesuk = new Man("유재석", 51, 70000, 150, "국민 MC");
        jaesuk.show();
    }


}
