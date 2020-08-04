package com.example.tp02.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
@Entity
@Table(name="Filme")
public class Filme{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id_filme;
  @NotBlank 
  private String nome_filme;
  
  @NotNull
  private Long ano_lancamento;
  @NotBlank
  private String capa_filme;
  @NotNull
  private Long qtd_gostei;
  @NotNull
  private Long qtd_nao_gostei;

  public Long getId_filme() {
    return id_filme;
  }

  public void setId_filme(Long id_filme) {
    this.id_filme = id_filme;
  }

  public String getNome_filme() {
    return nome_filme;
  }

  public void setNome_filme(String nome_filme) {
    this.nome_filme = nome_filme;
  }

  public Long getAno_lacamento() {
    return ano_lancamento;
  }

  public void setAno_lacamento(Long ano_lacamento) {
    this.ano_lancamento = ano_lacamento;
  }

  public String getCapa_filme() {
    return capa_filme;
  }

  public void setCapa_filme(String capa_filme) {
    this.capa_filme = capa_filme;
  }

  public Long getQtd_gostei() {
    return qtd_gostei;
  }

  public void setQtd_gostei() {
    this.qtd_gostei += 1;
  }

  public Long getQtd_nao_gostei() {
    return qtd_nao_gostei;
  }

  public void setQtd_nao_gostei() {
    this.qtd_nao_gostei += 1;
  }

}