/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igorm
 */
import java.awt.image.BufferedImage;
import java.util.Date;

public class Despesa {
    private BufferedImage comprovante;
    private float valor;
    private Date dataCriacao;

    // Getters e Setters
    public BufferedImage getComprovante() { return comprovante; }
    public void setComprovante(BufferedImage comprovante) { this.comprovante = comprovante; }

    public float getValor() { return valor; }
    public void setValor(float valor) { this.valor = valor; }

    public Date getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(Date dataCriacao) { this.dataCriacao = dataCriacao; }
}
