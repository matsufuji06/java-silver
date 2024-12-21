import com.Item;

class Main {
    public static void main(String[] args) {
        // インスタンス化するとコンパイルエラー（Item is not public in com; cannot be accessed from outside
        // package）
        Item item = new Item();
    }
}
