/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioimpostos;

/**
 *
 * @author joaomferreira
 */
public class TCOutrem extends ContribuinteDuplaTaxa{
    private String nomeEmpregador;
    private static int taxaOR = 2;
    private static int taxaRT;
    
    private static final String NOMEEMPREGADOR_POR_OMISSAO = "VAZIO";
    
    public TCOutrem(String nome, String email, float outrosRendimentos, int rendimentoTrabalho, String nomeEmpregador) {
        super(nome, email, outrosRendimentos, rendimentoTrabalho);
        this.nomeEmpregador = nomeEmpregador;
    }
    
    public TCOutrem(){
        super();
        nomeEmpregador = NOMEEMPREGADOR_POR_OMISSAO;
    }
    
    
}
