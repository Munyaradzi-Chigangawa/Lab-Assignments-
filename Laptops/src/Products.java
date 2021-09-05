
import java.util.*;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",500));
        productsList.add(new Product(2,"Dell Laptop",300));
        productsList.add(new Product(3,"Lenovo Laptop",280));
        productsList.add(new Product(4,"Sony Laptop",250));
        productsList.add(new Product(5,"Apple Laptop",900));
        // This is more compact approach for filtering data
        productsList.stream()
                .filter(product -> product.price == 900)
                .forEach(product -> System.out.println(product.id + "." + product.name + " "+ product.price));
    }
}