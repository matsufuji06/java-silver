import com.a.*;

/**
 * ポリモーフィズム（多様性）
 * →同じ操作の呼び出しで、オブジェクトごとに異なる動作を実現すること
 * （継承やインターフェイスの実装と、メソッドのオーバーライドなどを組み合わせる）
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Triangle(), new Square(), new Cube() };

        // s.calcArea()でポリモーフィズムを実現したメソッドアクセス
        // 配列内の各共通のcalcArea()にアクセス（毎回のループで参照するオブジェクトが切り替わる）
        for (Shape s : shapes) {
            System.out.println(s.calcArea() + " sq cm");
        }
    }
}
