import java.util.List;
import java.util.ArrayList;
public class MonteCarloVolatility implements IVolatilityCalculator
{
    public double computeVolatility(List<Double> prices){
        int size = prices.size();
        double mean = 0;
        List<Double> dailyReturns = new ArrayList<>();
        for(int i = 0; i < size - 1 ; i++){
            dailyReturns.add((prices.get(i+1)-prices.get(i))/prices.get(i));
            mean += (prices.get(i+1)-prices.get(i))/prices.get(i);
        }
        mean = mean/(size-1);
        double squaredDeviation = 0;
        for (int i = 0; i<dailyReturns.size();i++){
            squaredDeviation += Math.pow(dailyReturns.get(i)- mean, 2);
        }

        return Math.sqrt(squaredDeviation/(dailyReturns.size()-1));
    }
    
}