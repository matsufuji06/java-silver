import java.io.*;

public class Main {

    /*
     * 従来のリソースのクローズ処理
     * ※リソース→プログラムからアクセスするファイルやデータベースなどの外部資源
     */
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("test.txt");
            fw.write("try-catch-finally");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    // クローズ処理
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
