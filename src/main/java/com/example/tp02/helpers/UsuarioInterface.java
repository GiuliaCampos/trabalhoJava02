package com.example.tp02.helpers;

public class UsuarioInterface {
    private String email = "";
    private String senha = "";
    private String confirmacao_senha = "";

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmacao_senha() {
        return confirmacao_senha;
    }

    public void setConfirmacao_senha(String confirmacao_senha) {
        this.confirmacao_senha = confirmacao_senha;
    }
}
