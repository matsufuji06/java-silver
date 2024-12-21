/**
 * オーバーロード対象のメソッドが複数あった場合の優先度
 * ①型が完全に一致
 * ②暗黙の型変換で最も型が近い物
 * ③基本データ型/ラッパークラスのオートボクシング/アンボクシング
 * ④可変長引数
 */
public class Sample {
    // public void method(int i) { System.out.print("int : " + i); }
    public void method(long l) {
        System.out.print("long : " + l);
    }

    public void method(float f) {
        System.out.print("float : " + f);
    }

    public void method(double d) {
        System.out.print("double : " + d);
    }

    public void method(Integer i) {
        System.out.print("Integer : " + i);
    }

    public void method(int... i) {
        System.out.print("int... : " + i[0]);
    }

    // 暗黙の型変換できないのでコンパイルエラー
    public void method(byte b) {
        System.out.print("byte : " + b);
    }

    public static void main(String... args) {
        Sample s = new Sample();
        // long→float→double→Integer→int...の優先度
        s.method(100);
    }
}
