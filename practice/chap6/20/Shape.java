/**
 * 同一のファイルならば、permitsは省略可能
 */
public sealed class Shape
/* permits Circle, Triangle, Square */ {
}

final class Circle extends Shape {
}

non-sealed class Triangle extends Shape {
}

sealed class Square extends Shape {
}

// permits指定されていないが、同一ファイル内なので許可されていることになる
final class Cube extends Square {
}
