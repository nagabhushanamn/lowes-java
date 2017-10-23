package com.level2.fp4j6.timing;

import org.apache.log4j.Logger;

import com.google.common.base.Function;

public class LoggerFunctions {

  public static Function<String, Void> info(final Logger logger) {
    return new Function<String, Void>() {
      @Override
      public Void apply(String s) {
        logger.info(s);
        return null;
      }
    };
  }
}
