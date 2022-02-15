/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;


public class TipoRegimento {
    private String designacao;
    private String descricaoRegras;
    
    public TipoRegimento(String designacao, String descricaoRegras){
        designacao=this.designacao;
        descricaoRegras=this.descricaoRegras;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getDescricaoRegras() {
        return descricaoRegras;
    }

    public void setDescricaoRegras(String descricaoRegras) {
        this.descricaoRegras = descricaoRegras;
    }
}
