import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public abstract class FutureContract 
{
    //Fields
    private String name;
    private double underlyingPrice;
    private double optionPrice;
    private double timeToExpiration;
    private List<Double> prices;
    
    //Constructors 
    public FutureContract(String n, double UP, double OP, double TTE){
        this.name = n;
        this.underlyingPrice = UP;
        this.optionPrice = OP;
        this.timeToExpiration = TTE;
        prices = new ArrayList<>();
    }
    public FutureContract(FutureContract originalObject){
        this.name = originalObject.name;
        this.underlyingPrice = originalObject.underlyingPrice;
        this.optionPrice = originalObject.optionPrice;
        this.timeToExpiration = originalObject.timeToExpiration;
        prices = new ArrayList<>();
    }
    //methods
    public abstract double computeImpliedVolatility();
    public void displayContract(){
        System.out.println("Name: "+ name);
        System.out.println("UnderlyingPrice: "+ underlyingPrice);
        System.out.println("OptionPrice: "+ optionPrice);
        System.out.println("timeToExpiration: "+ timeToExpiration);
    }
    public void loadPricesFromFile(String filename){
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader(filename));
            String line = inputStream.readLine(); 
            while(line != null){
                prices.add(Double.parseDouble(line));
                line = inputStream.readLine();
            }
            inputStream.close();

        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
            
        catch(IOException e){
            System.out.println("Error");
        }

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setUnderlyingPrice(double underlyingPrice){
        this.underlyingPrice = underlyingPrice;
    }
    public double getUnderlyingPrice(){
        return this.underlyingPrice;
    }
    public void setOptionPrice(double optionPrice){
        this.optionPrice = optionPrice;
    }
    public double getOptionPrice(){
        return this.optionPrice;
    }
    public void setTimeToExpiration(double timeToExpiration){
        this.timeToExpiration = timeToExpiration;
    }
    public double getTimeToExpiration(){
        return this.timeToExpiration;
    }
    public List<Double> getPrices(){
        return this.prices;
    }
    
}