import java.util.LinkedList;
import java.util.Queue;

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class BankQueueSimulation {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();

        // Customers arrive and join the queue
        queue.offer(new Customer("Mourya"));
        queue.offer(new Customer("Arindom"));
        queue.offer(new Customer("Diya"));
        queue.offer(new Customer("Sopno"));
        queue.offer(new Customer("Tusher"));

        System.out.println("Initial queue of customers: " + queue);

        // Serve customers in the order they arrived
        while (!queue.isEmpty()) {
            Customer currentCustomer = queue.poll();
            System.out.println("Serving customer: " + currentCustomer);
        }

        System.out.println("All customers served. Queue is now empty.");
    }
}
