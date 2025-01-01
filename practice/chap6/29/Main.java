import java.util.HashSet;

/**
 * HashSetクラス（コレクションフレームワークの１つ）
 * →重複なしの順不同の要素を管理
 * →インデックスはない
 * →要素の追加はその要素がセット内にない場合のみに行われる
 */
public class Main {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = Integer.valueOf(20);

        // オブジェクト生成
        HashSet<Integer> values = new HashSet<>();
        values.add(i1);
        values.add(i2);

        // すでに20は要素にあるので、追加はされずにfalseが返る
        System.out.println("values.add(20): " + values.add(20));
        // true
        System.out.println("values.add(30): " + values.add(30));
        // 3
        System.out.println("values.size(): " + values.size());
        // [20, 10, 30]（のように順不同）
        System.out.println(values);
    }
}
