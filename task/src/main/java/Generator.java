import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Generator {

    public Restaurant[] generator(int number) {

        Restaurant[] restaurants = new Restaurant[number];
        Random random = new Random();

        for (long i = 0; i < number; i++) {

            Map<Integer, Table> tables = new HashMap<>();
            Map<Integer, Waiter> waiters = new HashMap<>();
            Map<Integer, Product> products = new HashMap<>();
            Map<Long, Order> orders = new HashMap<>();

            for (int j = 0; j < random.nextInt(8 - 3 + 1) + 3; j++) {
                tables.put(j, new Table((random.nextInt(6 - 2 + 1) + 2), random.nextBoolean()));
            }

            for (int j = 0; j < tables.size() - 2; j++) {
                waiters.put(j, new Waiter((random.nextInt(80 + 1)), (1.0 + (5.0 - 1.0) * random.nextDouble())));
            }

            for (int j = 0; j < random.nextInt(20 - 8 + 1) + 8; j++) {
                products.put(j, new Product((random.nextInt(50 - 20 + 1) + 20), random.nextBoolean()));
            }

            for (int j = 0; j < random.nextInt(10) + 1; j++) {

                int sum = 0;

                for (int e = 0; e < (random.nextInt(10) + 1); e++) {
                    int key = random.nextInt(products.size() - 1 + 1);
                    sum = sum + products.get(key).getCost();
                }

                orders.put((long) j, new Order(sum, (random.nextInt(tables.size())),
                        (random.nextInt(waiters.size())), random.nextLong(1_000 + 1)));
            }
            restaurants[(int) i] = new Restaurant(waiters, products, tables, orders);
        }

        return restaurants;
    }
}