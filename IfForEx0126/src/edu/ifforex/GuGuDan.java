package edu.ifforex;

public class GuGuDan {
    public static void main(String[] args) {
        int dan = 2, val = 1;
        for (dan = 2; dan <= 9; dan++) {
            if (dan==6)
                break;
            for (val = 1; val <= 9; val++) {
                      // continue는 무시하라는 의미(4를 건너뜀)
                System.out.printf("%d * %d = %d\n", dan, val, dan * val);
            }
        }
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("i=%d\t", i);
            if (i == 6)
                break;
        }
    }
}