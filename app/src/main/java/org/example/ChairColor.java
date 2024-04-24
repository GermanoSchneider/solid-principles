package org.example;

import java.awt.Color;

record ChairColor(Color... colors) {

  boolean hasMoreThanOneColor() {

    return colors.length > 1;
  }
}
