/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;

import java.util.Objects;

/**
 *
 * @author paulomaio
 */
public class CompetenciaTecnica
{
    private String cod;
    private String dsBreve;
    private String dsDet;
    private AreaAtividade areasAtividade;
    
    public CompetenciaTecnica(String cod, String dsBreve, String dsDet, AreaAtividade area)
    {
        if ( (cod == null) || (dsBreve == null) || (dsDet == null) ||
                (area == null) || (cod.isEmpty())|| (dsBreve.isEmpty()) || (dsDet.isEmpty()))
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        
        this.cod = cod;
        this.dsBreve = dsBreve;
        this.dsDet = dsDet;
        areasAtividade = area;
    }
    
    
    public boolean hasId(String strId)
    {
        return this.cod.equalsIgnoreCase(strId);
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.cod);
        return hash;
    }
    
    @Override
    public boolean equals(Object o) {
        // Inspirado em https://www.sitepoint.com/implement-javas-equals-method-correctly/
        
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        // field comparison
        CompetenciaTecnica obj = (CompetenciaTecnica) o;
        return (Objects.equals(cod, obj.cod));
    }
    
    @Override
    public String toString()
    {
        return String.format("%s - %s - %s  - Área Atividade: %s", this.cod, this.dsBreve, this.dsDet, this.areasAtividade.toString());
    }
    
}
