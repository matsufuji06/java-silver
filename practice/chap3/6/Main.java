public class Main {
    public static void main(String[] args) {
        short s = 10;
        int i = 10;
        float f = 10.0F;
        double d = 10.0;
        char a = 'a';
        String s1 = "Duke";
        String s2 = new String("Duke");
        // s1 = s2;
        System.out.println("s == i   : " + (s == i)); // true: intとshortだが、同じ値
        System.out.println("f == d   : " + (f == d)); // true: intとshortだが、同じ値
        System.out.println("a != 'A' : " + (a != 'A')); // true: 違う文字
        System.out.println("s1 == s2 : " + (s1 == s2)); // false: Stringは参照型で、s1とs2は異なるオブジェクトを参照している
    }
}
