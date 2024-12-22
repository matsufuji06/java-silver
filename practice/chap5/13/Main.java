/**
 * static変数・メソッドはインスタンス化する前にクラスが保持しているため、以下のようにアクセスする
 * ・「クラス名.変数名」
 * ・「クラス名.メソッド名()」
 */
public class Main {
  public static void main(String[] args) {
    int staVal1 = Sample.commonValue; // 〇：クラス名.static変数
    Sample.printCommonValue(); // 〇：クラス名.staticメソッド
    // int val1 = Sample.value; // X ：クラス名.インスタンス変数
    // Sample.printValue(); // X ：クラス名.インスタンスメソッド

    Sample s = new Sample(); // インスタンス生成
    int val2 = s.value; // 〇：参照変数名.インスタンス変数
    s.printValue(); // 〇：参照変数名.インスタンスメソッド

    // インスタンス化してでも、static変数・メソッドにはアクセスできるが非推奨
    int staVal2 = s.commonValue; // △：参照変数名.static変数
    s.printCommonValue(); // △：参照変数名.staticメソッド
  }
}
