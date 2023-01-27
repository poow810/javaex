package method;

public class SwitchTWO {
    public static void main(String[] args) {
        whoIsIt("호랑이");
        whoIsIt("사자");
        whoIsIt("독수리");
        whoIsIt("참새");
        whoIsIt("고등어");
        whoIsIt("연어");
        whoIsIt("곰팡이");
        String tmp = null;
        tmp = fone(1);
        System.out.println("tmp = "+tmp);
        tmp = fone(2);
        System.out.println("tmp = "+tmp);
        tmp = fone(3);
        System.out.println("tmp = "+tmp);
    }   // end of main

    static String fone(int n) {
        return switch (n) {
            case 1 -> "한 개";
            case 2 -> "두 개";
            default -> "많이";
        };
    }

    static void whoIsIt(String bio) {
        String kind = switch (bio) { //변수나 수식이 switch 변수로 사용 가능
            case "호랑이", "사자" -> "포유류";
            case "독수리", "참새" -> "조류";
            case "고등어", "연어" -> "어류";
            default -> {
                System.out.print("어이쿠!");
                yield "...";
            }
        };
        System.out.printf("%s는 %s 이다.\n", bio, kind);
    }
}

    /* static void whoIsIt(String bio){
        String kind = "";
        switch (bio) {         // 변수나 수식이 switch 변수로 사용 가능
            case "호랑이", "사자" -> kind = "포유류";
            case "독수리", "참새" -> kind = "조류";
            case "고등어", "연어" -> kind = "어류";
            default -> {
                System.out.print("어이쿠!");
                kind = "...";
            }
        } //end of switch
        System.out.printf("%s는 %s 이다.\n",bio, kind);
    } //end of whoIsIt */




