import java.util.Arrays;

/**
 * 参照型の値のコピー
 * ・参照情報がコピーされる
 */
public class Main {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3 };
    Main obj = new Main(); // Mainオブジェクトの生成

    obj.methodB(array);
    // [1, 5, 3]
    System.out.println("main() array : "
        + Arrays.toString(array));
  }

  public void methodB(int[] ary) {
    // ※ここでの変更が上記mainの中でも引き継がれる
    // ※コピー先で値を変更すると、コピー元のarrayもその変更が引き継がれる
    ary[1] = 5;
    // [1, 5, 3]
    System.out.println("methodB() ary : "
        + Arrays.toString(ary));
  }
}
