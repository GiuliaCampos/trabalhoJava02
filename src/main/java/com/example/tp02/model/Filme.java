package com.example.tp02.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Filme")
public class Filme{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id_filme;
  @NotBlank 
  private String nome_filme;
  
  @NotNull
  private Long ano_lacamento;
  @NotBlank
  private String capa_filme;
  @NotNull
  private Long qtd_gostei;
  @NotNull
  private Long qtd_nao_gostei;

  public Long getId(){
    return this.id_filme;
  }
  public String getNomeFilme(){
    return this.nome_filme;
  }
  public Long getAnoLancamento(){
    return this.ano_lacamento;
  }

  public String getCapaFilme(){
    return this.capa_filme;
  }

  public Long getQtdGostei(){
    return this.qtd_gostei;
  }
  public Long getQtdNaoGostei(){
    return this.qtd_nao_gostei;
  }

  public void setId(Long id){
    this.id_filme=id;
  }

  public void setAnoLacamento(Long ano_lacamento){
    this.ano_lacamento=ano_lacamento;
  }

  public void setNomeFilme(String nome_filme){
    this.nome_filme=nome_filme;
  }

  public void setCapaFilme(String capa_filme){
    this.capa_filme = capa_filme;
  }

  public void setQtdGostei(){
    this.qtd_gostei += 1;
  }
  public void setQtdNaoGostei(){
    this.qtd_nao_gostei += 1;
  }

}