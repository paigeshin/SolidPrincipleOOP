public class Product {

    protected double discount;

    public double getDiscount() {
        return discount;
    };

}

public class InHouseProduct extends Product {

    public void applyExtraDiscount() {
        discount = discount * 1.5;
    }

}

public class PricingUtils {

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        for(Product product: productList) {
            if(product instanceof InHouseProduct) {
                ((InHouseProduct) product).applyExtraDiscount();
            }
            System.out.println(product.getDiscount());
        }


    }

}