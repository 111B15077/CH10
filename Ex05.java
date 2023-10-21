package L10;

// Ex05, 簡單的承繼例
class Caaa {
    private int num;

    public Caaa(int n) {
        num = n;
    }

    public int get() {
        return num;
    }
}

class Cbbb extends Caaa {
    // 新增子類別 Cbbb 的建構元，呼叫父類別的建構元
    public Cbbb() {
        super(2); // 這裡設定 num 為 2
    }

    public void show() {
        System.out.println("num=" + get());
    }
}

public class Ex05 {
    public static void main(String args[]) {
        Cbbb bb = new Cbbb();
        bb.show();
    }
}
