public class Main {
    /**
     * for文での２次元配列へのアクセス
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[][] array = { { 1, 9 }, { 2, 8 }, { 3, 7 } };
        // 拡張for文
        for (int[] x : array) { // 対象はまだ１元目の配列
            for (int y : x) { // 内側のループで各要素にアクセス
                System.out.print(y);
            }
            System.out.print(" ");
        }
        System.out.println("\n---------");

        // 普通のfor文
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.print(" ");
        }
    }
}
