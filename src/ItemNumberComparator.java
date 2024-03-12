import java.util.Comparator;

public class ItemNumberComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.items.size() - o2.items.size();
    }
}
