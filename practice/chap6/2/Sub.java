/**
 * オーバーライド
 * →サブクラスからスーパークラスのメソッドを定義し直す
 * ※以下の条件が必要
 * ・メソッドのシグネチャ（メソッド名と引数リスト）が同一
 * ・戻り値の型：同一かサブクラスの型
 * ・アクセス修飾子：同一かより公開範囲の広い修飾子
 * →「@Override」がついていて、上記の条件を満たしておらず、新たなメソッドを生成するとコンパイルエラー
 */
class X {
}

class Y extends X {
}

class Super {
  // 引数リスト（int a, String b）で戻り値がX
  X method(int a, String b) {
    return new X();
  }
}

class Sub extends Super {
  // 引数リスト（int a, String b）で戻り値がXを継承したY
  @Override
  Y method(int a, String b) {
    return new Y();
  }
}

class Sub2 extends Super {
  // 引数リスト（int a, String b）で戻り値がX
  // publicがついて公開範囲が広くなった
  @Override
  public X method(int a, String b) {
    return new X();
  }
}

class Sub3 extends Super {
  // オーバーライドが成立しない例
  /*
   * // メソッドの公開範囲が狭められた例（private）
   * private X method(int a, String b) { return new X(); }
   * 
   * // スーパークラスと同一、またはそのサブクラス型ではない戻り値の例（void）
   * void method(int a, String b) {}
   * 
   * // 引数リストの順番が一致しない例
   * X method(String b, int a) {}
   */
}
