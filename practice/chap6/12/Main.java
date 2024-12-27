/**
 * 抽象クラス
 * ・実装を持たないメソッド→抽象メソッド
 * ・その抽象メソッドを持つことができるクラス→抽象クラス
 * （これまでの実装を持つメソッドとクラス→具象クラス・具象メソッド）
 * ①抽象メソッドを持つクラスは抽象クラスでなければならない
 * ②抽象クラスには抽象メソッドを持つことができるが必須ではない
 * ③抽象クラスには具象メソッドも定義できる
 * ④抽象クラスはインスタンス化できない
 */
abstract class Transport { // 抽象クラ
  // 普通のメンバ変数OK
  private int speed;

  public Transport(int speed) {
    this.speed = speed;
  }

  // 具象メソッドOK
  public int getSpeed() {
    return speed;
  }

  public abstract void move(); // 抽象メソッド
}

class Airplane extends Transport {
  public Airplane(int speed) {
    super(speed);
  }

  @Override
  public void move() { // 抽象メソッドのオーバーライド
    System.out.println("Airplane: flying at "
        + getSpeed() + "km/h");
  }
}

class Ship extends Transport {
  public Ship(int speed) {
    super(speed);
  }

  @Override
  public void move() { // 抽象メソッドのオーバーライド
    System.out.println("Ship: cruising at "
        + getSpeed() + "knots");
  }
}

abstract class Car extends Transport { // 抽象クラス
  // ※抽象メソッドをオーバーライドしない場合は、必然的にさらに抽象クラスになる
  public Car(int speed) {
    super(speed);
  }
}

public class Main {
  public static void main(String[] args) {
    new Airplane(900).move();
    new Ship(20).move();
  }
}
