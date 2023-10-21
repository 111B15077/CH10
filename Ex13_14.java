package L10;

//hw10_1, 繼承的練習
class Caaa2 {
    public int num1;
    public int num2;

    // (a) 無引數建構元，設定初值為1
    public Caaa2() {
        num1 = 1;
        num2 = 1;
    }

    // (b) 有引數的建構元，設定num1為a，num2為b
    public Caaa2(int a, int b) {
        num1 = a;
        num2 = b;
    }
}

// 子類別 Cbbb，繼承自 Caaa
class Cbbb2 extends Caaa2 {

    // (c) 有引數的建構元，可呼叫父類別的建構元
    public Cbbb2(int a, int b) {
        super(a, b);
    }

    // (13) 在子類別 Cbbb 中使用父類別的無引數建構元
    public Cbbb2() {
        super();
    }

    // 新增 set_num 函數，設定從父類別繼承而來的成員 num1 和 num2
    public void set_num(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // 新增 show 函數，顯示 num1 和 num2 的值
    public void show() {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

public class Ex13_14 {
    public static void main(String[] args) {
        // (13) 使用父類別的無引數建構元
        Cbbb2 bb2 = new Cbbb2();
        System.out.println("13:");
        bb2.show();

        // (14) 使用父類別的有引數建構元，設定num1為8，num2為12
        Cbbb2 bb3 = new Cbbb2(8, 12);
        System.out.println("14:");
        bb3.show();
    }
}
