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
public class AlunoBolsa extends Aluno implements Pagavel {
    
    private float bolsa;
    
    private static final float BOLSA_POR_OMISSAO = 0;
    
    public AlunoBolsa(String nome, int numero, float bolsa){
        super(nome, numero);
        this.bolsa = bolsa;
    }
    
    public AlunoBolsa(){
        super();
        bolsa = BOLSA_POR_OMISSAO;
    }
    
    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }
    
    public float getBolsa(){
        return bolsa;
    }
    
    @Override
    public String toString(){
        return String.format("O aluno tem direito a bolsa no valor de %f€", bolsa);
    }

    @Override
    public float calculoPagamento() {
        return bolsa;
    }
    
}
