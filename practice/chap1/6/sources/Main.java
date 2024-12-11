package com.se;

import com.se.sub.Foo;

// classesフォルダ内で「javac -d . ../sources/*.java」とすると、
// ソース内で記載したパッケージの構成でクラスファイルが生成される

public class Main {
    public static void main(String[] args) {
        Foo s = new Foo();
        s.display();
        com.se.sub.Bar b = new com.se.sub.Bar(); // インポートしていない
        b.display();
        // 異なるパッケージのSubのクラスを利用するには public classにする必要がある
    }
}
