/**
 * インスタンスメソッド or staticメソッドからのアクセスの違い
 */
public class Sample {
    int value = 100;
    static int commonValue = 500;

    // インスタンスメソッドなので、インスタンス・staticメンバ（変数・メソッド）へのアクセスがともに可能
    public void printValues() {
        System.out.println(" * instance value : " + value);
        System.out.println(" * static common value : " + commonValue);
    }

    // staticメソッドなので、インスタンスメンバ（変数・メソッド）へのアクセスができない
    // （元から保持されているstaticメソッドから、インスタンス化されないと生成されないインスタンスメンバへのアクセスはできない）
    public static void printCommonValue() {
        // int val = value;
        System.out.println(" * static common value : " + commonValue);
    }

    public static void main(String[] args) {
        printCommonValue();
        System.out.println("static field : " + commonValue);

        // staticメソッドなので、インスタンスメンバ（変数・メソッド）へのアクセスができない
        // printValues();

        Sample s1 = new Sample();
        Sample s2 = new Sample();
        System.out.println("instance field : " + s1.value);
        s2.printValues();
    }
}
