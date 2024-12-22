/**
 * コンストラクタによるオブジェクトの初期化
 * 
 */
public class Item {
    private int id;
    private String name;

    /**
     * コンストラクタ
     * ・newすると呼び出される
     * ・命名はクラス名と同じ
     * 
     * @param id
     * @param name
     */
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * デフォルトコンストラクタ
     * ・クラスにコンストラクタがない場合は、下記のような引数なし・処理なしの
     * デフォルトコンストラクタが読み込まれていたことになる。
     */
    // public Item() {
    // }

    public void printItem() {
        System.out.println("Item id:" + id + " name:" + name);
    }

    public static void main(String[] args) {
        Item item = new Item(100, "T-shirt"); // コンストラクタ呼び出し1
        item.printItem();
        new Item(200, "Jacket").printItem(); // コンストラクタ呼び出し2
    }
}
