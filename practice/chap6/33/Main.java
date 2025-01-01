import java.util.*;

/**
 * 様々なコレクションの生成
 */
public class Main {
    public static void main(String[] args) {
        // asList
        String[] str = { "O", "P", "Q" };
        List<String> list1 = Arrays.asList(str);
        List<Integer> list2 = Arrays.asList(8, 11, 17);
        // ArrayList<Character> ng = Arrays.asList('a');
        System.out.println("String[] str: " + Arrays.toString(str));
        str[1] = "Piano";
        list1.set(0, "Organ");
        System.out.println("List<String> list1: " + list1);
        // list1.add("Violin"); list1.remove(2);

        // of：変更不可のイミュータブルなリスト
        List<Double> list3 = List.of(1.0, 2.0, 3.0);
        // list3.set(0, 0.0);
        Set<Integer> set = Set.of(1, 2, 3); // Set
        Map<Integer, String> map = Map.of(1, "A", 2, "B"); // Map：「キー, 値, キー, 値．．．」
        // Map<Integer, String> map = Map.of(1, 2, "A", "B");
    }
}
