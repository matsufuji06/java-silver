public class Main {
    public static void main(String[] args) {
        int i = 0, j = 10;
        boolean b1, b2;

        // 「&」はすべてのオペランドの評価を行う
        b1 = (i < 0) & ((j++) <= 10); // j = 11
        System.out.println("b1 : " + b1 + " j : " + j);

        j = 10;
        // 「&&」は前のオペランドの結果がtrueだった場合のみ、次の評価を行う
        b2 = (i < 0) && ((j++) <= 10); // j = 10
        System.out.println("b2 : " + b2 + " j : " + j);
    }
}
