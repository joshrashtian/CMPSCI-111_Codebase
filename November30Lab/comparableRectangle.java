package November30Lab;

public class comparableRectangle implements Comparable <comparableRectangle>{
    private int width;
    private int height;

    comparableRectangle () {

    } 

    comparableRectangle (int newWidth, int newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public int getArea() {
        return width * height;
    }

    public int compareTo(comparableRectangle a) {
    if ((a.width * a.height) > (width*height) ) {
        return 2;
        } else if ((a.width * a.height) < (width * height)) {
         return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "comparableRectangle [width=" + width + ", height=" + height + "]";
    }
}
