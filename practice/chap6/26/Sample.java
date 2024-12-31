public class Sample {
  String val; // 例5で使用するメンバ変数

  public static void main(String[] args) {
    Sample sample = new Sample();
    String text = "Duke";
    sample.test1(text); // 例1
    sample.test2(text); // 例2
    sample.test3(text); // 例3
    sample.test4(text); // 例4
    sample.test5(text); // 例5
    sample.test6(text); // 例6
    sample.test7(text); // 例7
  }

  void test1(Object obj) {
    if (obj instanceof String s) {
      System.out.println("test1(): " + s); // scope
    } else {
      // 確実にここのスコープになるとは限らないのでコンパイルエラー
      // System.out.println(s);
    }
  }

  void test2(Object obj) {
    if (!(obj instanceof String s)) {
      // 確実にここのスコープになるとは限らないのでコンパイルエラー
      // System.out.println(s);
      return;
    }
    System.out.println("test2(): " + s); // scope
  }

  void test3(Object obj) {
    if (obj instanceof String s && s.length() == 4) {
      System.out.println("test3(): " + s); // scope
    }
    // 確実にここのスコープになるとは限らないのでコンパイルエラー
    // System.out.println(s);
  }

  void test4(Object obj) {
    // 「&」の場合、最初の判定がfalseでも次の判定を行うためsに値が割り当てられない可能性があり、
    // s.length()の時点でコンパイルエラー
    // if(obj instanceof String s & s.length() == 4) {
    // System.out.println(s);
    // }
    // System.out.println(s);
  }

  void test5(Object obj) {
    if (obj instanceof String val) {
      System.out.println("test5(): " + val);
    }
    // スコープ外ではメンバ変数にアクセス
    System.out.println("field: " + val);
  }

  void test6(Object obj) {
    if (obj instanceof String s) {
      // パターン変数は再代入できる
      s += "-san";
      System.out.println("test6(): " + s);
    }
  }

  void test7(Object obj) {
    // パターン変数をObjectとすると必ずtrueなのでコンパイルエラー
    // if(obj instanceof Object s) {}
  }
}
