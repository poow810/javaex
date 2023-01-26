public class OperatorEx {
    public static void main(String[] args){
        int a = 1;
        System.out.printf("a=%d\n", a);
        a = a + 1;
        System.out.printf("a=%d\n", a);
        ++a ;
        System.out.printf("++a후의 a=%d\n", a);
        System.out.printf("++a후의 a=%d\n", ++a); //a값 증가시킨 뒤 연산
        System.out.printf("++a후의 a=%d\n", a++); //연산 후 a값 증가시켜줌
        System.out.printf("++a후의 a=%d\n", a);

        int b = 9;
        System.out.printf("b의 값은 :%d\n", b);
        b = b - 1;
        System.out.printf("b의 값은 :%d\n", b);
        System.out.printf("b의 값은 :%d\n", b--);

        int c = 8, d = 7;
        int max = (c>d)? c : d ; // 3항연산자 : (관계연산)? x:y은 관계연산이 true면 x값 반환, false면 y반환
        System.out.println(max);
    }

}
