// クラスとインタフェースの宣言
class Super {
}

class Sub extends Super {
}

interface Foo {
}

class FooImpl implements Foo {
}

/**
 * 参照型における暗黙の型変換（継承関係またはインターフェイスの実装関係において成り立つ）
 * スーパークラス←サブクラスの代入は暗黙的に行われ、
 */
public class Main {
  static Sub methodA() {
    return new Sub();
  } // 例2

  static void methodB(Super s) {
    // 実引数Subが仮引数Superに変換される
  } // 例3

  static Foo methodC() {
    // 返り値Fooとして最終的にリターン
    return new FooImpl();
  } // 例4

  static void methodD(Foo f) {
    // 実引数FooImplが仮引数Fooに変換される
  } // 例4

  public static void main(String[] args) {
    Super s1 = new Sub(); // 例1
    Super s2 = methodA(); // 例2: 返り値Sub
    methodB(new Sub()); // 例3
    // 例4
    Foo f1 = new FooImpl();
    Foo f2 = methodC(); // 返り値Foo
    methodD(new FooImpl());
  }
}
