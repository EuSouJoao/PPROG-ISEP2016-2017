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
public class TCPropria extends ContribuinteDuplaTaxa {

    private String profissao;
    private static int taxaOR;
    private static int taxaRT = 3;

    private static final int LIMIAR_OR = 50000;

    private static final String PROFISSAO_POR_OMISSAO = "VAZIO";

    public TCPropria(String nome, String email, float outrosRendimentos, int rendimentoTrabalho, String profissao) {
        super(nome, email, outrosRendimentos, rendimentoTrabalho);
        this.profissao = profissao;
        taxaOR = calcularTaxaOR();
    }

    public TCPropria() {
        super();
        profissao = PROFISSAO_POR_OMISSAO;
        taxaOR = calcularTaxaOR();

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

    public int calcularTaxaOR() {
        return (getOutrosRendimentos() <= LIMIAR_OR) ? 2 : 5;
    }
}
