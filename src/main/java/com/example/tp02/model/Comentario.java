package com.example.tp02.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Entity
@Table(name="Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_comentario;
    @NotBlank
    private String comentario;

    private Date dataAtualizou = new Date();

    private Date dataCadastrou = new Date();
    @NotNull
    private Long id_filme;

    public Long getId_filme() {
        return id_filme;
    }

    public void setId_filme(Long id_filme) {
        this.id_filme = id_filme;
    }

    public Long getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(Long id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getDataAtualizou() {
        return dataAtualizou;
    }

    public void setDataAtualizou(Date dataAtualizou) {
        this.dataAtualizou = dataAtualizou;
    }

    public Date getDataCadastrou() {
        return dataCadastrou;
    }

    public void setDataCadastrou(Date dataCadastrou) {
        this.dataCadastrou = dataCadastrou;
    }
}
