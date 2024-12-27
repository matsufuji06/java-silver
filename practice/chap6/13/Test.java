/**
 * インターフェイス
 * ・クラスはpublicか指定なしのパッケージプライベート。finalはダメ
 * ・extendで別のインターフェイスを継承できる
 * 次の物を定義できる
 * ・①抽象メソッド（暗黙的にpublic abstract）
 * ・②定数（暗黙的にpublic static final）
 * ・③以下の具象メソッド
 * １：defaultメソッド
 * ２：staticメソッド
 * ３：privateメソッド
 */
public interface Test {
  // 定数のみ
  int EXCELLENT = 100;
  public int VERY_GOOD = 90;
  static int GOOD = 80;
  final int AVERAGE = 70;
  // private int BELOW_AVERAGE = 60; // privateは指定できない
  // public static final int VERY_POOR; // 定数の初期化は必須

  // 以下全て暗黙的にpublic abstract
  void foo();

  public int bar();

  abstract boolean baz();
  // protected double qux(); // protectedは指定できない
  // final String quux(); // finalは指定できない
}
