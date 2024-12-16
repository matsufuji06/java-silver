public class Main {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";
        // internメソッド: 文字プール内に同じ文字列がある場合は、そのオブジェクトの参照を返し、なければ該当の文字列をプールに追加したうえで参照を返す
        String s4 = s2.intern();
        String t1 = """
                Java""";
        String t2 = """
                Java
                """;
        System.out.println("equals() : " + s1.equals(s2)); // true: 参照先ではなく、値の比較
        System.out.println(s1 == s2); // false: s2はnewでオブジェクト化しているため異なる参照
        System.out.println(s1 == s3); // true: s3はインターン化されたオブジェクトかつ、同じ文字のためtrue
        System.out.println(s1 == s4); // true: s4は明示的にインターン化されている
        System.out.println(s1 == t1); // true: コードブロックでも内容が同じならOK
        System.out.println(s1 == t2); // false: \nの有無
    }
}
