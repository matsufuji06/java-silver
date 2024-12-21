class Item {
  /**
   * カプセル化とデータ隠ぺいの典型
   * →他のクラスからメンバ変数への直接のアクセスはできず、
   * メソッドを通してアクセスする
   */
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

public class Main {
  public static void main(String[] args) {
    // オブジェクトの生成(インスタンス化)
    Item item = new Item();

    // itemのメンバにアクセス
    item.setName("T-shirt");
    System.out.println("item : " + item.getName());

    // private指定されたメンバへのアクセス　
    // item.name = "Sweater";
    // System.out.println("item : " + item.name);
  }
}
