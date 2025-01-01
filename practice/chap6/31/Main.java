import java.util.*;

/**
 * （ジェネリクス）
 * →クラスやインターフェイスの定義時点では型をパラメータ化しておいて、
 * 利用時に具体性な型を指定する。
 * →これまで見てきたコレクションフレームワークのインターフェイスやクラスの定義では、
 * ジェネリクスが利用されている。
 * 
 * （型パラメータリスト）
 * →クラスやインターフェイスの定義側の<E>や<K, V>
 * →利用側のオブジェクト生成時に具体性な型を指定する
 * 
 * 【定義側】
 * public interface List<E> {}
 * 
 * 【利用側】
 * List<String> list = new ArrayList<>();
 */
public class Main {
    public static void main(String[] args) {
        List<String> safeList = new ArrayList<>();
        safeList.add("Generics");
        // safeList.add(5.0);

        // ジェネリクスの型を指定しないのも可能、その場合は型はObjectで管理される
        // ジェネリクスに型指定がない旨の警告が出るが、コンパイルは通る
        List unsafeList = new ArrayList();
        unsafeList.add("Non-Generics");
        unsafeList.add(1.4); // double型
        for (int i = 0; i < unsafeList.size(); i++) {
            // 実行するとdouble型のキャストに失敗し、例外となる
            System.out.println((String) unsafeList.get(i));
        }
    }
}
