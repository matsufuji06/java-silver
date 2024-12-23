class Item {
  private int id = 100;

  public void display() {
    System.out.println("Item id: " + id);
  }
}

class Clothes extends Item {
  private String brand = "Java";

  @Override
  public void display() {
    // オーバーライドしたメソッド内で「super.アクセスしたいメンバ」でオーバーライド元の処理も実行する
    super.display();
    // display();
    System.out.println("Clothes brand: " + brand);
  }
}

class Main {
  public static void main(String[] args) {
    Clothes c = new Clothes();
    c.display();
  }
}
