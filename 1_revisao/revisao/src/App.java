import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Client client1 = new Client("Pedro", "Brasília", true, 100.00, "123545789");
        //System.out.println(client1.name + " " +client1.region);
        //client1.verifySpecial(2);
        //System.err.println(client1.isSpecial);
        Product produto1 = new Product("0", "obra", 23.99, "categoria:obra" );
        Product produto3 = new Product("1", "alimento", 9.99, "categoria:obra" );
        Product produto4 = new Product("2", "limpeza", 1.99, "categoria:obra" );
        
        double[] cart = {produto1.value, produto3.value, produto4.value * 100}; 
        client1.verifySpecial(cart);
        System.err.println(client1.isSpecial);

        ArrayList<Client> clientes = new ArrayList<>(); //vetor de objetos
        ArrayList<Product> inventario = new ArrayList<>();
        inventario.add(produto1);
        inventario.add(produto3);
        inventario.add(produto4);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Você gostaria de: \n1 - Cadastrar um usuário\n2 - Realizar uma venda\n0 - Sair");
        int selection = myObj.nextInt();  // Read user input
        String nameIn;
        String regionIn;
        Boolean isCapitalIn;
        Double lastMonthTradesIn;
        String creditCardIn;
        int numCliente;
        int numProduto;



        while(selection != 0){
            

            
            //System.out.println("Username is: " + userName);  // Output user input
            switch (selection) {
                case 1:
                    System.out.println("Digite o nome do cliente");
                    nameIn = myObj.next();
                    System.out.println("Digite a região do cliente");
                    regionIn = myObj.next();
                    System.out.println("Mora na capital?");
                    isCapitalIn = myObj.nextBoolean();
                    myObj.nextLine();
                    System.out.println("Qual foi o faturamento do mẽs anterior?");
                    lastMonthTradesIn = myObj.nextDouble();
                    myObj.nextLine();
                    System.out.println("Digite o cartão de crédito");
                    creditCardIn = myObj.nextLine();

                    


                    Client client = new Client(nameIn,regionIn, isCapitalIn, lastMonthTradesIn, creditCardIn);
                    clientes.add(client);

                    System.out.println("Cadastro Realizado com sucesso!");
                    break;
                case 2:
                    if (clientes.isEmpty()){
                        System.out.println("Não existem clientes. Cadastre um novo cliente!");
                    }else{
                        for(int i = 0; i < clientes.size(); i++){
                            //System.out.println("chegou aqui");
                            System.out.print("cliente" + (i+1) + ": ");
                            clientes.get(i).show();
                        }

                        System.out.println("Digite o numero do cliente que deseja realizar a venda!");

                        numCliente = myObj.nextInt();

                        System.out.println("Selecione um produto do inventario");

                        for(int i = 0; i < inventario.size(); i++){
                            //System.out.println("chegou aqui");
                            System.out.print("produto" + (i+1) + ": ");
                            inventario.get(i).show();
                        }

                        numProduto = myObj.nextInt();

                        clientes.get(numCliente-1).addElement(inventario.get(numProduto-1));

                        int qtd =  clientes.get(numCliente-1).cart.size();

                        for (int j = 0; j < qtd; j++){
                            clientes.get(numCliente-1).cart.get(j).show();
                        }

                        //System.out.println(clientes.get(numCliente-1).getCart());

                        //System.out.println("realizar venda a usuaŕio...");

                    }
                    break;
                case 3:
                    //show all
                    for(int k = 0; k < clientes.size(); k++ ){
                        System.out.println("--------------------------------------");
                        clientes.get(k).show();
                        int aux = k;
                        System.out.println("AINDA AQUI");
                        for(int l = 0; l <= clientes.get(aux).cart.size(); l++){
                            System.out.println("parou aqui!!!");
                            clientes.get(l).cart.get(l).show();
                        
                        }
                        System.out.println("--------------------------------------");


                    }
                default:
                    //System.exit(0);
                    break;
            }

            System.out.println("Você gostaria de: \n1 - Cadastrar um usuário\n2 - Realizar uma venda\n0 - Sair");
            selection = myObj.nextInt();  // Read user input
            System.out.println("Escolheu: " + selection);

        }

        System.out.println("Saida!");
    
    }

}
