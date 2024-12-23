class Item { // スーパークラス
  private int id = 100;

  public void printItem() {
    System.out.println("Item id: " + id);
  }
}

class Clothes extends Item { // サブクラス
  private String brand = "Java";

  public void printClothes() {
    System.out.println("Clothes brand: " + brand);
    // 継承関係にあってもprivateにはアクセスできない
    // System.out.println("Item id: " + id);
    this.printItem(); // メソッド経由ならアクセスできる

    // private→同一のクラス内のみ
    // protected→同一のパッケージ、または継承関係にあるサブクラスから
    // public→全てのクラスから
    // アクセス修飾子なし→同一パッケージ内から　

  }
}

class Main {
  public static void main(String[] args) {
    Clothes c = new Clothes();
    c.printItem(); // スーパークラスのメソッドにアクセス
    c.printClothes(); // サブクラスのメソッドにアクセス
  }
}
