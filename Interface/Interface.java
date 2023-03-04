package Interface;

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

    public abstract void drive();

    static class price {
        int salePercent = 10;
    }
}
class Carrier{
    public void fetch(){
        System.out.println("승객을 운반하다");
    }
}
class Car extends Carrier implements IVehicle { // 다중 상속의 형태
    public void fetch(){
        System.out.println("Car가 승객을 탑승시킴");
    }
    public void drive() {
        System.out.println("Car 타고 드라이브");
    }

    public Car() {
        System.out.println("Car 기본 생성자");
    }

    public void stop() {
        System.out.println("Car가 정지한다.");
    }

    @Override
    public void start() {
        System.out.println("Car가 출발한다.");
    }
}
interface ITerran{
    public abstract void terranAttack();

}
interface IProtoss{
    public abstract void protossAttack();
}
interface IZerg {
    public abstract void display();
    default public void zergAttack() {
        System.out.println("Zerg 공격 개시");
    }


}

interface IGame extends ITerran, IZerg, IProtoss{
    public abstract void Goodgame();


}
class StarCraft implements IGame{

    @Override
    public void Goodgame() {
        System.out.println("좋은 게임이었습니다.");
    }

    @Override
    public void display() {
        System.out.println("Zerg 종족 개수 표시");
    }

    @Override
    public void terranAttack() {
        System.out.println("Terran 공격 개시");
    }

    @Override
    public void protossAttack() {
        System.out.println("Protoss 공격 개시");
    }
}
public class Interface {
    public static void main(String[] args) {
        IGame yunel = new StarCraft();
        yunel.display();
        yunel.terranAttack();
        yunel.zergAttack();
        yunel.protossAttack();
        yunel.Goodgame();
        /* Mammal ob = new Mammal();
           추상 클래스는 객체 생성 불가
           IVehicle iob = new IVehicle();
           인터페이스 단독으로는 객체 생성 불가
         */
//        Car k5 = new Car();
        IVehicle k5 = new Car();
        k5.start();
        k5.stop();
        IVehicle.turn();
        k5.drive();

    }
}
