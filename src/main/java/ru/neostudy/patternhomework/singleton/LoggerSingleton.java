package ru.neostudy.patternhomework.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LoggerSingleton {

  private static LoggerSingleton loggerSingleton;

  private LoggerSingleton(){}

  public static LoggerSingleton getInstance() {
    if (loggerSingleton == null) {
      loggerSingleton = new LoggerSingleton();
    }
    return loggerSingleton;
  }

  public void classLog(Object obj, String info)
  {
    System.out.println("Log Info: "
        + LocalDate.now()
        .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
    + " - " + obj.getClass().getSimpleName() + " - " + info);
  }
}
