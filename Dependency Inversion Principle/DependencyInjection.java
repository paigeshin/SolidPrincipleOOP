//High level module 
public class ProductCatalog {
    
    private ProductRepository productRepository;

    public ProductCatalog(ProductRepository productRepository) {
        this.productRepository = productRepository
    }
    
    public void listAllProducts() {
        List<String> listAllProducts = listAllProducts.getAllProductNames();
        //Display Products 
    }
}


public class ProductFactory {

    public static ProductRepository create() {
        return new SQLProductRepository();
    }

}

//Abstraction 
public interface ProductRepository {
    public List<String> getAllProductNames();
}

//Low Level Module 
public class SQLProductRepository implements ProductRepository {

    public List<String> getAllProductNames() {
        return ArrayList.asList("Soap", "Toothpaste")
    }

}

public class Root {

    public static void main(String[] args) {

        ProductRepository productRepository = ProductFactory.create();
        ProductCatalog ProductCatalog = new ProductCatalog(productRepository);
        ProductCatalog.listAllProducts();

    }

}