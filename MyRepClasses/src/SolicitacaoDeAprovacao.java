/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igorm
 */
public class SolicitacaoDeAprovacao {
    private String texto;

    public SolicitacaoDeAprovacao(Morador morador) {
        this.texto = morador.getNome() + 
                "está solicitando entrar para a República";
    }
    
    // Getters e Setters
    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }
}

