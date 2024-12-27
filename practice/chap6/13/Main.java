// implementsでインターフェイスを指定
class Sample implements Test {
  @Override
  public void foo() {
  }

  @Override
  public int bar() {
    return 0;
  }

  @Override
  public boolean baz() {
    return false;
  }

  public void method() {
    // Testインタフェースの定数にアクセス
    System.out.println("VERY_GOOD:" + VERY_GOOD); // 実装クラスでは定数名のみも可
  }
}

public class Main {
  public static void main(String[] args) {
    // Testインタフェースの定数にアクセス
    System.out.println("Test.EXCELLENT: " + Test.EXCELLENT); // インタフェース名.定数名
    // Sampleクラスのmethod()の動作確認
    new Sample().method();
  }
}
