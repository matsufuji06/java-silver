/**
 * ・インスタンス変数（メソッド）：newでオブジェクトを生成するごとに、各オブジェクトに保持される
 * ・static変数（メソッド）：オブジェクトの元のクラスに保持される。クラスに１つだけあればいい物を管理
 */
public class Sample {
  int value = 100; // インスタンス変数
  static int commonValue = 500; // static変数
  // インスタンスメソッド

  public void printValue() {
    System.out.println("instance value : " + value);
  }

  // staticメソッド
  public static void printCommonValue() {
    System.out.println("static common value : " + commonValue);
  }
}
