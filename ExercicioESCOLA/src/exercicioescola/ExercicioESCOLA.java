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
public class ExercicioESCOLA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Membro[] membros = new Membro[5];
        membros[0] = new Aluno("Francisco Rei", 123456789);
        membros[1] = new AlunoBolsa("João Ratão", 234567891, 1000);
        membros[2] = new Docente("Nuno Morgado", 1500, "Assistente");
        membros[3] = new Docente("Rota Soraia", 2500, "Adjunto");
        membros[4] = new Docente("Conceição Neves", 3000, "Coordenador");
        
        
    }
    
}
