public class day1homework {
    public static void main(String[] args) {
        // 문제 1번
        char a = 'a'; //A.
        char b = "a"; //B.
        String c = "a"; //C.
        String d = 'a'; //D.
        char e = 'ab'; //E.
        String f = "ab"; //F.
        // B : 큰 따옴표안를 쓰면 문자열로 인식하기때문에 null값으로 끝나 2Byte의 char type에는 문자열을 넣을 수 없다.
        // D : 작은 따옴표로 묶은 것은 문자 리터럴로 유니코드로 변환되어 저장되며 문자 하나로 인식한다.
        // E : 위와 마찬가지이다
        // 정답 B, D, E

        // 문제 2번
        byte var1 = 128; //A.
        short var2 = 128; //B.
        int var3 = 28L; //C.
        long var4 = 128L; //D.
        float var5 = 123456.789123; //E.
        double var6 = 123456.789123; //F.
        // A : byte는 8bit로 0부터 127까지의 128가지로 표현할 수 있다. 128은 범위밖이다.
        // C : 28은 int 타입 범위 내이므로 L을 붙일 필요가 없음. 붙이고 싶다면 int를 long으로 바꿔준다.
        // E : 실수 리터럴을 기본적으로 double type로 인식하기 때문에 맨 뒤에 f를 붙여 float type으로 인식할 수 있도록 해주어야한다.
        // 정답 A, C, E

        // 문제 3번
        byte var1 = 127;
        short var2 = 128;
        int var3 = 128;
        long var4 = 128L;
        var4 = var1;
        System.out.println(var1 + ", " + var2);
        var1 = (byte) var3;
        System.out.println(var1 + ", " + var3);

        float var5 = 123456.789123f;
        double var6 = 123456.789123;
        var5 = (float) var6;
        System.out.println(var5 + ", " + var6);
        var6 = var5;
        System.out.println(var5 + ", " + var6);

    }
}
