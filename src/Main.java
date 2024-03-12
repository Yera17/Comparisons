import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user4 = new User("Bartolomeu", 12);
        User user1 = new User("John", 50);
        User user3 = new User("Alexey", 32);
        User user2 = new User("Misha", 28);

        Item item1 = new Item("Gubka", 500);
        Item item2 = new Item("Fairy", 1500);
        Item item3 = new Item("Lozhka", 150);

        Order order1 = new Order(user1, new ArrayList<>(List.of(item1, item2, item3)));
        Order order2 = new Order(user2, new ArrayList<>(List.of( item2, item3)));
        Order order3 = new Order(user3, new ArrayList<>(List.of( item3)));
        Order order4 = new Order(user4, new ArrayList<>(List.of( item1, item2, item3, item2, item3)));

        ItemNumberComparator comparator1 = new ItemNumberComparator();
        UserNameComparator comparator2 = new UserNameComparator();

        List<Order> orders = new ArrayList<>(List.of(order1, order2, order3, order4));
        orders.sort(comparator1);
        System.out.println(orders);
        orders.sort(comparator2);
        System.out.println(orders);

        Collections.sort(order1.items);
        System.out.println(order1.items);
    }
}
