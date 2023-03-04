package home.work;

import java.util.Arrays;
import java.util.Scanner;

public class Homework0201 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int[] temp = new int[num.length];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        for (int j = 0; j < (num.length); j = j + 2) {
            temp[j] = num[j + 1];
            num[j + 1] = num[j];
            num[j] = temp[j];
        }


        System.out.println(Arrays.toString(num));
    }
}
