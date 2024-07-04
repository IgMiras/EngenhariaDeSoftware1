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


public class Republica {
    private String nome;
    private String cidade;
    private BufferedImage icone;
    private Morador[] moradores;
    private Tarefa[] tarefas;
    private Despesa[] despesas;
    private CategoriaDeDespesa[] categoriasDeDespesa;
    
    // Métodos 
    public void vincularComprovanteDeGasto(
        Despesa despesa, BufferedImage comprovante
    ){
        
    }
    
    public Tarefa[] buscarMoradoresNaoParticipantesATarefa(Tarefa tarefa){
    
    }
    
    public void adicionarMoradorSelecionadoATarefa(Morador m, Tarefa t){
    
    }
    
    public void tornarTarefaColetiva(Tarefa t){}
    
    public void atualizarTarefa(Date prazo, int prioridade, Tarefa tarefa){}
    
    public void cadastrarDespesa(
        BufferedImage comprovante, float valor, CategoriaDeDespesa c, Morador m
    ){
    
    }
    
    public void concluirTarefa(Tarefa t){}
    
    public Despesa[] exibirHistoricoDeDespesas(
        int periodo, Morador[] moradores, float valor, CategoriaDeDespesa categoria
    ){
    
    }
    
    public Tarefa[] exibirHistoricoDeTarefas(
        int periodo, Morador[] moradores, int prioridade
    ){
    
    }
    
    public boolean verificarTituloCategoria(String titulo)(){}
    
    public void cadastrarCategoria(String titulo, BufferedImage icone){}
    
    public void cadastrarTarefa(
        Morador[] m, String titulo, int prazo, int prioridade, String tipo
    ){}
    
    public void exibirMoradores(){}
    
    public void notificarMoradores(Tarefa tarefa, Notificacao notificacao){}
    
    public void buscarTarefasParaHoje(){}
    
    public void removerMorador(Morador m){}
    
    public void solicitarAprovacao(SolicitacaoDeAprovacao solicitacao){}
    
    public void adicionarMorador(Morador morador){}
}
    
