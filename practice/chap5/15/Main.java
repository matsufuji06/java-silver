/**
 * 基本データ型の値のコピー
 * ・値そのものがコピーされる
 */
public class Main {
  public static void main(String[] args) {
    int val1 = 100;
    int val2 = val1;
    // ※コピー先で値を変更しても、コピー元のval1の値は変わらない
    val2 = 200;

    Main obj = new Main(); // Mainオブジェクトの生成
    obj.methodA(val2); // 200 + 200 = 400

    System.out.println("val1 : " + val1); // 100
    System.out.println("val2 : " + val2); // 200
  }

  public void methodA(int val3) {
    val3 += val3;
    System.out.println("val3 : " + val3);
  }
}
