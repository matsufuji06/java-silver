/**
 * シールされたインターフェイス
 * ・インターフェイスはfinalにはできないためsealedかnon-sealed
 */
sealed interface Item permits Food {
  double TAX_RATE = 0.1;

  int calcPrice();
}

/**
 * シールクラスを実装したレコードクラス
 * ・暗黙でfinalなので、sealedとnon-sealedはダメ
 */
record Food(String name, int price) implements Item {
  @Override
  public int calcPrice() {
    return (int) (price * (1 + TAX_RATE));
  }
}

public class Main {
  public static void main(String[] args) {
    Food food = new Food("Chocolate", 750);
    System.out.println(food.name() + ": "
        + food.calcPrice() + "yen");
  }
}
