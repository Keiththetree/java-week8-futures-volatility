import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GoldFuture gold = new GoldFuture(1,2,3);
        gold.loadPricesFromFile("GoldData.txt");
        List<Double> prices = gold.getPrices();
        CopperFuture copper = new CopperFuture(1,2,3);
        copper.loadPricesFromFile("CopperData.txt");
        List<Double> prices2 = copper.getPrices();
        CoffeeFuture coffee = new CoffeeFuture(1,2,3);
        coffee.loadPricesFromFile("CoffeeData.txt");
        List<Double> prices3 = coffee.getPrices();
        MonteCarloVolatility volatility = new MonteCarloVolatility();
        System.out.println("Gold volatility: "+volatility.computeVolatility(prices));
        System.out.println("Copper volatility: "+volatility.computeVolatility(prices2));
        System.out.println("Coffee volatility: "+volatility.computeVolatility(prices3));
        
    }
}
