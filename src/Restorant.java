import java.util.ArrayList;
import java.util.List;

public class Restorant {
    String name;
    double rating;
    int tableCount;
    List<Table> tables = new ArrayList<>();

    public Restorant(String name, double rating){
        this.name = name;
        this.rating = rating;
    }

    public void AddTable(Table table) {
        tables.add(table);
    }

    public void ShowTables(){
        System.out.println(name+ " tables: ");
        for (Table table : tables) {
            System.out.println(table.id + " Kohtade arv: " + table.seats);
        }
    }
}
