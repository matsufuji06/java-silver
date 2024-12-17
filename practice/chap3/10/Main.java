public class Main {
  public static void main(String[] args) {
      // 暗黙の型変換（ワイドニング）
      float f = 10;                   // int→float: fはfloat型の10.0
      // まず右辺の10 + fで10がint→float、そしてfloat→double: dはdouble型の20.0
      double d = 10 + f;
      System.out.println(f + " : " + d);        // 値を確認

      // キャストによる型変換（ナローイング: 暗黙の型変換とは逆で、無理くり変換する）
      float f2 = (float)1.23;         // 1.23はdouble型リテラル
      boolean bool = 10 < (int)10.1;  // boolはfalse
      System.out.println(f2 + " : " + bool);    // 値を確認
      // キャストによる型変換(値が変わる例)
      byte b = (byte)128;             // bは-128
      int val = (int)(123 * 0.2);     // valは24
      System.out.println(b + " : " + val);      // 値を確認
  }
}
