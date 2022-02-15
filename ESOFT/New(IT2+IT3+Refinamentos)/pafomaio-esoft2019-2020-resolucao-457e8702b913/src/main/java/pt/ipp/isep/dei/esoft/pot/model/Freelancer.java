/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;


    
import java.util.ArrayList;
import java.util.List;


public class Freelancer {
    private String nome;
    private String nif;
    private EnderecoPostal endPostal;
    private String tlf;
    private String email;
   

    public Freelancer(String nome, String nif, EnderecoPostal endPostal, String tlf, String email) {
        this.nome = nome;
        this.nif = nif;
        this.endPostal = endPostal;
        this.tlf = tlf;
        this.email = email;
        
    }

    public Freelancer() {
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public EnderecoPostal getEndPostal() {
        return endPostal;
    }

    public void setEndPostal(EnderecoPostal endPostal) {
        this.endPostal = endPostal;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
    }
    