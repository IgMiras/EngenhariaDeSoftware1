/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igorm
 */
import java.util.Date;

public class Tarefa {
    private String titulo;
    private Date prazo;
    private int prioridade;
    private String tipo;
    private boolean status;
    private Date dataCriacao;
    private Morador[] moradores;
    
    // Getters e Setters
    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void adicionarMorador(Morador morador) {
        // Implementar a lógica de adicionar morador
    }

    public void notificarMoradores(Notificacao notificacao) {
        // Implementar a lógica de notificar morador
    }
    
    public Morador[] buscarMoradoresNaoParticipantes(){
        // Implementar a lógica
    }
}

