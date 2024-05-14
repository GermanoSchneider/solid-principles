package com.example.open_closed;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

class App {

  public static void main(String[] args) {

    // The class product is closed to modification and open to extension
    // we just need to inherit our abstract class and config our new product.

    Product smartphone = new Electronic("smartphone", new BigDecimal(1000));
    Product wheel = new Automotive("wheel", new BigDecimal(100));
    Product fork = new Kitchen("fork", new BigDecimal(5));

    Collection<Product> products = List.of(smartphone, wheel, fork);

    products.forEach(product -> System.out.println(product.getName() + ": $ " + product.getValue()));
  }
}
