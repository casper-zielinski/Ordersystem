package at.fhj.msd;

import at.fhj.msd.Order.Customer;
import at.fhj.msd.Order.Order;
import at.fhj.msd.Order.OrderItem;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        OrderItem[] oi = new OrderItem[2];
        oi[0] = new OrderItem("1", 2, 2);
        oi[1] = new OrderItem("2", 2, 2);
        Customer c = new Customer("Casper", "Weinzöttlerstraße", "Austria");
        Order o = new Order(c, oi);
        Order j = new Order(c, oi);
        System.out.println(o.getTotalprice());
        System.out.println(o.getCustomer());
        System.out.println(o.getOrderItems());

        
    }
}
