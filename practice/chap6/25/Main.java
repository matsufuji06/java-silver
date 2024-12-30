// 例1
class Super {
  private void method() {
  }
}

class Sub extends Super {
  public void method() {
  }
}

// 例2
class Shape {
}

class Square extends Shape {
}

class Heart {
}

public class Main {
  public static void main(String[] args) {
    // 例1
    Super s = new Sub();
    // 親クラスのメソッドはprivateのため、アクセスできない
    // s.method();

    // 例2
    Shape shape = new Shape();
    Square square = (Square) shape;
    // Heartクラスは継承関係にないのでキャストできずコンパイルエラー
    // Heart heart = (Heart)shape;

    // 例3
    // Objectクラスには全ての参照型を格納できる
    int[] array = { 1, 2 };
    Object obj = array;
    obj = s; // 例1の変数
    obj = shape; // 例2の変数
  }
}
