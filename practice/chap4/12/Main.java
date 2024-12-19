public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.println("skip!");
                continue; // 以降の処理は行わずに次のループにいく
            }
            // continueでスキップされる処理
            System.out.println(i);
        }
    }
}
