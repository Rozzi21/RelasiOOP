public class dependencies {
    
    public void changeProductPrice(String price,  Product product){
        product.changePrice(price);
    }
}

class Product {
    private String id;
    private String name;
    private String price;

    public Product(String id, String name, String price){
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public void changePrice(String value){
        this.price = value;
    }

}