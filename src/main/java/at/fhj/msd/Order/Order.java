package at.fhj.msd.Order;

import java.util.ArrayList;

public class Order {
      private int currentid = 1;
      private int orderid;
      private Object customer;
      private ArrayList<OrderItem> orderItems;

      public Order(Object customer, ArrayList<OrderItem> orderItems)
      {
            this.customer = customer;
            this.orderItems = orderItems;
            orderid = ++currentid;
      }

      public int getTotalprice()
      {
            int tprice = 0;

            for (int i=0; i < orderItems.size(); i++)
            {
              tprice += orderItems.get(i).getTotal();    
            }
            return tprice;
      }

      public Customer getCustomer()
      {
            return (Customer)this.customer;
      }

      public ArrayList<OrderItem> getOrderItems()
      {
            return (ArrayList<OrderItem>)this.orderItems;
      }

    public final int getOrderid() {
        return orderid++;
    }

     



}
