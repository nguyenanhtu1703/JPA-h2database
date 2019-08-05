package com.nguyenanhtu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    logger.info("Hello World");
    logger.debug("Temperature set to {}. Old temperature was {}.", 4, 8);
    logger.info("Temperature has risen above 50 degrees.");
  }
}