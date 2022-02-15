/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;



    
import java.util.ArrayList;
import java.util.List;


public class Tarefa {

    
    private String reg;
    private int perPI;
    private int perPF;
    private int perCI;
    private int perCF;
    private int perSI;
    private int perSF;
    private List<Tarefa> rt = new ArrayList<>();

    public Tarefa(String reg, int perPI, int perPF, int perCI, int perCF, int perSI, int perSF) {
        
        this.reg = reg;
        this.perPI = perPI;
        this.perPF = perPF;
        this.perCI = perCI;
        this.perCF = perCF;
        this.perSI = perSI;
        this.perSF = perSF;
    }

    public Tarefa() {
    }



    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public int getPerPI() {
        return perPI;
    }

    public void setPerPI(int perPI) {
        this.perPI = perPI;
    }

    public int getPerPF() {
        return perPF;
    }

    public void setPerPF(int perPF) {
        this.perPF = perPF;
    }

    public int getPerCI() {
        return perCI;
    }

    public void setPerCI(int perCI) {
        this.perCI = perCI;
    }

    public int getPerCF() {
        return perCF;
    }

    public void setPerCF(int perCF) {
        this.perCF = perCF;
    }

    public int getPerSI() {
        return perSI;
    }

    public void setPerSI(int perSI) {
        this.perSI = perSI;
    }

    public int getPerSF() {
        return perSF;
    }

    public void setPerSF(int perSF) {
        this.perSF = perSF;
    }

    public List<Tarefa> getListaReg() {
        return rt;
    }

    public void setRt(List<Tarefa> rt) {
        this.rt = rt;
    }
    
    

}


