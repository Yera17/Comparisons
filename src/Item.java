import java.util.Objects;

public class Item implements Comparable<Item>{
    String name;
    double price;
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int compareTo(Item o) {
        return (int) (o.price - price);
    }

    @Override
    public String toString() {
        return "%s %s".formatted(name, price);
    }
}
