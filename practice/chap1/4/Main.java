// ①パッケージ化されたクラスは完全修飾名（ここではcom.se.Main）でアクセスする必要がある
// ②宣言されたパッケージ通りでクラスファイルを配置する必要がある

// 実行すると、
// Error: Could not find or load main class Main
// Caused by: java.lang.NoClassDefFoundError: com/se/Main (wrong name: Main)

package com.se;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main");
    }
}
class Sample {}
