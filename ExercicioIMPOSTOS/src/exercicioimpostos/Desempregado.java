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
public class Desempregado extends Contribuinte {

    private int mesesDeParagem;
    private static int taxaOR = 2;

    private static final int MESES_PARAGEM_POR_OMISSAO = 0;

    public Desempregado(String nome, String email, float outrosRendimentos, int mesesDeParagem) {
        super(nome, email, outrosRendimentos);
        this.mesesDeParagem = mesesDeParagem;
    }

    public Desempregado() {
        super();
        mesesDeParagem = MESES_PARAGEM_POR_OMISSAO;
    }
    
    public static int getTaxaOR(){
        return taxaOR;
    }
    
    public void setTaxaOR(int taxaOR){
        this.taxaOR = taxaOR;
    }
    
    @Override
    public String toString(){
        return String.format("Sobre os rendimentos do Desempregado aplica-se uma taxa de %d %%.", taxaOR);
    }
    
    @Override
    public float calculoImposto() {
        return getOutrosRendimentos() * (taxaOR / 100);
    }
    
    @Override
    public boolean equals(Object obj){
        if (!super.equals(obj)){
            return false;
        }
        Desempregado ola = (Desempregado) obj;
        if (this.mesesDeParagem != ola.mesesDeParagem) {
            return false;
        }
        return true;
        
    }

}
