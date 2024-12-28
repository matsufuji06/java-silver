/**
 * インターフェイスでのdefaultメソッド
 * →メソッドがオーバーライドされない場合のデフォルトの実装を提供
 * ・アクセス修飾子はインターフェイスの抽象メソッドと同様で暗黙的にpublic
 * ・サブインターフェイスや実装クラスでのオーバーライドが可能
 * ・defaultメソッドの衝突はオーバーライドにより回避
 * ・Objectクラスのequals()、hashCode()、toString()のオーバーライドはできない
 */
interface Foo {
    // defaultメソッド（デフォルトの実装）
    default void x() {
        System.out.println("Foo#x()");
    }

    // defaultメソッド（デフォルトの実装）
    default void y() {
        System.out.println("Foo#y()");
    }
}

class Test implements Foo {
    // 「default void x()」のみをオーバーライド
    @Override
    public void x() {
        System.out.println("Test#x()");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.x();
        
        // オーバーライドしてないy()も呼び出せる
        t.y();
    }
}
