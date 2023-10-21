package L10;

class Caaa1 {
    private int num;

    public Caaa1(int n) {
        num = n;
    }

    public int get() {
        return num;
    }

    // (a) 在父類別 Caaa 中新增 display() 函數
    public void display() {
        System.out.println("printed from Caaa class");
    }
}

class Cbbb1 extends Caaa1 {
    // 新增子類別 Cbbb 的建構元，呼叫父類別的建構元
    public Cbbb1() {
        super(2); // 這裡設定 num 為 2
    }

    public void show() {
        System.out.println("num=" + get());
    }

    // (b) 子類別 Cbbb 中改寫父類別的 display() 函數
    public void display() {
        System.out.println("printed from Cbbb class");
    }
}

public class Ex09 {
    public static void main(String args[]) {
        Cbbb1 bb = new Cbbb1();
        bb.show();

        // 使用 Cbbb 物件呼叫 display() 函數
        bb.display();
        System.out.println("c:將呼叫父類別 Caaa 的 display() 函數");
    }
}
