public class Main {
        public static void main(String[] args) {
                /**
                 * byte...8ビット（-128~127）
                 * short...16ビット（-32768~32767）
                 * int..32ビット（-2147483648~2147483647）
                 * long...64ビット（-9223372036854775808~9223372036854775807）
                 */

                // 右辺がintの限度以上
                // long l1 = 2_200_000_000;

                long l2 = 2_200_000_000L;

                // 右辺はFをつけないとdouble扱い
                // float f1 = 10.0;

                float f2 = 20.0F;
                byte b1 = 100;

                // 右辺はbyteの限度を超えている
                // byte b2 = 200;

                short s1 = 200;
        }
}
