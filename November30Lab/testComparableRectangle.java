package November30Lab;

public class testComparableRectangle {
    public static void main(String[] args) {
        comparableRectangle test = new comparableRectangle(10, 30);
        comparableRectangle test2 = new comparableRectangle(20, 30);

        System.out.println(test.compareTo(test2));
        System.out.println(test2.compareTo(test));

        comparableRectangle test3 = new comparableRectangle(5, 5);
        comparableRectangle test4 = new comparableRectangle(5, 5);

        System.out.println(test3.compareTo(test4));
    }
}
