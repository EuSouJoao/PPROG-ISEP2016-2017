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
public class TCOutrem extends ContribuinteDuplaTaxa {

    private String nomeEmpregador;
    private static int taxaOR = 2;
    private static int taxaRT;

    private static final int LIMIAR_RT = 30000;

    private static final String NOMEEMPREGADOR_POR_OMISSAO = "VAZIO";

    public TCOutrem(String nome, String email, float outrosRendimentos, int rendimentoTrabalho, String nomeEmpregador) {
        super(nome, email, outrosRendimentos, rendimentoTrabalho);
        this.nomeEmpregador = nomeEmpregador;
        taxaRT = calcularTaxaRT();
    }

    public TCOutrem() {
        super();
        nomeEmpregador = NOMEEMPREGADOR_POR_OMISSAO;
        taxaRT = calcularTaxaRT();

    }

    public static int getTaxaOR() {
        return taxaOR;
    }

    public void setTaxaOR(int taxaOR) {
        this.taxaOR = taxaOR;
    }
    
    public static int getTaxaRT() {
        return taxaRT;
    }
    
    public void setTaxaRT(int taxaOR) {
        this.taxaRT = taxaRT;
    }

    public int calcularTaxaRT() {
        return (getRendimentoTrabalho() <= LIMIAR_RT) ? 1 : 2;
    }

}
