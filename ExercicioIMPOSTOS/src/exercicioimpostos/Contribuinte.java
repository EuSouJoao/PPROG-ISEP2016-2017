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
public abstract class Contribuinte {
    
   private String nome, email;
   private float outrosRendimentos;
   
   private static final String NOME_POR_OMISSAO = "NONAME";
   private static final String EMAIL_POR_OMISSAO = "NOEMAIL";
   private static final float OR_POR_OMISSAO = 0;
   
   public Contribuinte(String nome, String email, float outrosRendimentos){
       this.email = email;
       this.nome = nome;
       this.outrosRendimentos = outrosRendimentos;
   }
   
   public Contribuinte(){
       email = EMAIL_POR_OMISSAO;
       nome = NOME_POR_OMISSAO;
       outrosRendimentos = OR_POR_OMISSAO;
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   
   public void setEmail(String email){
       this.email = email;
   }
   
   public void setOutrosRendimentos(float outrosRendimentos){
       this.outrosRendimentos = outrosRendimentos;
   }
   
   public String getNome(){
       return nome;
   }
   
   public String getEmail(){
       return email;
   }
   
   public float getOutrosRendimentos(){
       return outrosRendimentos;
   }
   
   @Override
   public String toString() {
       return String.format("O contribuinte %s com o e-mail %s tem Outros Rendimento na ordem de %f €", nome, email, outrosRendimentos);
   }
   
   public abstract float calculoImposto();
   
}
