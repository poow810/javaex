package homework;

import java.util.Scanner;

class Car {
    protected String name, color, adress; // 멤버
    protected int number, speed;          // 변수

    public Car(){
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getAdress() {
        return adress;
    }
    public int getNumber() {
        return number;
    }
    public int getSpeed() {
        return speed;
    }

}
class LentCar extends Car{
    private int fare;
    private String comp;
    public void setFare(int fare){
        this.fare = fare;
    }
    public int getFare(){
        return fare;
    }
    public String getComp(){
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }
}

public class Car_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LentCar lentCar = new LentCar();
        System.out.print("자동차종류 입력하시오 : ");
        lentCar.name = in.nextLine();
        System.out.print("자동차색깔 입력하시오 : ");
        lentCar.color = in.nextLine();
        System.out.print("자동차번호 입력하시오 : ");
        lentCar.number = in.nextInt();
        in.nextLine();
        System.out.print("운전자주소 입력하시오 : ");
        lentCar.adress = in.nextLine();
        System.out.print("자동차속도 입력하시오 : ");
        lentCar.speed = in.nextInt();
        in.nextLine();
        System.out.print("렌트비를 입력하시오 : ");
        lentCar.setFare(in.nextInt());
        in.nextLine();
        System.out.print("렌트회사를 입력하시오 : ");
        lentCar.setComp(in.nextLine());
        int up, down;



        System.out.printf("자동차종류 : %s\n", lentCar.name);
        System.out.printf("자동차색깔 : %s\n", lentCar.color);
        System.out.printf("자동차번호 : %d\n", lentCar.number);
        System.out.printf("운전자주소 : %s\n", lentCar.adress);
        System.out.printf("현재 자동차의 속도는 시속 %dkm/h 입니다.\n", lentCar.speed);
        System.out.println("렌트요금 : "+ lentCar.getFare());
        System.out.println("렌트회사명 : "+ lentCar.getComp());
        System.out.print("속도를 얼마나 올리시겠습니까 : ");
        up = in.nextInt();
        System.out.println("현재 자동차의 속도는 시속 "+(lentCar.speed+up)+"km/h 입니다.");
        in.nextLine();
        System.out.print("속도를 얼마나 내리시겠습니까 : ");
        down = in.nextInt();
        System.out.println("현재 자동차의 속도는 시속 "+(lentCar.speed+up-down)+"km/h 입니다.");
    }
}

