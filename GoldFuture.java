public class GoldFuture extends FutureContract
{
    public GoldFuture(double underlyingPrice, double optionPrice, double timeToExpiration){
        super("Gold",underlyingPrice,optionPrice,timeToExpiration);
    }
    public GoldFuture(GoldFuture object){
        super(object);
    }
    public double computeImpliedVolatility(){
        System.out.println("Implied Volatility from Gold Future");
        return 0.0;
    }
}