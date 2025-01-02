public class Sample2 {
    public void method() {
        try {

        } catch (ArithmeticException | NumberFormatException e) {
            // multi-catchの場合、eは暗黙的にfinalのため再代入できない
            e = null;
        } catch (Exception e) {
            // multi-catchではないので、再代入OK
            e = null;
        }
    }
}
