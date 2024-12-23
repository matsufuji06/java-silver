/**
 * 【インスタンス】
 * ・変数：オーバーライドなし（同じ名前の再定義は可能）
 * ・メソッド：これまで見てきたようにオーバーライドあり
 * 
 * 【static】
 * ・変数：オーバーライドなし（同じ名前の再定義は可能）
 * ・メソッド：オーバーライドあり
 */
class Super {
    int x = 1;
    static int y = 2;

    void instMethod() {
        System.out.println("Super#instMethod()");
    }

    static void statMethod() {
        System.out.println("Super#statMethod()");
    }
}

class Sub extends Super {
    double x = 1.0;
    static double y = 2.0;

    // オーバーライドする
    // インスタンスメソッドとstaticメソッドの相互オーバーライドはコンパイルエラー
    /* static */ void instMethod() {
        System.out.println("Sub#instMethod()");
    }

    // オーバーライドする
    static void statMethod() {
        System.out.println("Sub#statMethod()");
    }
}

public class Main {
    public static void main(String[] args) {
        Sub obj = new Sub();
        // Super obj = new Sub();

        // double x = 1.0の方
        // 上記Super objの方だとint x = 1の方
        System.out.println("instance field - obj.x:" + obj.x);

        // static int y = 2と、static double y = 2.0それぞれ
        System.out.println("static field   - Super.y:"
                + Super.y + " | Sub.y:" + Sub.y);

        // ※以降はSub objの時と同じ：スーパークラスでインスタンス化してもオーバーライドしたメソッドが優先
        // staticでアクセス
        Super.statMethod();
        Sub.statMethod();

        // インスタンスメソッドにアクセス
        obj.instMethod();
    }
}
