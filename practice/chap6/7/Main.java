/**
 * スーパークラスのコンストラクタ呼び出し
 */
class Item {
    private int id;

    /**
     * 下記の引数ありのコンストラクタがなければ、
     * このような「デフォルトコンストラクタ」が暗黙的に埋め込まれている
     */
    // Item() {
    // super();
    // }

    Item(int id) {
        this.id = id;
    }

    public void display() {
        System.out.println("Item id: " + id);
    }
}

class Clothes extends Item {
    private String brand;

    /**
     * 下記の引数ありのコンストラクタがなければ、
     * このような「デフォルトコンストラクタ」が暗黙的に埋め込まれている
     */
    // Clothes() {
    // super();
    // }

    Clothes(int id, String brand) {
        // 親クラスのコンストラクタを呼び出す
        super(id);
        this.brand = brand;
    }

    @Override
    public void display() {
        // 親クラスのオーバーライド元メソッドを呼び出す
        super.display();
        System.out.println("Clothes brand: " + brand);
    }
}

class Main {
    public static void main(String[] args) {
        Clothes c = new Clothes(100, "Duke's Clothes");
        c.display();
    }
}
