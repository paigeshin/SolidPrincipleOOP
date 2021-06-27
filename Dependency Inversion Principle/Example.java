/************* 

Before refactoring

*************/ 


// High Level Module 
public class ProductCatalog {

    public void listAllProducts() {
        SQLProductRepository sqlProductRepository = new SQLProductRepository();
        SQLProductRepository();

        /*** Violation of Dependency Inversion Principle, High Level Module depends on Low Level Module ***/
        List<String> allProductNames = sqlProductRepository.getAllProductNames();
        sqlProductRepository.getAllProductNames();

        //Display Product Names
    }

}

// Low Level Module 
public class SQLProductRepository {

    public List<String> getAllProductNames() {
        return Arrays.asList("Soap", "toothpaste");
    }

}

/************* 

After refactoring

*************/ 

// High Level Module 
public class ProductCatalog {

    public void listAllProducts() {
        
        ProductRepository ProductRepository = ProductFactory.create();

        List<String> allProductNames = ProductRepository.getAllProductNames();
        //Display Product Names
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

// Low Level Module 
public class SQLProductRepository implements ProductRepository {

    public List<String> getAllProductNames() {
        return Arrays.asList("soap", "toothpaste");
    }

}