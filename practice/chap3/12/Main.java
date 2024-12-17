public class Main {
    public static void main(String[] args) {
        /**
         * ラッパークラス
         * ・基本データ型を参照型のオブジェクトとして扱う
         * ・langパッケージに属するためインポート不要
         * （基本データ型→ラッパークラス）
         * byte→Byte
         * short→Short
         * int→Int
         * long→Long
         * float→Float
         * double→Double
         * char→Character
         * boolean→Boolean
         */

        // ボクシングとアンボクシング
        Integer obj1 = 100; // オートボクシング（基本データ型を箱boxに詰める）
        int i1 = obj1; // オートアンボクシング（基本データ型を箱boxから取り出す）
        // Double obj2 = 10; // コンパイルエラー

        // 文字列の変換
        int i = Integer.parseInt("123"); // 文字列からint型
        double d = Double.parseDouble("1.23"); // 文字列からdouble型
        boolean b = Boolean.parseBoolean("true"); // 文字列からboolean型
        char c = "Duke".charAt(0); // 文字列の0番目(D)をchar型へ
    }
}
