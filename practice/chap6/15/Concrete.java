interface Foo { // スーパーインタフェース
  void foo();
}

interface Bar { // スーパーインタフェース
  // サブインターフェイスBazでは返り値の型が異なる同名fooが２つ継承されてしまうためコンパイルエラー
  // int foo();

  void bar();
}

interface Baz extends Foo, Bar { // サブインタフェース
  void baz();
}

/**
 * インターフェイスの継承
 */
public class Concrete implements Baz { // 実装クラス
  @Override
  public void foo() {
  }

  @Override
  public void bar() {
  }

  @Override
  public void baz() {
  }
}
