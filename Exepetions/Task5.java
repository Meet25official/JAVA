// 5. E-Commerce Platform: Product Out of Stock Exception

// Problem Statement:
// In an e-commerce platform, handle cases where a product is out of stock. Create a custom exception `ProductOutOfStockException` to represent this situation.

class ProductOutOfStockException extends Exception{
        public ProductOutOfStockException(String messege){
            super(messege);
        }
}

class Ecommerce{
    private String name;
    private int quntity;

    public Ecommerce(String name , int quntity){
        this.name = name;
        this.quntity = quntity;
    }

    public void count() throws ProductOutOfStockException{
        if (quntity <= 20){
            System.out.println("This product is available for your quntity name of this product is :- "+name);
        }
        else{
            throw new ProductOutOfStockException("This product is not available for your stock.");
        }
    }
}
public class Task5 {
    public static void main(String[] args) {
        Ecommerce obj = new Ecommerce("Washing Machine", 25);
        try{
            obj.count();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}