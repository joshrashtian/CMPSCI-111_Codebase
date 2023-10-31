public class ObjectsAndClasses {
    public static void main(String[] args){
        Shoe Adidas = new Shoe("Adidas", 18, 19.99, true);
        Store AdidasOutlet = new Store("Valencia", "Adidas Outlet", true);
        
        System.out.println(Adidas.toString());
        
        System.out.println(Adidas.getSize());

        Adidas.setSize(19);

        System.out.println(Adidas.getSize());

        Adidas.setSize(13);

        Adidas.setPrice(69.99);
        Adidas.setBrand("");

        System.out.println(Adidas.toString());
        System.out.println(AdidasOutlet.toString());

        System.out.println(Adidas.getBrand() + " can be found at the store " + AdidasOutlet.getName() + " at " + AdidasOutlet.getLocation());
    }
}