import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Order  {
    User user;
    List<Item> items;

    public Order(User user, List<Item> items) {
        this.user = user;
        this.items = items;
    }

    @Override
    public String toString() {
        return "%s %s".formatted(user, items);
    }
}
