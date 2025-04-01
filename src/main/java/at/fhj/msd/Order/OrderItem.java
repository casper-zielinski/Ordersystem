package at.fhj.msd.Order;

public class OrderItem {
      private String articleNumber;
      private int quantity;
      private int price;

      public OrderItem(String articleNr, int quantity, int price)
      {
            this.articleNumber = articleNr;
            this.quantity = quantity;
            this.price = price;
      }

      public int getTotal()
      {
            return this.quantity * this.price;
      }
      
      public String getArticleNumber()
      {
            return this.articleNumber;
      }

      public int getQuantitiy()
      {
            return this.quantity;
      }

      public int getPrice()
      {
            return this.price;
      }

}
