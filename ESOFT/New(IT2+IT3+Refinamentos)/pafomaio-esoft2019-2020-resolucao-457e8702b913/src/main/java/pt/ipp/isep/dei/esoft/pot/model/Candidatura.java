/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;


public class Candidatura {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    private int valorPretendido;
    private int NumeroDias;
    private String textoApresentacao;
    private String TEXTO_POR_OMISSAO=null;
    public Candidatura(int valorPretendido, int NumeroDias, String textoApresentacao){
        this.NumeroDias=NumeroDias;
        this.textoApresentacao=textoApresentacao;
        this.valorPretendido=valorPretendido;
        
    }
     public Candidatura(int valorPretendido, int NumeroDias){
         this.NumeroDias=NumeroDias;
         this.valorPretendido=valorPretendido;
         this.textoApresentacao=TEXTO_POR_OMISSAO;
                
     }

    public int getValorPretendido() {
        return valorPretendido;
    }

    public void setValorPretendido(int valorPretendido) {
        this.valorPretendido = valorPretendido;
    }

    public int getNumeroDias() {
        return NumeroDias;
    }

    public void setNumeroDias(int NumeroDias) {
        this.NumeroDias = NumeroDias;
    }

    public String getTextoApresentacao() {
        return textoApresentacao;
    }

    public void setTextoApresentacao(String textoApresentacao) {
        this.textoApresentacao = textoApresentacao;
    }
}



