import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("소수구하기 프로그램");
        Scanner in = new Scanner(System.in);
        System.out.print("소수를 구할 정수 한개 입력:");
        int number = in.nextInt();
        isPrime(number);
    }


    public static void isPrime(int number) {
        int i, j;
        int count = 0;
        for (i = 2; i < number; i++) {
            boolean isPrime = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
                System.out.printf("%d은(는) 소수이다.\n", i);
            }
        }
        System.out.printf("1~%d사이의 소수 개수=%d\n", number, count);
        return;
    }
}
