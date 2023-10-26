public class Stock {
    private String symbol;
    private double currentPrice;

    Stock() {

    }

    Stock(String newsymbol, double newPrice){
        symbol = newsymbol;
        currentPrice = newPrice;
    }
    double getPrice(){
        return currentPrice;
    }
    String getSymbol(){
        return symbol;
    }

    public StringtoString getStock(){
        String Display = "Symbol: " + symbol + ", Current Price: " + currentPrice;
        return Display;
    }
}
