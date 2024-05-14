package com.example.open_closed.bad_implementation;

import static com.example.open_closed.bad_implementation.Product.Category.AUTOMOTIVE;
import static com.example.open_closed.bad_implementation.Product.Category.ELECTRONICS;
import static com.example.open_closed.bad_implementation.Product.Category.KITCHEN;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

class App {

  public static void main(String[] args) {

    // The class product is open to modification, for each new product
    // we need to modify the same class/method.

    Product smartphone = new Product(
        "smartphone",
        new BigDecimal(1000),
        ELECTRONICS
    );

    Product wheel = new Product(
        "wheel",
        new BigDecimal(100),
        AUTOMOTIVE
    );

    Product fork = new Product(
        "fork",
        new BigDecimal(5),
        KITCHEN
    );

    Collection<Product> products = List.of(smartphone, wheel, fork);

    products.forEach(product -> System.out.println(product + ": $ " + product.getValue()));
  }
}
