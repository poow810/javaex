package Carrier;

public class Driver {
    public void drive(Vehicle vehicle){
        vehicle.run(); // 자식 객체들이 재정의한 run() 메소드를 호출한다
    }
}
