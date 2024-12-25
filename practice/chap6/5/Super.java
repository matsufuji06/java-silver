/**
 * finalクラス
 * →被継承を禁止する
 */
public final class Super {
} // finalクラス
// class Sub extends Super {}

/**
 * finalメソッド
 * →オーバーライドを禁止する
 */
class Parent {
  public final void methodA() {
  } // finalメソッド

  public static final void methodB() {
  } // staticなfinalメソッド
}

// オーバーライドできない
class Child extends Parent {
  // public void methodA() {}
  // public static final void methodB() {}
}
