package November28Lab;

abstract class Shape {
    private int perimeter;

    Shape() {

    }

    Shape (int newPerimeter) {
        perimeter = newPerimeter;
    }

    public int getPerimeter() {
        return perimeter;
    }

    class Triangle extends Shape {
        private int perimeter;
        Triangle() {

        }

        Triangle(int newPerimeter) {
            perimeter = newPerimeter;
        }

        public int getPerimeter() {
            return perimeter;
        }

    }
}