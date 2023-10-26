public class TestStock {
    public static void main(String[] args){
        Stock stock1 = new Stock("$", 300);
        
        System.out.println(stock1.getPrice());
        System.out.println(stock1.getSymbol());
        System.out.println(stock1.toString());
    }
    
}