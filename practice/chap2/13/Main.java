public class Main {
    public static void main(String[] args) {
        /**
         * コマンドライン引数
         * java クラス名 引数1 引数2
         * java ファイル名.拡張子 引数1 引数2（ソースファイルモード）
         */
        for (var arg : args) {
            System.out.println("Hello " + arg + "!");
        }
        // System.out.println(args[1] + args[2]); エラー
    }
}
