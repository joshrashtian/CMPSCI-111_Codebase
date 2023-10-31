public class Store {
    private String location;
    private String name;
    private boolean isShoeStore;

    Store(){

    }

    Store(String newLocation, String newname, boolean ShoeStore){
        if(newLocation.isBlank()){
        location = "Defaultington";
        } else {
        location = newLocation;
        }
        if(newname.isBlank()){
        name = "Defaultington 2";
        } else {
        name = newname;
        }
        isShoeStore = ShoeStore;
    }

    String getLocation(){
        return location;
    }

    String getName(){
        return name;
    }

    Boolean isShoe(){
        return isShoeStore;
    }

    void setLocation(String newLocation){
        if(!newLocation.isBlank()){
        System.out.println("Error: Can not define location.");
        } else {
        location = newLocation;
        }
    }

    void setName(String newname){
        if(!newname.isBlank()){
        System.out.println("Error: Cannot define name");
        } else {
        name = newname;
        }
    }

    void setShoeStore(Boolean setShoe){
    isShoeStore = setShoe;
    }

    public String toString(){
    String Display;
    Display = "Shoe Store: " + isShoeStore + ", Name: " + name + ", Location: " + location;
    return Display;
    }
}
