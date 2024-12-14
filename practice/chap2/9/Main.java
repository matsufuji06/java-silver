public class Main {
    public static void main(String[] args) {
        // 要素への代入がなくても、「0」「0.0」「null」「false」などの初期値が設定されている
        double[] darr = new double[1];
        float[] farr = new float[1];
        String[] sarr = new String[1];
        System.out.println("darr[0] : " + darr[0]);
        System.out.println("darr[0] : " + farr[0]);
        System.out.println("sarr[0] : " + sarr[0]);
    }
}
