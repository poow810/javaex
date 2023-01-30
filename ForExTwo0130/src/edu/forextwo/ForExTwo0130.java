package edu.forextwo;

public class ForExTwo0130 {
    public static void main(String[] args) {
//        for ( ; ; )         // 무한 루프 시작
//            System.out.println("book")
        int num[] = {1, 2, 3}; // []는 {}속 정수들을 배열로 각각 4byte의 공간에 배열시킨다는 의미

        // 새로운 for 문 (:) - in과 같은 의미
        for (int k : num)
            System.out.println(k);

        for (int i =0; i<=2 ; ++i)
            System.out.println(num[i]);
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
    }

}
