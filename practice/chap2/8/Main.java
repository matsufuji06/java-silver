public class Main {
    public static void main(String[] args) {
        // 宣言と定義を別々
        // int[] vers;
        // vers = new int[3];

        // 宣言と定義を一緒
        int[] vers = new int[3];
        vers[0] = 8;
        vers[1] = 11;
        vers[2] = 17;
        System.out.println("vers.length : " + vers.length);
        int v = vers[0];
        System.out.println(v);
        System.out.println("vers[1] : " + vers[1]);
        System.out.println("vers[2] : " + vers[2]);
        // System.out.println("vers[3] : " + vers[3]);
        System.out.println(); // 改行

        // 要素数が決まっている場合に、一気に定義できる
        // ※配列の要素が文字列の場合、各要素も参照を保持する形になる
        String[] cols = { "Red", "Black" };
        // String[] cols = new int[] { "Red", "Black" };
        System.out.println("cols.length : " + cols.length);
    }
}
