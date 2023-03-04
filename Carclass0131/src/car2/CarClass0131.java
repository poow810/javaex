package car2;

import java.util.Scanner;

class Car {
    protected String name, color, adress;
    protected int velo, num;

    public Car() {
    }

    public Car(String name, String color, String adress, int velo, int num) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setAdress(String adress) {
        this.color = color;
    }

    public String getAdress() {
        return adress;
    }

    public void setVelo(int velo) {
        this.velo = velo;
    }

    public int getVelo() {
        return velo;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

class RentCar extends Car {
    public RentCar() {
    }

    private int fare;
    private String comp;

    public RentCar(String name, String color, String adress, int velo, int num, String comp, int fare) {
        super(name, color, adress, velo, num);
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getComp() {
        return comp;
    }
}

class CarClass0131 {
    public static void main(String[] args) {
        RentCar rentCar = new RentCar();
        Scanner in = new Scanner(System.in);
        System.out.print("자동차종류 입력하시오 : ");
        rentCar.setName(in.nextLine());
        System.out.print("자동차색깔 입력하시오 : ");
        rentCar.setColor(in.nextLine());
        System.out.print("자동차번호 입력하시오 : ");
        rentCar.setNum(in.nextInt());
        in.nextLine();
        System.out.print("운전자주소 입력하시오 : ");
        rentCar.setAdress(in.nextLine());
        System.out.print("자동차속도 입력하시오 : ");
        rentCar.setVelo(in.nextInt());
        in.nextLine();
        System.out.print("렌트비를 입력하시오 : ");
        rentCar.setFare(in.nextInt());
        in.nextLine();
        System.out.print("렌트회사를 입력하시오 : ");
        rentCar.setComp(in.nextLine());

        int up, down;
        System.out.print("속도를 얼마나 올리시겠습니까 : ");
        up = in.nextInt();
        System.out.println("현재 자동차의 속도는 시속 " + (rentCar.velo + up) + "km/h 입니다.");
        in.nextLine();
        System.out.print("속도를 얼마나 내리시겠습니까 : ");
        down = in.nextInt();
        System.out.println("현재 자동차의 속도는 시속 " + (rentCar.velo + up - down) + "km/h 입니다.");
    }
}