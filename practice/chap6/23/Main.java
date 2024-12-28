import com.a.*;

/**
 * 参照型の暗黙的な型変換
 * →ここでは参照先はスーパークラスShape。継承先に該当のオーバーライドされたメソッドがあれば、スーパークラスのメソッドが呼ばれる
 * （親→子のメソッドを探しにいき、オーバーライドされたメソッドがあればそちらを優先。なければ親のメソッドになる）
 * （そもそも、呼ばれたメソッドが子メソッドのみにあり、親とのオーバーライド関係になければコンパイルエラー）
 */
public class Main {
  public static void main(String[] args) {
    Shape obj = new Cube();

    // Cubeクラスに定義されたcalcArea()にアクセス
    System.out.println("Cube : " + obj.calcArea());

    // Shapeクラスに定義されたtoString()にアクセス
    System.out.println("Shape: " + obj.toString());
  }
}
