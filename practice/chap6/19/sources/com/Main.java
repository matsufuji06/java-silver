package com;

import com.a.*;

public class Main {
    public static void main(String[] args) {
        // オブジェクトを引数としてprintlnするとtoStringが呼ばれる
        System.out.println(new Circle());
        System.out.println(new Triangle());
        System.out.println(new Square());
        System.out.println(new Cube());
    }
}
