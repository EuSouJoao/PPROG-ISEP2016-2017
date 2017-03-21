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
public class ContribuinteDuplaTaxa extends Contribuinte {
    private static float rendimentoTrabalho;
    
    public ContribuinteDuplaTaxa(String nome, String email, float outrosRendimentos, int rendimentoTrabalho) {
        super(nome, email, outrosRendimentos);
        this.rendimentoTrabalho = rendimentoTrabalho;
    }

    public ContribuinteDuplaTaxa(){
        super();
    }

    public static float getRendimentoTrabalho(){
        return rendimentoTrabalho;
    }
    
    public void setRendimentoTrabalho(float rendimentoTrabalho){
        this.rendimentoTrabalho = rendimentoTrabalho;
    }
    
    @Override
    public String toString(){
        return String.format("O Contribuinte com Taxa Dupla tem Rendimentos de Trabalho na ordem dos %f€", rendimentoTrabalho);
    }
    
    @Override
    public float calculoImposto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean equals(Object obj){
        if (!super.equals(obj)){
            return false;
        }
        ContribuinteDuplaTaxa ola = (ContribuinteDuplaTaxa) obj;
        if (this.rendimentoTrabalho != ola.rendimentoTrabalho) {
            return false;
        }
        return true;
    }
}
