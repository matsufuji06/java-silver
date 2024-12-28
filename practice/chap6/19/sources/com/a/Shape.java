package com.a;
// import com.b.Heart;

/**
 * シールクラス
 * →クラスの実装先やインターフェイスの継承/実装先を限定できる
 * ※継承が許可されるサブクラスには以下の制約
 * ・シールクラスと同一のパッケージに配置する
 * ・シールクラスを直接のスーパークラスとして指定する必要がある
 * ・サブクラスの扱いを以下の方法で指定する必要がある
 * ①final：継承を禁止する
 * ②sealed：サブクラスもシールクラスとし、permitsで継承先を限定する
 * ③non-sealed：シールクラスではないクラスとする
 */
public abstract sealed class Shape
        permits Circle, Triangle, Square {
    // Heartクラスは別パッケージのため継承許可できない
    // permits Circle, Triangle, Square, Heart {
    public abstract double calcArea();

    @Override
    public String toString() {
        return getClass().getName() + ": " + calcArea() + " sq cm";
    }
}
