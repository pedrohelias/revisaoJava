import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client {

    String name;
    String region;
    Boolean isCapital; //se for true, é capital. caso contrário, é interior
    Boolean isSpecial;
    Double lastMonthTrades;
    String creditCard;
    ArrayList<Product> cart;
    

    public Client(String name, String region, Boolean isCapital,  Double lastMonthTrades, String creditCard){
        this.name = name;
        this.region = region;
        this.isCapital = isCapital;
        this.lastMonthTrades = lastMonthTrades;
        this.creditCard = creditCard;
        cart = new ArrayList<>();
    }

    public void show() {
        System.out.println( "Client{" + "nome='" + name + '\'' + ", regiao='" + region + '\'' +'}' );
        
    }

    public void showArray(int qtd){
        for(int i = 0; i < qtd; i++){
            cart.get(i).show();
        }
    }


    public void addElement(Product element) {
        cart.add(element);
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getRegion(){
        return region;
    }

    public void setRegion(String region){
        this.region = region;
    }

    public Boolean getIsCapital(){
        return isCapital;
    }

    public void setIsCapital(Boolean isCapital){
        this.isCapital = isCapital;
    }

    public Double getLastMonthTrades(){
        return lastMonthTrades;
    }

    public void setLastMonthTrades(Double lastMonthTrades){
        this.lastMonthTrades = lastMonthTrades;
    }

    public String getCreditCard(){
        return creditCard;
    }

    public void setCreditCard(String creditCard){
        this.creditCard = creditCard;
    }

    public Boolean getIsSpecial(){
        return isSpecial;
    }

    public void setIsSpecial(Boolean isSpecial){
        this.isSpecial = isSpecial;
    }


   

    void verifySpecial(double[] cart){
        double totalValue = 0;

        for (int i = 0; i < cart.length; i++){
            totalValue = cart[i] + totalValue;
        }
        
        System.err.println(totalValue);

        if(totalValue > 100){
            System.err.println("É cliente prime");
            setIsSpecial(true);
        }else{
            System.err.println("Não é cliente prime");
            setIsSpecial(false);
        }
    }

}  
