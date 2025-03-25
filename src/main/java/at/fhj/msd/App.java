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
        OrderItem[] oi = new OrderItem[2];
        oi[0] = new OrderItem("1", 2, 2);
        oi[1] = new OrderItem("2", 2, 2);
        Customer c = new Customer("Casper", "Weinzöttlerstraße", "Austria");
        Order o = new Order(c, oi);
        Order j = new Order(c, oi);
        System.out.println(o.getTotalprice());
        System.out.println(o.getCustomer());


while (true) { 
    System.out.println("What dou you want? [a]dd, [p]rint or [e]xit");
        String input = scanner.next();

        if (input.equals("e") ||
            input.equals("E"))
        {
            System.out.println("Alright, have a good day");
            break;
        }
        else if (input.equals("p") ||
                 input.equals("P"))
                 {
                    System.out.printf("Order %d for Customer %s\n", o.getOrderid(), c.getName());
                    System.out.println("ArtNr | amout | price | total");

                    for (int i = 0; i < oi.length; i++)
                    {
                        System.out.printf("%s | %d | %d | %d \n", oi[i].getArticleNumber(), oi[i].getQuantitiy()
                        ,oi[i].getPrice(), oi[i].getTotal());
                    }
                    System.out.println("----------------");
                    System.out.printf("total:      %d\n", o.getTotalprice());
                 }
                 else if (input.equals("a") ||
                 input.equals("A"))
                 {
                    int inputint = scanner.nextInt(); 
                    String articelnr;
                    int amount;
                    int price;

                    System.out.println("articel-number: ");
                    articelnr = input;
                    System.out.println("amount: ");
                    amount = inputint;
                    System.out.println("price: ");
                    price = inputint;
                    




                 }
        
}
        

       

        
    }

    
}
