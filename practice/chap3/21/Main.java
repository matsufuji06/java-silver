public class Main {
    public static void main(String[] args) {
        /**
         * switch式
         * ・switch文では変数等をswitch文の中でしか処理出来なかったが、
         * switch式では外でその変数などを使うことができる
         * ・「break」がいらない
         * ・「yield」と「->」の２パターン
         * ・「default」は必須
         */
        int month = 12;
        // Integer month = null;
        System.out.println(month + " is " +
                switch (month) { // nullだと実行時にjava.lang.NullPointerException
                    case 12, 1, 2:
                        yield "Winter";
                    case 3, 4, 5:
                        yield "Spring";
                    case 6, 7, 8:
                        yield "Summer";
                    case 9, 10, 11:
                        yield "Autumn";
                    default:
                        yield "N/A";
                });
        String val = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> {
                System.out.println("N/A");
                yield "N/A"; // 新たにブロックを作るならばyieldが必要
            }
        };
        System.out.println(month + " is " + val);
    }
}
