
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> products = new ArrayList<>();
        products.add(new Product(MenuItem.Pizza, 20.00));
        products.add(new Product(MenuItem.Burger, 15.00));
        products.add(new Product(MenuItem.Salad, 20.00));
        products.add(new Product(MenuItem.Cake, 10.00));
        products.add(new Product(MenuItem.Icecream, 8.00));
        products.add(new Product(MenuItem.SoftDrink, 5.00));
        products.add(new Product(MenuItem.Alcohol, 7.50));   
        products.add(new Product(MenuItem.Coctail, 10.00));   
    }
}
