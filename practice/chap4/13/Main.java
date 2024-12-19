public class Main {
    public static void main(String[] args) {
        outer: for (int i = 0; true; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    System.out.println("i:" + i + " skip!");
                    continue outer; // outerのループからやり直し
                }
                if (i == 3) {
                    System.out.println("break!");
                    break outer; // ここでループ全て終了
                }
                System.out.println("i:" + i + " j:" + j);
            }
        }
        // i:0 j:0
        // i:0 j:1
        // i:0 j:2
        // i:0 skip!
        // i:1 j:0
        // i:1 j:1
        // i:1 j:2
        // i:1 skip!
        // i:2 j:0
        // i:2 j:1
        // i:2 j:2
        // i:2 skip!
        // break!
    }
}
