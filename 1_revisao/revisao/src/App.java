import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Client client1 = new Client("Pedro", "Brasília", true, 100.00, "123545789");
        //System.out.println(client1.name + " " +client1.region);
        //client1.verifySpecial(2);
        //System.err.println(client1.isSpecial);
        double[] cart = {1.99, 2.00, 50.00, 60.00}; 
        client1.verifySpecial(cart);
        System.err.println(client1.isSpecial);
    }
}
