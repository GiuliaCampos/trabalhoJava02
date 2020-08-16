package com.example.tp02.models;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import com.example.tp02.models.Filmes;

@Entity
@Table(name="comentarios")
public class Comentarios implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_comentario;
    private String comentario;

    private Date data_criacao = new Date();

    private Date data_atualizado = new Date();
    @ManyToOne
    private Filmes filme;

    @NotNull
    @NotBlank
    private String nome_quem_comentou;

    public long getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(long id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public Date getData_atualizado() {
        return data_atualizado;
    }

    public void setData_atualizado(Date data_atualizado) {
        this.data_atualizado = data_atualizado;
    }

    public Filmes getFilme() {
        return filme;
    }

    public void setFilme(Filmes filme) {
        this.filme = filme;
    }

    public String getNome_quem_comentou() {
        return nome_quem_comentou;
    }

    public void setNome_quem_comentou(String nome_quem_comentou) {
        this.nome_quem_comentou = nome_quem_comentou;
    }
}
