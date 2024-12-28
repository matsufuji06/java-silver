/**
 * インターフェイスにおけるprivateメソッド
 * →１つのインターフェイス内に複数のdefaultメソッドやstaticメソッドがある場合、
 * privateメソッドにまとめることで実装を持つメソッドのコードの再利用が可能になる
 * →privateメソッドとprivate staticメソッドの２種類が定義可能（それぞれ次の場所からアクセスできる）
 * ・privateメソッド：defaultメソッドからのアクセス
 * ・private staticメソッド：staticメソッドまたはdefaultメソッドからのアクセス
 */
interface Foo {
  // defaultならばprivate, private staticともにアクセスできる
  default void a() {
    common();
    System.out.println("default a()");
  }

  // defaultならばprivate, private staticともにアクセスできる
  default void b() {
    common();
    System.out.println("default b()");
    statCommon();
    System.out.println("default b()");
  }

  // staticからはstaticがついているprivate staticメソッドにしかアクセスできない
  static void x() {
    statCommon();
    System.out.println("static x()");
  }

  static void y() {
    statCommon();
    System.out.println("static y()");
    // static同士じゃないとアクセスできない
    // common();
  }

  // privateメソッド：defaultメソッドからのアクセス
  private void common() {
    System.out.print("cmmon(): ");
  }

  // private staticメソッド：staticメソッドまたはdefaultメソッドからのアクセス
  private static void statCommon() {
    System.out.print("statCommon(): ");
  }
}

public class Test implements Foo {
  public static void main(String[] args) {
    Test t = new Test();
    // defaultメソッドにアクセス
    t.a();
    t.b();
    // staticメソッドにアクセス
    Foo.x();
    Foo.y();
  }
}
