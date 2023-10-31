public class Shoe {
    private String brand;
    private int shoeSize = 0;
    private boolean kidsSize;
    private double price = 0;

    Shoe () {
    
    }

    Shoe (String shoebrand, int size, double newprice, boolean isKids) {
    if((kidsSize) || (!kidsSize)){
    kidsSize = isKids;
    }
    if(newprice > 0){
    price = newprice;
    } else {
    price = 0.99;
    }
    if(shoebrand.isEmpty()){
        System.out.println("Error: No Brand!");
    } else {
        brand = shoebrand;
    }
    if((size > 0) && (size < 15)){
        shoeSize = size;
    } else {
        shoeSize = 1;
    }
    }

    int getSize(){
        return shoeSize;
    }

    void setSize(int newSize){
        if((newSize > 0) && (newSize < 15)){
        shoeSize = newSize;
        } else {
        System.out.println("Error: Not a proper shoe size!");
        }
    }

    void setBrand(String newBrand){
        if(newBrand.isEmpty()){
        System.out.println("Error: No Brand!");
        } else {
        brand = newBrand;
        }
    }

    void setPrice(double newPrice){
        if(newPrice > 0){
        price = newPrice;
        }
    }
    void setKids(boolean isKidsSize){
        if((kidsSize) || (!kidsSize)){
        kidsSize = isKidsSize;
        }
    }

    double getPrice(){
        return price;
    }

    boolean isKids(){
        return kidsSize;
    }

    String getBrand(){
        return brand;
    }    

    public String toString(){
        String Display;
        if(kidsSize){
        Display = "This is a " + brand + ", it is a Size " + shoeSize + " in Kids. It costs " + price + ".";
        } else {
        Display = "This is a " + brand + ", it is a Size " + shoeSize + ". It costs " + price + ".";
        }
        return Display;
    }

}
