// /*
// defaultメソッドの衝突によりコンパイルエラーが発生する例
// interface A {
//   default void x() {
//   }
// }

// interface B extends A {
//   default void x() {
//   }
// }

// interface C extends A {
//   default void x() {
//   }
// }

// 継承しているB・Cのx()メソッドは同一のシグネチャのため衝突が起こりコンパイルエラー
// interface D extends B, C {
// }

// こちらも上記と同じ理由からコンパイルエラー
// public class Test2 implements B, C {
// }
// */

// 衝突を回避する例(インタフェースと実装クラスでそれぞれオーバーライド)
interface A {
  default void x() {
  }
}

interface B extends A {
  default void x() {
  }
}

interface C extends A {
  default void x() {
  }
}

// インタフェース
interface D extends B, C {
  @Override
  default void x() {
    // 独自処理を実装
  }
}

// 実装クラス
// public class Test2 implements B, C {
// @Override
// public void x() {
// // 衝突しているメソッドに対しては「インターフェイス名.super.メソッド名()」
// B.super.x(); // Bのx()にアクセス
// }
// }

/*
 * // 暗黙的に衝突が解決される例1
 * // 階層構造がある場合は一番サブインタフェースが優先 - インタフェースCのx()が優先
 * interface A { default void x() {} }
 * interface B extends A { default void x() {} }
 * interface C extends B { default void x() {} }
 */

// 暗黙的に衝突が解決される例2
// インタフェースとクラスでは常にクラスが優先 - クラスGのx()が優先
interface E {
  default void x() {
  }
}

interface F extends E {
  default void x() {
  }
}

class G implements E {
  public void x() {
  }
}

public class Test2 extends G implements F {
  @Override
  public void x() {
    // クラスGのx()が優先して呼ばれる
    super.x();
  }

}
