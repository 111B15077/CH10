package L10;

// CShape 類別
class CShape {
    public double area() {
        return 0.0;
    }
}

// (a) 圓形類別 CCircle
class CCircle extends CShape {
    private double radius;

    public CCircle(double r) {
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// (b) 正方形類別 CSquare
class CSquare extends CShape {
    private double side;

    public CSquare(double s) {
        side = s;
    }

    @Override
    public double area() {
        return side * side;
    }
}

// (c) 三角形類別 CTriangle
class CTriangle1 extends CShape {
    private double base;
    private double height;

    public CTriangle1(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class Ex11_12 {
    // (e) largest() 函數
    public static double largest(CShape[] shapes) {
        double maxArea = 0.0;
        for (CShape shape : shapes) {
            double area = shape.area();
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }


    public static void main(String[] args) {
        // (d) 建立圓形、正方形和三角形物件各兩個
        CCircle circle1 = new CCircle(5.0);
        CCircle circle2 = new CCircle(3.0);

        CSquare square1 = new CSquare(4.0);
        CSquare square2 = new CSquare(6.0);

        CTriangle1 triangle1 = new CTriangle1(8.0, 4.0);
        CTriangle1 triangle2 = new CTriangle1(6.0, 3.0);

        CShape[] shapes = {circle1, circle2, square1, square2, triangle1, triangle2};

        double maxArea = largest(shapes);
        System.out.println("最大面積是: " + maxArea);
        
        System.out.println("12.簡化代碼，可以更簡潔地管理多個物件。對多個不同類型的子類別物件進行統一操作。減少冗余代碼的數量");
    }
}
