public class Main {
    public static void main(String[] args) {
        String s1 = "Java Language";
        String s1_2 = "Java Language_2";
        s1_2 = s1;
        s1 = "Java Language_2";
        System.out.println("s1: " + s1);
        System.out.println("s1_2: " + s1_2);

        // 返り値がStringの場合は、新たな参照を保持するようにする
        // Stringオブジェクトはイミュータブル（不変）なオブジェクトのため
        String s2 = s1.replace("Language", "VM");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s1.substring(0, 5): "
                + s1.substring(0, 5));
        System.out.println("s1.indexOf(\"a\"):" + s1.indexOf("a"));
        System.out.println("s1.length(): " + s1.length());
    }
}
