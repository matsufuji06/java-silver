public class Main {
    public static void main(String[] args) {
        // フォーマット
        String t1 = """
                Language: %s
                Version : %d
                """.formatted("Java", 15);
        System.out.println(t1);

        // 行単位で不要なインデントを削除
        String t2 = "     Duke     \n  James";
        System.out.println(t2);
        System.out.println(t2.stripIndent());

        // エスケープシーケンスを反映
        String t3 = "Hello\\n\\tworld";
        System.out.println(t3);
        System.out.println(t3.translateEscapes());
    }
}
