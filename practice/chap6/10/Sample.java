/**
 * レコードクラスで追加できるメンバ変数・メンバメソッド
 */
public record Sample(int x, int y) {
  // X ：インスタンス変数
  // private double a = 100;

  // static変数
  private static double b = 200.0;

  // インスタンスメソッド
  public double calc() {
    return x + y;
  }

  // staticメソッド
  public static double getB() {
    return b;
  }

  // X ：アクセサではない（引数があったり、戻り値の型がコンポーネントと異なる）
  // ※Overrideがなければインスタンスメソッドとして定義OK
  // @Override double y(double z) { return 1.0; }

  // 明示的なアクセサ
  @Override
  public int x() {
    return x;
  }

  // Object型のメソッドをオーバーライド
  @Override
  public String toString() {
    return "Sample record... x:" + x + ", y:" + y;
  }
}

class Main {
  public static void main(String[] args) {
    Sample s = new Sample(10, 20);
    System.out.println("s.calc(): " + s.calc());
    System.out.println("Sample.getB(): " + Sample.getB());
    System.out.println("s.x(): " + s.x());
    System.out.println(s); // s.toString() と同様に出力（printlnの挙動）
  }
}
