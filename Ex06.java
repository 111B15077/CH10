package L10;

class CTriangle {
    protected int base;
    protected int height;

    protected void show() {
        System.out.println("base=" + base + ", height=" + height);
    }
}

class CData extends CTriangle {
    // (b) 在 CData 類別中新增 area() 函數來計算並顯示面積
    public void area() {
        show(); // 呼叫父類別的 show() 函數以顯示 base 和 height
        double area = 0.5 * base * height;
        System.out.println("area=" + area);
    }

    // (a) CData 類別的建構元，初始化 base 和 height
    public CData(int b, int h) {
        base = b;
        height = h;
    }
}

public class Ex06 {
    public static void main(String[] args) {
        CData obj = new CData(3, 8);
        obj.area();
    }
}
