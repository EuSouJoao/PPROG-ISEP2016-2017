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
public class Reformado extends ContribuinteDuplaTaxa {
    
    private static int taxaRT = 1;
    private static int taxaOR = 3;
    
    public Reformado(String nome, String email, float outrosRendimentos, int rendimentoTrabalho) {
        super(nome, email, outrosRendimentos, rendimentoTrabalho);
    }
    
    public Reformado(){
        super();
    }
    
    @Override
    public String toString(){
        return String.format("Reformado: Taxa Sobre Rendimentos de Trabalho de %d. Taxa Sobre Outros Rendimentos de %d.", taxaRT, taxaOR);
    }
    
}
