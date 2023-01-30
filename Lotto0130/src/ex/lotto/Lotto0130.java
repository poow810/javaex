package ex.lotto;

import java.util.Scanner;

public class Lotto0130 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] lotto = new int[6]; // 원소 6개를 가진 배열 선언
        for (int i = 0; i < lotto.length; i++) {
            System.out.print("로또번호 입력 : ");
            lotto[i] = in.nextInt();
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) { // 중복될 경우
                    System.out.println("같은 번호가 있습니다");
                    i--;        // 중복 시 반복문을 한 번 더 돌려야함
                }
            }

        }
        System.out.print("입력된 로또번호 : ");
        for (int a : lotto)
            System.out.print(a + "\t");

    }
}
