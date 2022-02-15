/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipp.isep.dei.esoft.pot.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import pt.ipp.isep.dei.esoft.autorizacao.AutorizacaoFacade;

/**
 *
 * 
 */
public class RegistoAreasAtividade
{
    private String m_strCodigo;
    private String m_strDescricaoBreve;
    private String m_strDescricaoDetalhada;
    private final Set<AreaAtividade> m_lstAreas;

    public RegistoAreasAtividade(String strCodigo, String strDescricaoBreve, String strDescricaoDetalhada){
	if((strCodigo==null) || (strDescricaoBreve==null) || (strDescricaoDetalhada==null) || (strCodigo.isEmpty()) || (strDescricaoBreve.isEmpty()) || (strDescricaoDetalhada.isEmpty()))
		throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
	this.m_strCodigo=strCodigo;
	this.m_strDescricaoBreve=strDescricaoBreve;
	this.m_strDescricaoDetalhada=strDescricaoDetalhada;
	this.m_lstAreas=new HashSet<>();
}
public List<AreaAtividade> getAreaAtividade() {
	List<AreaAtividade> lc=new ArrayList<>();
	lc.addAll(this.m_lstAreas);
	return lc;
}
}
