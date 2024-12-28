/**
 * シールされたインターフェイス
 * ・インターフェイスはfinalにはできないためsealedかnon-sealed
 */
sealed interface Foo permits Bar {
}

sealed interface Bar extends Foo permits Baz {
}

non-sealed interface Baz extends Bar {
}

// final interface Baz extends Bar{} // final指定は不可
sealed interface Eatable permits Vegetable {
} // 実装クラスの限定

final class Vegetable implements Eatable {
}
