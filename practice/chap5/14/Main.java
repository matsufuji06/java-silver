class Test {
  static int num;
  String s;

  // static初期化子・・・①
  static {
    num = 100;
    System.out.println("static Initializer... num : " + num);
  }

  // インスタンス初期化子・・・②
  // ※コンストラクタの初期化の前に実行される
  // ※コンストラクタをオーバーロードしている際に共通の処理をしたりする用途にも
  {
    this.s = "Test";
    System.out.println("Initializer... s : " + s);
  }

  // コンストラクタ・・・③
  public Test(String s) {
    this.s = s;
    System.out.println("Constructor... s : " + s);
  }
}

public class Main {
  // static初期化子・・・①
  static {
    System.out.println("static Initializer... Main");
  }

  // main()メソッド
  public static void main(String[] args) {
    new Test("new Test()");
  }
}
