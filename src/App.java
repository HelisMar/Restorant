
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        //Lisan tooted mida osta
        List<Product> products = new ArrayList<>();
        products.add(new Product(MenuItem.Pizza, 20.00));
        products.add(new Product(MenuItem.Burger, 15.00));
        products.add(new Product(MenuItem.Salad, 20.00));
        products.add(new Product(MenuItem.Cake, 10.00));
        products.add(new Product(MenuItem.Icecream, 8.00));
        products.add(new Product(MenuItem.SoftDrink, 5.00));
        products.add(new Product(MenuItem.Alcohol, 7.50));   
        products.add(new Product(MenuItem.Coctail, 10.00));   


        //Lisan mõne restorani
        List<Restorant> restorants = new LinkedList<>();
        restorants.add(new Restorant("Pärnu", 5));
        restorants.add(new Restorant("Tartu", 4.5));
        restorants.add(new Restorant("Tallinn", 4));


        //Genereerin igale restoranile 5-10 lauda, kus igal laual on 1-6 istet
        for(Restorant restorant: restorants) {
            int tableCount = rand.nextInt(5,11);
            for (int i = 1; i <= tableCount; i++) { // 5 - 10 korda seda tsüklit
                int seatCount = rand.nextInt(1, 7);
                restorant.AddTable(new Table(i, seatCount)); // i==ID
          }
        }

        for (Restorant restorant : restorants) {
            restorant.ShowTables();
        }
    }
}
