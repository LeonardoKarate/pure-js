package com.leonardo.purejs.entity;

public class Pessoa {

  private Integer id;
  private String nome;
  private String proficao;
  private String email;
  private String telefone;

  public Pessoa() {

  }

  public Pessoa(String nome, String proficao, String email, String telefone) {
    this.nome = nome;
    this.proficao = proficao;
    this.email = email;
    this.telefone = telefone;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getProficao() {
    return proficao;
  }

  public void setProficao(String proficao) {
    this.proficao = proficao;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getId() {
    return id;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public void setId(int id) {
    this.id = id;
  }

}
