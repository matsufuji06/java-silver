import com.a.Cube;
import com.a.Shape;
import com.a.Square;

/**
 * 参照型のキャスト
 * →一度１番大元の親クラスを暗黙的な型変換したうえでインスタンス化すれば、小さな子クラスにキャストすることができる
 */
public class Main {
    public static void main(String[] args) {
        // 一番下位のCube→Shapeに暗黙的な型変換してインスタンス化
        Shape obj1 = new Cube();
        // Shapeから一つ下位のSquareにキャスト
        Square s1 = (Square) obj1;
        // Squareから一つ下位のCubeにキャストして元に戻る
        Cube c1 = (Cube) obj1;
        c1.calcVolume(); // OK

        // 中間のSquare→Shapeに暗黙的な型変換してインスタンス化
        Shape obj2 = new Square();
        // Shape→Squareに暗黙的な型変換して再び戻す
        Square s2 = (Square) obj2;
        // 最初のインスタンス化時点で一番下位クラスのCubeは含まれていないのでコンパイルエラー
        Cube c2 = (Cube) obj2; // ClassCastException
    }
}
