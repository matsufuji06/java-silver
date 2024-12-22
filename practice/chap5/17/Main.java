/**
 * 参照型（オブジェクト型）の値のコピー
 * ・参照情報がコピーされる
 */
public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("T-shirt");
        Item item2 = item1;
        // ※ここでitem1も"Jeans"となる
        item2.name = "Jeans";

        System.out.println("item1, item2 : "
                + item1.name + ", " + item2.name); // Jeans, Jeans
        System.out.println("item1 == item2 : "
                + (item1 == item2)); // true
    }
}

class Item {
    String name;

    Item(String name) {
        this.name = name;
    }
}
