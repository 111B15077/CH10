package L10;

class Car {
    protected String owner;
    protected String id;

    Car(String own, String s) {
        owner = own;
        id = s;
    }

    final void show() {
        System.out.println("車主姓名:" + owner);
        System.out.println("車牌號碼:" + id);
    }
}

class CColor extends Car {
    private String color;
    
    CColor(String own, String s, String c) {
        super(own, s);
        color = c;
    }

    // 這裡不再覆寫 show() 方法
}

public class Ex17 {
    public static void main(String[] args) {
        CColor mycar = new CColor("Riaan", "A1-2345", "Black");
        mycar.show(); // 這裡調用父類別的 show() 方法
    }
}
