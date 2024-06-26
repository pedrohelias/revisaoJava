public class Product {

    String itemCode;
    String description;
    Double value;
    String productCategory;
    
    public Product(String itemCode, String description, Double value, String productCategory){
        this.itemCode = itemCode;
        this.description = description;
        this.value = value;
        this.productCategory = productCategory;

    }

    public void show() {
        System.out.println( description + " ,no valor de ='" + value + '\'' );
     
    }

    
}
