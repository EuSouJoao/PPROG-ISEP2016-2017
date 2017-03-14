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
public class Docente extends Membro implements Pagavel{
    
    private float vencimento;
    private String categoria;
    private static int[] majoracao = {0, 20, 50};
    
    private static final float VENCIMENTO_POR_OMISSAO = 0;
    private static final String CATEGORIA_POR_OMISSAO = "Assistente";
    
    public Docente(String nome, float vencimento, String categoria){
        super(nome);
        this.categoria = categoria;
        this.vencimento = vencimento;
    }
    
    public Docente(){
        super();
        categoria = CATEGORIA_POR_OMISSAO;
        vencimento = VENCIMENTO_POR_OMISSAO;
    }
    
    public void setVencimento(float vencimento){
        this.vencimento = vencimento;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public float getVencimento(){
        return vencimento;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    @Override
    public String toString(){
        return String.format("O Docente tem funções de %s com um vencimento de %f€.", categoria, vencimento);
    }

    @Override
    public float calculoPagamento() {
        switch (categoria){
            case "Assistente":
                return vencimento + (vencimento * majoracao[0]);
            case "Adjunto":
                return vencimento + (vencimento * majoracao[1]);
            case "Coordenador":
                return vencimento + (vencimento * majoracao[2]); 
        }
    return -1;
    }
    
}
