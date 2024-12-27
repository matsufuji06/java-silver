/**
 * インターフェイスの実装
 * ※レコードクラスにも実装できる
 * ※インターフェイスの抽象メソッドでオーバーライドしていないものがあれば実装されるのは抽象クラスとなる
 * ※次の物を定義できる
 * ・①抽象メソッド（暗黙的にpublic abstract）
 * ・②定数（暗黙的にpublic static final）
 * ・③以下の具象メソッド
 * １：defaultメソッド
 * ２：staticメソッド
 * ３：privateメソッド
 */
interface Eatable { // インタフェース
  // 暗黙的にpublic abstract
  void showCalories();
}

class Item { // スーパークラス
  String name;

  Item(String name) {
    this.name = name;
  }
}

// extends→implementsの順じゃないとコンパイルエラー
class Food extends Item implements Eatable { // 実装クラス/サブクラス
  private int calories;

  public Food(String name, int calories) {
    super(name);
    this.calories = calories;
  }

  @Override
  // ※インターフェイスの元メソッドが暗黙的にpublicなのでここもpublic必須
  public void showCalories() {
    System.out.println(name + ": " + calories + "kcal/100g");
  }
}

public class Main {
  public static void main(String[] args) {
    Food f = new Food("Chocolate", 500);
    f.showCalories();
  }
}
