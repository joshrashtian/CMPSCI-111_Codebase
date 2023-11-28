package November28Lab;

import November28Lab.Shape.Triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Shape shape = new Shape() {
            
        };

        Triangle test = shape.new Triangle(10);

        System.out.println(test.getPerimeter());
    }
}
