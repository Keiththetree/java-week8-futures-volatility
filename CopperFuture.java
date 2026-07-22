public class CopperFuture extends FutureContract
{
    public CopperFuture(double underlyingPrice, double optionPrice, double timeToExpiration){
        super("Copper",underlyingPrice,optionPrice,timeToExpiration);
    }
    public CopperFuture(CopperFuture object){
        super(object);
    }
    public double computeImpliedVolatility(){
        System.out.println("Implied Volatility from Copper Future");
        return 0.0;
    }
}