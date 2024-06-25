public class Client {

    String name;
    String region;
    Boolean isCapital; //se for true, é capital. caso contrário, é interior
    Boolean isSpecial;
    Double lastMonthTrades;
    String creditCard;

    public Client(String name, String region, Boolean isCapital,  Double lastMonthTrades, String creditCard){
        this.name = name;
        this.region = region;
        this.isCapital = isCapital;
        this.lastMonthTrades = lastMonthTrades;
        this.creditCard = creditCard;
    }


    void setIsSpecial(Boolean isSpecial){
        this.isSpecial = isSpecial;
    }


    void verifySpecial(double[] cart){
        double totalValue = 0;

        for (int i = 0; i < cart.length; i++){
            totalValue = cart[i] + totalValue;
        }
        
        System.err.println(totalValue);

        if(totalValue > 100){
            setIsSpecial(true);
        }else{
            setIsSpecial(false);
        }
    }

}  
