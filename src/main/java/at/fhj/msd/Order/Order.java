package at.fhj.msd.Order;

public class Order {

      private int orderid;
      private Object customer;
      private Object[] orderItems;

      public Order(Object customer, Object[] orderItems)
      {
            this.customer = customer;
            this.orderItems = orderItems;
            orderid = getOrderid();
      }


      public int getTotalprice()
      {
            OrderItem[] obj = (OrderItem[])(orderItems);
            int tprice = 0;

            for (int i=0; i < orderItems.length; i++)
            {
              tprice += obj[i].getTotal();     
            }
            return tprice;

          

      }

      public Customer getCustomer()
      {
            return (Customer)this.customer;
      }

      public OrderItem[] getOrderItems()
      {
            return (OrderItem[])this.orderItems;
      }

    public final int getOrderid() {
        return orderid++;
    }

     



}
