// これが先頭に来るとmain()メソッドがないのでエラーになる
// class Sample {}

public class Hello {
    public static void main(String[] args) {
        System.out.println("Source-file mode");
    }
}
class Sample {
    // public static void main(String[] args) {
    //     System.out.println("Sample");
    // }
}

// 実行コマンドでjava (拡張子も含めたソースファイル名)とすると、ソースファイルモードで実行（コンパイルを行わずに直接実行）
// ①コンパイル結果がメモリ上に保持されるため、ディスク上にクラスファイルができない
// ②最初のクラスHelloが実行された結果、出力が行われる