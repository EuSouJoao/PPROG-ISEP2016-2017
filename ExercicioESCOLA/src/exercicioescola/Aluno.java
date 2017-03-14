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
public class Aluno extends Membro{
        
    private int numero;
    
    private static final int NUMERO_POR_OMISSAO = 000000000;
    
    public Aluno(String nome, int numero){
        super(nome);
        this.numero = numero;
    }
    
    public Aluno(){
        super();
        numero = NUMERO_POR_OMISSAO;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    @Override
    public String toString(){
     return String.format("O aluno tem o número %d.", numero);   
    }
    
}
