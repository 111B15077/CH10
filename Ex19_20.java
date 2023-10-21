package L10;

class CRectangle {
    protected int length;
    protected int width;

    public CRectangle(int l, int w) {
        length = l;
        width = w;
    }

    
    public int area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "length=" + length + ", width=" + width + ", area=" + area();
    }

    public String toString(int a, int b) {
        if (a >= b) {
            return "length=" + a + ", width=" + b + ", area=" + (a * b);
        } else {
            return "ArgumentError";
        }
    }
}

public class Ex19_20 {
    public static void main(String[] args) {
        CRectangle rect = new CRectangle(2, 6);

        System.out.println(rect.toString()); // 使用第一種 toString()
        System.out.println(rect.toString(5, 3)); // 使用第二種 toString()，a < b
        System.out.println(rect.toString(5, 7)); // 使用第二種 toString()，a >= b
    }
}
