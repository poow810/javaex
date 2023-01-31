package homework;

import java.util.Scanner;

class Car {
    protected String name, color, adress; // 멤버
    protected int number, speed;          // 변수

    public Car(String Name, String pcolor, String padress, int pnumber, int pspeed) {
        name = Name;
        color = pcolor;
        adress = padress;
        number = pnumber;
        speed = pspeed;
    }

    public void setName(String pname) {
        name = pname;
    }

    public String getName() {
        return name;
    }

    public void setColor(String pcolor) {
        color = pcolor;
    }

    public String getColor() {
        return color;
    }

    public void setAdress(String padress) {
        adress = padress;
    }

    public String getAdress() {
        return adress;
    }

    public void setNumber(int pnumber) {
        number = pnumber;
    }

    public int getNumber() {
        return number;
    }

    public void setSpeed(int pspeed) {
        speed = pspeed;
    }

    public int getSpeed() {
        return speed;
    }

}


public class Car_2 {
    public static void main(String[] args) {
        String myname, mycolor, myadress;
        int mynumber, myspeed;
        Scanner in = new Scanner(System.in);
        System.out.print("차 이름을 입력하시오. : ");
        myname = in.nextLine();
        System.out.print("차 색을 입력하시오. : ");
        mycolor = in.nextLine();
        System.out.print("차량 번호를 입력하시오. : ");
        mynumber = in.nextInt();
        in.nextLine();
        System.out.print("운전자 주소를 입력하시오. : ");
        myadress = in.nextLine();
        System.out.print("속도를 입력하시오. : ");
        myspeed = in.nextInt();
        Car car = new Car(myname, mycolor, myadress, mynumber, myspeed);


        System.out.printf("차 이름 : %s\n", car.getName());
        System.out.printf("차 색 : %s\n", car.getColor());
        System.out.printf("차량 번호 : %d\n", car.getNumber());
        System.out.printf("운전자 주소 : %s\n", car.getAdress());
        System.out.printf("속도 : %d\n", car.getSpeed());
    }
}

