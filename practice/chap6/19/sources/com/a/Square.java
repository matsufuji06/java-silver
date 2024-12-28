package com.a;

// 引き続きシールクラス（permitsで継承許可するクラスをさらに指定）
public sealed class Square extends Shape permits Cube {
    double side = 5.0;

    @Override
    public double calcArea() {
        return Math.pow(side, 2.0);
    }
}
