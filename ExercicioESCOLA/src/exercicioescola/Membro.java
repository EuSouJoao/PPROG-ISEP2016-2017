/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioescola;

/**
 *
 * @author joaomferreira
 */
public abstract class Membro {
    
    private String nome;
    
    private static final String NOME_POR_OMISSAO = "SemNome";
    
    Membro(String nome){
        this.nome = nome;
    }
    
    Membro(){
        nome = NOME_POR_OMISSAO;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return String.format("O membro da escola tem o nome %s.", nome);
    }
}
