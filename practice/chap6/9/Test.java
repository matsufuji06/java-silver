/**
 * レコードクラスのコンストラクタ
 */
record Clothes(int id, String brand) {
  /*
   * // 標準コンストラクタ
   * // →引数をコンポーネントと一致させる
   * // 例1
   * Clothes(int id, String brand) {
   * this.id = id;
   * this.brand = brand;
   * }
   * 
   * // 例2
   * Clothes(int id, String brand) {
   * this.id = id;
   * this.brand = brand.trim(); このちょっとした初期化方法のために他のコンポーネントも記載するのは大変
   * }
   */

  // コンパクトコンストラクタ
  // ・初期化を省略したコンポーネントに対しては暗黙的に初期化される
  // ・普通のthisの初期化はダメ（コンパクトコンストラクタではなくなる）
  // ・標準コンストラクタとコンパクトコンストラクタはどちらか一方しか使えない
  // 例3
  Clothes {
    id = id > 0 ? id : 0;
    // this.brand = brand;
  }
}

// 動作確認用
class Test {
  public static void main(String[] args) {
    Clothes c = new Clothes(100, "   Duke   ");
    System.out.println(c);
  }
}
