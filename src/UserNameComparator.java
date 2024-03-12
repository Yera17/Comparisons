import java.util.Comparator;

public class UserNameComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return ((int) o1.user.name.charAt(0)) - ((int) o2.user.name.charAt(0));
    }
}
