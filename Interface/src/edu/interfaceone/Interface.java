package edu.interfaceone;

interface IVehicle {
    public static final int makeYear = 2022;

    public abstract void start();

    default public void stop() {
        System.out.println("정지한다");
    }

    private void show() {
        System.out.println("제조년도 : " + makeYear);
    }

    public static void turn() {
        System.out.println("방향전환한다.");
    }

    static class price {
        int salePercent = 10;
    }
}
class Car implements IVehicle{
    @Override
    public void start() {

    }
}

public class Interface {
    public static void main(String[] args) {
    }
}
