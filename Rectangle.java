public class Rectangle {
    int length = 1;
    int width = 1;
    
    Rectangle(){
    }

    Rectangle(int newWidth, int newLength){
        width = newWidth;
        length = newLength;
    }
    double getArea(){
        return length * width;
    }
}
