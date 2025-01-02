public class Main {
    public static void main(String[] args) {
        try {
            int i1 = args[0].length();
            int i2 = Integer.parseInt(args[0]);

            /**
             * multi-catchによる例外補足
             */
        } catch (ArrayIndexOutOfBoundsException
                | NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        /*
         * try {
         * int i1 = args[0].length();
         * int i2 = Integer.parseInt(args[0]);
         * } catch (ArrayIndexOutOfBoundsException e) {
         * System.out.println("Exception: " + e.getMessage());
         * } catch (NumberFormatException e) {
         * System.out.println("Exception: " + e.getMessage());
         * }
         */
    }
}
