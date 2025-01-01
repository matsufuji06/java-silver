import java.util.HashMap;

/**
 * HashMapクラス（Mapインターフェイスの一つ）
 * →キーと値のペアを順不同で管理
 * →キーの重複はNGだが、値の重複はOK
 */
public class Main {
    public static void main(String[] args) {
        // オブジェクトの生成
        HashMap<Integer, String> depts = new HashMap<>();

        // マップに登録
        depts.put(10, "HR");
        depts.put(20, "Tech");
        depts.put(30, "Learning");
        depts.put(40, "Sales");

        // キー指定で取得
        System.out.println("depts.get(30): " + depts.get(30));
        System.out.println("depts.put(10, \"Executive\"): "
                + depts.put(10, "Executive"));
        // 既存のものを書き換える。戻り値は変更前のもの
        System.out.println("depts.remove(40): " + depts.remove(40));

        // スーパークラスAbstractMapでオーバーライドされたtoStringによって文字列が生成される
        System.out.println(depts);

        System.out.print("Keys..... ");

        // keySet→順不同でキーを取得
        for (Integer k : depts.keySet()) {
            System.out.print(k + " ");
        }

        // values→順不同で値を取得
        System.out.print("\nValues... ");
        for (String v : depts.values()) {
            System.out.print(v + " ");
        }
    }
}
