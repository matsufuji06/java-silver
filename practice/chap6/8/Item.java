/**
 * レコードクラス（イミュータブルなオブジェクト：値の変更ができない）
 * ①引数部分のメンバ変数（※private finalなので実質、定数）
 * ②コンストラクタ
 * ③Getter（アクセサメソッド）（※private finalである以上、Setterで設定もできない）
 * ④Objectクラスのメソッドのオーバーライド（equals(), hashCode(), toString()）
 * が、埋め込まれている
 */
public record Item(int id, String name) {
    // public final class extends Record（暗黙的にfinalクラスで、継承できない）
    // レコードで保持されるデータを「コンポーネント」という
}

class Main {
    public static void main(String[] args) {
        Item item1 = new Item(100, "T-shirt");
        Item item2 = new Item(200, "Jeans");
        System.out.println("item1.id(): " + item1.id());
        System.out.println("item1.name(): " + item1.name());
        System.out.println("item1.equals(item2): " + item1.equals(item2));
        System.out.println("item1.hashCode(): " + item1.hashCode());
        System.out.println("item1.toString(): " + item1.toString());
    }
}
