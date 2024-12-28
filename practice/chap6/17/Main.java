/**
 * インターフェイスにおけるstaticメソッド
 * →具象メソッドとして使用できる
 * →その代わり、継承経由や参照（インスタンス）経由ではアクセスできない
 * ・アクセス修飾子は何も指定しないとpublicだが、privateも可能
 */
interface Foo {
  /* private */ static void statMethod() { // staticメソッドの宣言
    System.out.println("Foo#statMethod()");
  }
}

interface Bar extends Foo {
  default void x() {
    System.out.print("a call from Bar#x()... ");
    Foo.statMethod(); // staticメソッドアクセス
  }
}

class Concrete implements Bar {
  public void y() {
    System.out.print("a call from Concrete#y()... ");
    Foo.statMethod(); // staticメソッドアクセス
    // Bar.statMethod(); // X：サブインタフェース名
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.print("a call from Main#main()... ");
    Foo.statMethod(); // staticメソッドアクセス
    Concrete c = new Concrete();
    c.x();
    c.y();
    // c.statMethod(); // X：参照経由
  }
}
