/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

/**
 *
 * 
 */
public class ListaCandidaturas {
    private ListaCandidaturas listaCandidaturas;
    private Candidatura candidatura;
    
    public static Candidatura novaCandidatura(int valorPretendido, int NumeroDias, String textoApresentacao){
        return new Candidatura( valorPretendido,  NumeroDias, textoApresentacao);
    }
    public boolean RegistaCandidatura (Candidatura candidatura){
        if(this.validaCandidatura(candidatura)){
            int valorPretendido=candidatura.getValorPretendido();
            int numeroDias=candidatura.getNumeroDias();
            String textoApresentacao=candidatura.getTextoApresentacao();
        }
        return false;
        
    } public boolean validaCandidatura(Candidatura candidatura){
      
      // inserir codigo validacao aqui
      return true;
    }
}