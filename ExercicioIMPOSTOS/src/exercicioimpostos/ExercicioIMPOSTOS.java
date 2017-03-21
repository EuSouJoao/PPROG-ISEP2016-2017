/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioimpostos;

import java.util.ArrayList;

/**
 *
 * @author joaomferreira
 */
public class ExercicioIMPOSTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Contribuinte> contribuintes = new ArrayList<Contribuinte>();
        
        contribuintes.add(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        contribuintes.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        contribuintes.add(new TCOutrem("Ana", "Ovar", 1800, 300, "CMM"));
        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        contribuintes.add(new TCOutrem("Salvio", "Seixal", 8000, 1000, "SSB"));
        contribuintes.add(new TCPropria("Mário", "Guarda", 1500, 300, "Eletricista"));
        contribuintes.add(new Reformado("Aníbal Silva", "Coimbra", 1000, 500));
        contribuintes.add(new TCOutrem("João", "Lisboa", 800, 100, "CML"));
        contribuintes.add(new TCPropria("Carla", "Porto", 15000, 1000, "Advogado"));
        contribuintes.add(new Desempregado("Maria Sá", "Afife", 230, 8));
        
        for (Contribuinte contribuinte : contribuintes) {
            System.out.println(contribuinte.getNome() + " - " + contribuinte.getEmail());
        }
    }
}
