import java.io.FileWriter;
import java.io.IOException;

public class Main {

    /**
     * 【try-with-resources】
     * try (自動クローズするリソース[;]) {}
     * →必ずリソースがcloseされる
     * →try句のみの定義もOK
     */
    public static void main(String[] args) {
        methodA();
        methodB();
        try {
            methodC();
            methodD();
        } catch (IOException e) {
        }
    }

    public static void methodA() {
        // リソースは複数の指定が可能
        // closeされる順は指定順と反対
        try (FileWriter fw1 = new FileWriter("a.txt");
                FileWriter fw2 = new FileWriter("b.txt");) {
            fw1.write("a");
            fw2.write("b");
        } catch (IOException e) {
        }
    }

    public static void methodB() {
        // varの型推論でも指定可能
        try (var v = new FileWriter("c.txt");) {
            v.write("c");
            // 「var e」のようにcatchでは型推論はできない
        } catch (IOException e) {
        }
    }

    public static void methodC() throws IOException {
        FileWriter fw = new FileWriter("d.txt");
        // 事前に生成し変数にしたリソースを指定してもOK
        try (fw) {
            fw.write("d");
        }
    }

    public static void methodD() throws IOException {
        FileWriter fw1 = new FileWriter("e.txt");
        try (fw1; FileWriter fw2 = new FileWriter("f.txt");) {
            // リソース指定されたものは暗黙的にfinal
            // fw1 = new FileWriter("ng1.txt");
            // fw2 = new FileWriter("ng2.txt");
            fw1.write("e");
            fw2.write("f");
        }
    }
}
