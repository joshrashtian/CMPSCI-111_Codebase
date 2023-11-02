package November2Lab;

public class Rectangle {
    private double length = 1.0;
    private double width = 1.0;
    private String color = "white";
    private boolean filled = false;

    Rectangle() {
        
    }

    Rectangle( double newLength, double newWidth ){
        length = newLength;
        width = newWidth;
    }

    Rectangle ( double newLength, double newWidth, String newcolor, boolean isFilled){
        length = newLength;
        width = newWidth;
        setColor(newcolor);
        setFilled(isFilled);
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public void setFilled(boolean status){
        filled = status;
    }

    double getArea(){
        return width * length;
    }

    String getColor(){
        return color;
    }

    Boolean getFilled(){
        return filled;
    }

    public String toString(){
        return "Color: " + color + '\n' + "Length / Width: " + length + " / " + width + "\n" + "Filled: " + filled + "\n" + "--------------------"; 
    }
    
}
