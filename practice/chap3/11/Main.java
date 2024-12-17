public class Main {
    public static void main(String[] args) {
        // 数値をchar型に変換
        byte b = 97;
        short s = 98;
        int i = 99;
        long l = 100L;
        float f = 101.123F;
        double d = 102.456;

        System.out.println((char) b); // a
        System.out.println((char) s); // b
        System.out.println((char) i); // c
        System.out.println((char) l); // d
        System.out.println((char) f); // e
        System.out.println((char) d); // f

        // char型から数値に変換
        char g = 'g';
        byte charb = (byte) g;
        char h = 'h';
        short chars = (short) h;
        char ci = 'i';
        int chari = ci;
        char j = 'j';
        long charl = j;
        char k = 'k';
        float charf = k;
        char cl = 'l';
        double chard = cl;

        // ※小文字の「d」が数値の「100」にあたる
        System.out.println(charb); // 103
        System.out.println(chars); // 104
        System.out.println(chari); // 105
        System.out.println(charl); // 106
        System.out.println(charf); // 107.0
        System.out.println(chard); // 108.0

        // 型変換の注意点
        byte b1 = 1;
        byte b2 = ++b1; // b2は2
        System.out.println("b2: " + b2); // 値を確認

        short s1 = 1, s2 = 2;
        // short s3 = s1 + s2; // コンパイルエラー、右辺はint型（計算しようとするとintに昇格する）
        short s4 = (short) (s1 + s2); // s4は3
        int i1 = s1 + s2; // i1は3
        System.out.println("s4: " + s4 + ", i1: " + i1); // 値を確認
    }
}
