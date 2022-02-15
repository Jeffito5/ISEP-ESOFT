 change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

import java.util.Date;


public class ProcessoSeriacao {
    Date dataRealizacao;
    
     public ProcessoSeriacao(Date dataRealizacao){
        dataRealizacao=this.dataRealizacao;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }
}
