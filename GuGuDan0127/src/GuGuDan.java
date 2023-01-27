public class GuGuDan {
    public static void main(String[] args) {
        int i = 0, j = 0;
        for (i = 1; i <= 9; i++) {
            for (j = 2; j <= 5; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.printf("\n");  //안에 for문이 한 번 돌 때마다 줄바꿈
        }
        System.out.println("");
        for (i = 1; i <= 9; i++) {
            for (j = 6; j <= 9; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.printf("\n");
        }
    }
}
