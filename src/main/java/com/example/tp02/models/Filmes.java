package com.example.tp02.models;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="filmes")
public class Filmes implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_filme;
    @NotNull
    private String titulo;
    @NotNull
    private long ano_lancamento;
    @Value("${my.int.config: #{0}}")
    private long qtd_gostei;
    @Value("${my.int.config: #{0}}")
    private long qtd_nao_gostei;
    @Value("${my.int.config: #{0}}")
    private String capa_filme;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Genero> genero = new ArrayList<>();;

    public long getId_filme() {
        long id_filme = this.id_filme;
        return id_filme;
    }

    public void setId_filme(long id_filme) {
        this.id_filme = id_filme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(long ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public long getQtd_gostei() {
        return qtd_gostei;
    }

    public void setQtd_gostei(long qtd_gostei) {
        this.qtd_gostei = qtd_gostei;
    }

    public long getQtd_nao_gostei() {
        return qtd_nao_gostei;
    }

    public void setQtd_nao_gostei(long qtd_nao_gostei) {
        this.qtd_nao_gostei = qtd_nao_gostei;
    }

    public List<Genero> getGenero() {
        return genero;
    }

    public void setGenero(List<Genero> genero) {
        this.genero = genero;
    }

    public String getCapa_filme() {
        return capa_filme;
    }

    public void setCapa_filme(String capa_filme) {
        this.capa_filme = capa_filme;
    }
}
