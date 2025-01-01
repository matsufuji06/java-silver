import java.util.*;

/**
 * コレクションの操作
 */
public class Main {
    public static void main(String[] args) {
        // Arrays.asListで配列に連動したリストを取得
        List<String> list = Arrays.asList("D", "U", "K", "E");
        Collections.reverse(list); // 反転（コレクションクラス）
        System.out.println("Collections.reverse():" + list);

        int[] numArray = { 1, 5, 3 };
        Arrays.sort(numArray);
        System.out.println("Sorted:" + Arrays.toString(numArray));
        int[] small = { 1, 3 };
        int[] same = { 1, 3, 5 };
        int[] large = { 5, 3, 1 };

        // compareメソッド：２つのint配列を辞書順に比較
        // 要素と順序が一致なら0, a<bなら-1 a>bなら1を返す
        System.out.print("Arrays.compare(): ");
        System.out.print(Arrays.compare(numArray, small) + " ");
        System.out.print(Arrays.compare(numArray, same) + " ");
        System.out.print(Arrays.compare(numArray, large) + "\n");

        // mismatchメソッド：２つのint配列間の最初の不一致のインデックスを返す、不一致なしなら-1
        System.out.print("Arrays.mismatch(): ");
        System.out.print(Arrays.mismatch(numArray, small) + " ");
        System.out.print(Arrays.mismatch(numArray, same) + " ");
    }
}
