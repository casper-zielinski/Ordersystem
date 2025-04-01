package at.fhj.msd;


import java.util.ArrayList;
import java.util.Scanner;

import at.fhj.msd.Order.Customer;
import at.fhj.msd.Order.Order;
import at.fhj.msd.Order.OrderItem;

/**
 * Hello world!
 */
public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        ArrayList<OrderItem> oi = new ArrayList<>();
        oi.add(new OrderItem("1", 2, 2));
        oi.add(new OrderItem("2", 2, 2));
        Customer c = new Customer("Casper", "Weinzöttlerstraße", "Austria");
        Order o = new Order(c, oi);
        


        OUTER:
        while (true) {
            System.out.println("What dou you want? [a]dd, [p]rint or [e]xit");
            String input = scanner.next();
            switch (input) {
                case "e", "E" -> {
                    System.out.println("Alright, have a good day");
                    break OUTER;
                }
                case "p", "P" -> {
                    System.out.println();
                    System.out.printf("Order %d for Customer %s\n", o.getOrderid(), c.getName());
                    System.out.println("-------------------------------------");
                    System.out.println("ArtNr | amout | price | total");
                    for (int i = 0; i < oi.size(); i++)
                    {
                        System.out.printf("%-3s   | %-2d    | %-2d    | %-4d \n", oi.get(i).getArticleNumber(), oi.get(i).getQuantitiy()
                                ,oi.get(i).getPrice(), oi.get(i).getTotal());
                    }
                    System.out.println("-------------------------------------");
                    System.out.printf("total:      %d\n", o.getTotalprice());
                }
                case "a", "A" -> {
                    String articelnr;
                    int amount;
                    int price;
                    System.out.println("articel-number: ");
                    String inputstr = scanner.next();
                    articelnr = inputstr;
                    System.out.println("amount: ");
                    int inputint = scanner.nextInt(); 
                    amount = inputint;
                    System.out.println("price: ");
                    int inputint2 = scanner.nextInt(); 
                    price = inputint2;
                    oi.add(new OrderItem(articelnr, amount, price));
                    System.out.printf("added: %d times  Order with Articel Number: %s to your order, the price for each order equals: %d \n", amount, articelnr, price);
                }
                default -> { 
                    System.out.println("you can only [a]dd or [p]rint, if you want to [e]xit, \n type either 'e' or 'E' ");
                }
            }
        }
        

       

        
    }

    
}
