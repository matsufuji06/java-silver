public class Main {
    public static void main(String[] args) {
        /**
         * StringBuilderクラス
         * ・Stringクラスに対し、ミュータブル（可変）なクラスで、Stringと互換性あり
         * ・new StringBuilder()の初期化で「16文字」を確保
         * ・new StringBuilder("Duke")など指定した文字列で初期化すると、「文字数分+16文字」の容量を保持
         */
        // メソッドチェーン
        StringBuilder sb = new StringBuilder("Apple ")
                .append("Lime ")
                .append("Kiwi ")
                .delete(6, 11)
                .insert(6, "Lemon ");
        System.out.println("sb : " + sb);
        String str = sb.toString();
        System.out.println("str: " + str.toUpperCase());
    }
}
