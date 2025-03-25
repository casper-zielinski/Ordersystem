package at.fhj.msd.Order;

public class Customer {
      private String name;
      private String address;
      private String country;

      public Customer(String name, String address, String country)
      {
            this.name = name;
            this.address = address;
            this.country = country;
      }

      public String getName()
      {
            return this.name;
      }

      public String getAddress()
      {
            return this.address;
      }

      public String getCountry()
      {
            return this.country;
      }

}