/**
 * オブジェクトのライフサイクルとガベージコレクター
 * ・オブジェクトのライフサイクル：オブジェクトが生成されて破棄されるまでの期間
 * ・インスタンス化されたオブジェクトはメモリ上に保持される
 * ・参照情報が失われたオブジェクトは破棄される
 * ・上記の管理は実行環境JVM上のガベージコレクターが行う
 * ・参照情報が失われるタイミングは以下の２つ
 * ①参照変数にnullを代入
 * ②参照変数に別のオブジェクトを代入
 */
public class Main {
  public static void main(String[] args) {
    // ①参照変数にnullを代入
    Item item1 = new Item();
    Item item2 = item1;
    item1 = null; // この時点でitem1の参照情報が失われるが、item2が残っているためライフサイクルはまだ生きている
    item2 = null; // ここで参照情報が完全に失われるため、Itemはメモリ上から破棄される（ガベージコレクターの対象）

    // ②参照変数に別のオブジェクトを代入
    Item item3 = new Item();
    item3 = new Item(); // 新たにnewして別のオブジェクトを代入すると、以前のオブジェクトであるitem3はメモリ上から破棄される（ガベージコレクターの対象）
  }
}

class Item {
}