package ru.neostudy.patternhomework.proxy;

import java.sql.SQLException;
import lombok.Setter;

public class ProxyConnection {

  private final DatabaseConnection databaseConnection;

  public ProxyConnection(String baseUrl, DatabaseConnection connection) {
    this.baseUrl = "jdbc:postgresql://" + baseUrl;
    this.databaseConnection = connection;
  }
  @Setter
  private String baseUrl;
  public void connect() throws SQLException {
    databaseConnection.connect(baseUrl + databaseConnection.getName());
  }
}
