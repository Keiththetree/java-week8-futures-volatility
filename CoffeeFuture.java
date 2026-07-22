public class CoffeeFuture extends FutureContract
{
    public CoffeeFuture(double underlyingPrice, double optionPrice, double timeToExpiration){
        super("Coffee",underlyingPrice,optionPrice,timeToExpiration);
    }
    public CoffeeFuture(CoffeeFuture object){
        super(object);
    }
    public double computeImpliedVolatility(){
        System.out.println("Implied Volatility from Coffee Future");
        return 0.0;
    }
}