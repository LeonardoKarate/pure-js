package com.leonardo.purejs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

  private Connection conexao;
  String url = "jdbc:mysql://localhost:3306/purejs";

  public Connection conectar() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection result = DriverManager.getConnection(url, "root", "1234");
      conexao = result;
      return result;
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
      return null;
    }
  }

  public void setConexao(Connection conexao) {
    this.conexao = conexao;
  }

  public Connection getConexao() {
    return this.conexao;
  }

}
