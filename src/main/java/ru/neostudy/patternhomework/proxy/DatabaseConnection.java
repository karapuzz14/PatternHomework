package ru.neostudy.patternhomework.proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import lombok.Getter;


public class DatabaseConnection {

  @Getter
  private String name;

  public DatabaseConnection(String name) {
    this.name = name;
  }

  public void connect(String url) throws SQLException {
    Connection connection  = DriverManager.getConnection(
        url,
        "postgres", "password");
    System.out.println("Подключено: " + url);
    System.out.println("Объект Connection: " + connection.toString());
  }
}
