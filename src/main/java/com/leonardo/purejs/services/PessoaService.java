package com.leonardo.purejs.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.leonardo.purejs.entity.Pessoa;
import com.leonardo.purejs.model.Conexao;

@Service
public class PessoaService {
  List<Pessoa> pessoas = new ArrayList<Pessoa>();

  private Conexao conexao;

  public PessoaService() {
    conexao = new Conexao();
  }

  public List<Pessoa> getAllPessoa() {
    try {
      pessoas.clear();
      String sql = "SELECT * FROM purejs.pessoas";
      PreparedStatement ps = conexao.conectar().prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        String nome = rs.getString("nome");
        String profissao = rs.getString("profissao");
        String email = rs.getString("email");
        String telefone = rs.getString("telefone");
        Pessoa pessoa = new Pessoa(nome, profissao, email, telefone);
        pessoa.setId(rs.getInt(1));
        pessoas.add(pessoa);
      }
      return pessoas;
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }

  public Pessoa createOnePessoa(Pessoa pessoa) {
    try {
      String nome = pessoa.getNome();
      String profissao = pessoa.getProficao();
      String email = pessoa.getEmail();
      String telefone = pessoa.getTelefone();
      Pessoa result = new Pessoa(nome, profissao, email, telefone);
      System.out.println(result.getTelefone());
      String sql = "INSERT INTO pessoas (nome, profissao, email, telefone) VALUES (?, ?, ?, ?)";
      PreparedStatement ps =
          conexao.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
      ps.setString(1, nome);
      ps.setString(2, profissao);
      ps.setString(3, email);
      ps.setString(4, telefone);
      ps.executeUpdate();
      ResultSet res = ps.getGeneratedKeys();
      if (res.first()) {
        result.setId(res.getInt(1));
        pessoas.add(result);
      }
      return result;
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }

  public String deleteOnePessoa(Integer id) {
    try {
      String sql = "DELETE FROM pessoas WHERE ID = ?";
      PreparedStatement ps = conexao.conectar().prepareStatement(sql);
      ps.setInt(1, id);
      ps.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return "";
  }
}
