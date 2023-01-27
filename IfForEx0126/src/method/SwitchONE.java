package method;

import java.util.Scanner;

public class SwitchONE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        int share = score / 10;

        switch (share) {
            case 10, 9 -> System.out.println("A학점");
            case 8 -> System.out.println("B학점");
            case 7 -> System.out.println("C학점");
            case 6 -> System.out.println("D학점");
            default -> System.out.println("F학점"); // default는 else와 같은 의미
        }

    }
}


