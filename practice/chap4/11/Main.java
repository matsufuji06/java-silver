public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (true) { // 無限ループ
            System.out.print(i);
            if (i == 3) {
                break; // ここでループを抜ける
                // breakするとこれ以降は実行されない
                // System.out.println("break!");
            }
            i++;
        }
        System.out.println("\n----");
        System.out.println("i : " + i); // 3
    }
}
