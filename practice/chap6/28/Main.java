import java.util.ArrayList;

/**
 * ArrayListクラス（コレクションフレームワークの１つ）
 * →Listインターフェイスの実装の一つ
 * →オブジェクトの生成後に要素の追加や削除が可能（配列は不可）
 * →参照型しか格納できない
 * ・配列→要素数：固定｜管理対象：基本データ型、参照型
 * ・ArrayList→要素数：固定｜管理対象：参照型のみ
 * 
 */
public class Main {
  public static void main(String[] args) {
    // オブジェクト生成
    ArrayList<String> fruits = new ArrayList<>();

    // 要素の追加
    fruits.add("Kiwi");
    fruits.add("Lemon");
    fruits.add(null);
    // 位置を指定して重複要素を挿入
    // ※後続要素は全て１つ後ろにズレる（インデックスは固定）
    fruits.add(0, "Lemon");
    // fruits.add(100);

    System.out.print("Enhanced for statement... ");
    for (String fruit : fruits) {
      System.out.print(fruit + " ");
    }

    System.out.print("\nBasic for statement...... ");
    for (int i = 0; i < fruits.size(); i++) {
      System.out.print(fruits.get(i) + " ");
    }

    System.out.println();
    
    // 削除（後続の要素は１つずつ前に移動する）
    String val1 = fruits.remove(0);
    // 削除（返り値はbool）
    boolean val2 = fruits.remove("Lemon");
    // 変更（返り値は変更前の要素）
    String val3 = fruits.set(0, "Mango");

    System.out.println("fruits.remove(0): " + val1);
    System.out.println("fruits.remove(\"Lemon\"): " + val2);
    System.out.println("fruits.set(0, \"Mango\"): " + val3);
    System.out.println(fruits);
  }
}
