class Item {
    /**
     * オーバーロード（多重定義）の例
     * ・メソッド名は同じだが、引数の「数・型・順番」が異なる
     * ・シグネチャ→メソッド名と引数の組み合わせ
     * ・アクセス修飾子(publicなど)と戻り値(voidなど)の型は考慮されない
     * ・継承関係にあるメソッドでオーバーロードが成立する
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printItem() {
        System.out.println("Item : " + name);
    }

    public void printItem(String mark) {
        System.out.print(mark);
        System.out.print(" Item : " + name);
        System.out.println(" " + mark);
    }

    public void printItem(String mark, int num) {
        String line = "";
        for (int i = 0; i < num; i++) {
            line += mark;
        }
        // 同じクラス内のメソッドをオーバーロードして呼び出し
        printItem(line); // this.printItem(line)
    }
}

public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        item.setName("T-shirt");

        // オーバーロードでの呼び出し
        item.printItem();
        item.printItem("*");
        item.printItem("#", 3);
    }
}
