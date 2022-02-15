/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class Anuncio {

    private Tarefa m_oTarefa;
    private String m_strReg;
    private int m_intPerPI;
    private int m_intPerPF;
    private int m_intPerCI;
    private int m_intPerCF;
    private int m_intPerSI;
    private int m_intPerSF;
    ArrayList ListaAnuncios;

    public Anuncio(Tarefa m_oTarefa, String m_strReg, int m_intPerPI, int m_intPerPF, int m_intPerCI, int m_intPerCF, int m_intPerSI, int m_intPerSF) {
        this.m_oTarefa = m_oTarefa;
        this.m_strReg = m_strReg;
        this.m_intPerPI = m_intPerPI;
        this.m_intPerPF = m_intPerPF;
        this.m_intPerCI = m_intPerCI;
        this.m_intPerCF = m_intPerCF;
        this.m_intPerSI = m_intPerSI;
        this.m_intPerSF = m_intPerSF;
    }

    public Tarefa getM_oTarefa() {
        return m_oTarefa;
    }

    public String getM_strReg() {
        return m_strReg;
    }

    public int getM_intPerPI() {
        return m_intPerPI;
    }

    public int getM_intPerPF() {
        return m_intPerPF;
    }

    public int getM_intPerCI() {
        return m_intPerCI;
    }

    public int getM_intPerCF() {
        return m_intPerCF;
    }

    public int getM_intPerSI() {
        return m_intPerSI;
    }

    public int getM_intPerSF() {
        return m_intPerSF;
    }

    public void setM_oTarefa(Tarefa m_oTarefa) {
        this.m_oTarefa = m_oTarefa;
    }

    public void setM_strReg(String m_strReg) {
        this.m_strReg = m_strReg;
    }

    public void setM_intPerPI(int m_intPerPI) {
        this.m_intPerPI = m_intPerPI;
    }

    public void setM_intPerPF(int m_intPerPF) {
        this.m_intPerPF = m_intPerPF;
    }

    public void setM_intPerCI(int m_intPerCI) {
        this.m_intPerCI = m_intPerCI;
    }

    public void setM_intPerCF(int m_intPerCF) {
        this.m_intPerCF = m_intPerCF;
    }

    public void setM_intPerSI(int m_intPerSI) {
        this.m_intPerSI = m_intPerSI;
    }

    public void setM_intPerSF(int m_intPerSF) {
        this.m_intPerSF = m_intPerSF;
    }

    public ArrayList getListaAnuncios() {
        return ListaAnuncios;
    }
}
