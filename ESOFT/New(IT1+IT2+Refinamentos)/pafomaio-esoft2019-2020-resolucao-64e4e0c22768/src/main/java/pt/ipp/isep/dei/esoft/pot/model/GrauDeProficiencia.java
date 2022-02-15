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
public class GrauDeProficiencia {
    private int valor;
    private String designacao;
    
    public GrauDeProficiencia(int valor, String designacao){
        this.valor=valor;
        this.designacao=designacao;
        
        
    }

    @Override
    public String toString() {
        return "GrauDeProficiencia{" + "valor=" + valor + ", designacao=" + designacao + '}';
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }
    
}

