/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igorm
 */
import java.util.Date;

public class Morador {
    private String nome;
    private String email;
    private Date nasc;
    private String telefone;
    private String senha;
    private Notificacao[] notificacoes;

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getNasc() { return nasc; }
    public void setNasc(Date nasc) { this.nasc = nasc; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    
    public void adicionarNotificacao(Notificacao notificacao) {
        // Implementar a lógica de adicionar notificação
    }
}
