public class Sample {
    // クラスのブロック直下で宣言しているため、クラス全体からアクセス可能
    int num;
    String name;

    int getNum() {
        // メンバ変数のnumにアクセス
        return num;
    }

    void setNum(int num) {
        // this→自身のオブジェクト
        // this.numでメンバ変数のnumにアクセス
        this.num = num;
        // id = num;
    }

    String getName() {
        return this.name;
    }

    void setName(String n) {
        // メンバ変数nameとローカル変数nは命名が異なるため、thisを使わなくてもOK
        name = n;
    }

    void methodA(int id) {
        System.out.println(id);
    }

    void methodB(int id) {
        System.out.println(id);
    }
}
