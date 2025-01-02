import java.io.IOException;

public class Sample1 {
    public void method() {
        try {
            // 継承関係にある例外クラスを並べるとコンパイルエラー
        } catch (IOException | Exception e) {
        }
    }
}
