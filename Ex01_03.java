package L10;

//hw10_1, 繼承的練習
class Caaa {
    public int num1;
    public int num2;

    // (a) 無引數建構元，設定初值為1
    public Caaa() {
        num1 = 1;
        num2 = 1;
    }

    // (b) 有引數的建構元，設定num1為a，num2為b
    public Caaa(int a, int b) {
        num1 = a;
        num2 = b;
    }
}

// 子類別 Cbbb，繼承自 Caaa
class Cbbb extends Caaa {

    // (c) 有引數的建構元，可呼叫父類別的建構元
    public Cbbb(int a, int b) {
        super(a, b);
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

public class Ex01_03 {
    public static void main(String[] args) {
Caaa a1 = new Caaa();
        System.out.println("a:");
        System.out.println("num1 = " + a1.num1);
        System.out.println("num2 = " + a1.num2);

        // (b) 使用有引數建構元，設定num1為3，num2為7
        Caaa a2 = new Caaa(3, 7);
        System.out.println("b:");
        System.out.println("num1 = " + a2.num1);
        System.out.println("num2 = " + a2.num2);

        // (c) 使用有引數的 Cbbb 建構元，呼叫父類別的建構元，設定num1為8，num2為12
        Cbbb bb = new Cbbb(8, 12);
        System.out.println("c:");
        bb.show(); // 使用子類別的 show 函數
    }
}

