public class FirstEx0125 {
    public static void main (String[] args) {
//        int a = 5;
//
//        System.out.printf("a=%d\n", a);           // printf = f를 꼭써야함 (format함수)
//        System.out.println("HELLO JAVA");
//        System.out.println("HELLO JAVA");
//        System.out.println("HELLO JAVA");
//        System.out.printf("DecimalNum=%d\n" , 7);   // %d = decimal number
//
//        double dv = 3.14 ;      // double은 실수 type   8bite의 빈 공간 할당
//        float fv = 3;           // float는 실수 type   4bite의 빈 공간 할당
//        // 3.14를 float type로 인식하게 만드는 법 ( casting ) = f를 붙여줌
//        float NUMBER = 3.14f;
//        float TWO = (float)3.14;
//        System.out.printf("TWO=" + TWO + "\n");    // 뒤 TWO를 문자열로 바꿔버림 = 문자열 + 문자열
//        System.out.printf("fv = %f\n", fv);
//        System.out.printf("fv = %.2f\n", fv);      // %.x 소수점 이하 x번째 자리까지만 출력
//        System.out.printf("fv = %07.2f\n", fv);    // 전체 자리를 총 7자리 확보 0003.00 소수점 포함 7자리
//        System.out.printf("fv = %7.2f\n", fv);     // (+) 7자리를 확보하되, 오른쪽 정렬, 정수부 0은 표기 x
//        System.out.printf("fv = %-7.2f\n", fv);    // (-) 7자리 확보하되, 왼쪽 정렬
//        System.out.println(NUMBER);
//        System.out.printf("fv = %f\n", fv);
//        System.out.printf("dv = %f\n", dv);
//
//        /* byte, bit
//        1 byte = 8bit
//        1 byte는 256가지의 수 표현...
//        */
//
//        // 문자열 data type
//        char ch = 'A';
//        System.out.printf("ch=%c\n", ch);           // %d : 정수로 해석, %c : 문자로 해석
//        System.out.printf("ch=%d\n", (int)ch);      // 대문자 A에 대한 ascii code 값 = 10진수로 표현
//
///*      char ch2 = "A";          작은 따옴표 -> 문자 하나(character로 취급) / 큰 따옴표로 묶은 문자 -> 문자열(string으로 인식)
//                                 java에서 string을 null문자로 끝나야함 -> 대문자 A와 NULL 각각 2Byte를 집어넣기위해 총 4Byte필요
//                                 ch는 2Byte. 따라서 컴파일 오류 => char를 string으로 바꿔주면 됨
// */
//
//        String name = "gildong";
//        System.out.println("name=" + name);
//        System.out.printf("name=%s\n", name);
//
//
//        // var 예약어 - data type을 추론
//        var ab = 100;
//        System.out.println(ab);
//
//        var ac = "안녕";
//        System.out.println(ac);
//
//        // final - 변경할 수 없는 변수
//        final double PI = 3.14 ;
//        System.out.printf("PI=%.2f\n", PI);
//
//        // 연산자
//        int s = 15/2 ;      // 소수점을 제외한 몫
//        int p = 13%2 ;      // 나머지
//        System.out.printf("s=%d, p=%d\n", s,p);

        int m = 3;
        m++;
        System.out.println("m = " + m);
        System.out.println("in English \'hello\'");
        System.out.println("in English 'hello'");


    }
}