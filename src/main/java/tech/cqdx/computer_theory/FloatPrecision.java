package tech.cqdx.computer_theory;

public class FloatPrecision {

    /**
     * 大数吃小数
     */
    public static void big_eat_small() {
        float a = 20000000.0f;
        float b = 1.0f;
        float c = a + b;
        System.out.println("c is " + c);
        float d = c - a;
        System.out.println("d is " + d);
    }

    /**
     * 大数吃小数
     */
    public static void lossPrecision() {
        float sum = 0.0f;
        float x = 1.0f;
        for (int i = 0; i < 20000000; i++) {
            sum += x;
        }
        System.out.println("sum is " + sum);
    }

    /**
     * 解决大数吃小数的办法
     */
    public static void kahanSummation() {
        float sum = 0.0f;
        float c = 0.0f;
        float x = 1.0f;
        for (int i = 0; i < 20000000; i++) {
            float y = x - c;
            float t = sum + y;
            c = (t - sum) - y;
            sum = t;
        }
        System.out.println("sum is " + sum);
    }

    public static void main(String[] args) {
        lossPrecision();
        kahanSummation();
    }
}
