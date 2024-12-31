import com.a.*;

/**
 * instanceofで型の比較やパターンマッチング
 */
public class Main {
    public static void main(String[] args) {
        Shape obj = new Square();
        test(obj);
        testSmart(obj);
    }

    static void test(Object obj) {
        /**
         * 「変数名 instanceof クラス名またはインターフェイス名」で、
         * 変数名に指定したオブジェクトが継承または実装関係にあるかどうか判定
         */
        if (obj instanceof Cube) {
            Cube c = (Cube) obj;
            System.out.println(c.calcVolume());
        } else if (obj instanceof Square) {
            Square s = (Square) obj;
            System.out.println(s.calcArea() + " sq cm");
        }
    }

    static void testSmart(Object obj) {
        /**
         * ※便利！
         * 「変数名 instanceof パターン変数宣言」で、
         * 明示的な型変換を行わなくても、判定がtrueであればそのパターン変数を初期化し、
         * falseであれば初期化を行わない
         */
        if (obj instanceof Cube c) {
            System.out.println(c.calcVolume());
        } else if (obj instanceof Square s) {
            System.out.println(s.calcArea() + " sq cm");
        }
    }
}
