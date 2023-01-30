import java.util.Scanner;

public class PrimeNumber_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        isPrime(number);




    }
    public static int isPrime(int number){
        int i, j ;
        int count = 0 ;
        int add = 0;
        for (i=2; i<=number; i++){       // number가 1, 2일때는 예외처리 해줘야함
             for (j=2; j<=i; j++){
                 if (i%j==0){
                     add = add + 1;
                 }
             }
             if (add == 1){
                 count = count + 1;
                 System.out.printf("%d는 소수입니다\n", i);
             }
             add=0;

        }
        System.out.printf("소수의 개수는 %d개이다.", count);

        return add;
    }
}
