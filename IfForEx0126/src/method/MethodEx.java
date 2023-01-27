package method;

public class MethodEx {
    public static void main(String[] args) {
    /* public : 접근 권한 지정자
       void : main 함수가 반환하는 값이 없다는 뜻
       main 함수 내에서는 return 사용 x
       static : 정적 변수로 memory 변화가 없는 정적 기억 공간을 선언(컴파일 단계에서 생성)
       정적 기억 공간은 class 이름으로 접근하는 것을 권장
     */
        int a = 3, b = 5, res = 0;
        res = sum(a, b);
        System.out.println("res = " + res);

    }
    public static int sum(int pa, int pb)
    { int total = 0;
        total = pa + pb;
        return total;

    }
}
