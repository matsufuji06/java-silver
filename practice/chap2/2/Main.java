/**
 * テキストブロック
 * ①開始の「"""」の直後は文字列を記述できない（ただし、スペースやタブなどの改行以外の空白文字はOK）
 * ②終了の「"""」は、「text"""」のように文字列の最後に記述できる（この場合は文字列末尾に「/n」が入らない）
 * ③各行末のスペースは削除される
 */
public class Main {
        public static void main(String[] args) {
                // テキストブロック
                String s1 = """
                                <html>
                                    <body>
                                        <p>"Hello, World"</p>
                                    </body>
                                </html>
                                """;
                // 従来の文字列リテラル
                String s2 = "<html>\n" +
                                "       <body>\n" +
                                "         <p>\"Hello, World\"</p>\n" +
                                "       </body>\n" +
                                "   </html>\n";

                // String t = """text // コンパイルエラー
                // """;

                String t1 = """
                                t1 text""";
                String t2 = """
                                t2 text
                                """;
                String t3 = """
                                t3 text     """;

                // 「\」で、改行をエスケープ
                // 「\s」で、明示的なスペース
                // 「\"」で、明示的なダブルクォーテーション（３つ以上連続はブロック内、終了の「"""」の直前は「"」のみ）
                String t4 = """
                                Red    \s
                                Black \
                                \"""White\"""";

                // ①ダブルクォーテーションはエスケープなしでもOK
                // ②インデントは「"""」を含めた一番浅いところからスタート
                String t5 = """
                                "11"
                                    "17"
                                """;
                String t6 = """
                                      "11"
                                          "17"
                                """;
                String t7 = """
                                """;

                System.out.println(s1);
                System.out.println(s2);
                System.out.println("--------\n");

                System.out.println(t1);
                System.out.println(t2);
                System.out.println(t3);
                System.out.println(t4);
                System.out.println(t5);
                System.out.println(t6);
                System.out.println(t7 == null);
        }
}
