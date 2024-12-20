// Sample.java 動作確認用
public class Main {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.setNum(100);
        System.out.println("s.getName() : " + s.getName()); // コンパイルは通る。セットしてないが初期値nullが表示される。
        s.name = "太郎"; // このセットでもOK
        System.out.println("s.getName() : " + s.getName()); // 太郎
        System.out.println("s.getNum() : " + s.getNum());
    }
}
