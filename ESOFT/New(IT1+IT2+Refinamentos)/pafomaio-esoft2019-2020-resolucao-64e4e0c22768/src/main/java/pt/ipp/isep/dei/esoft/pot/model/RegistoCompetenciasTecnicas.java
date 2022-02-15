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
public class RegistoCompetenciasTecnicas
{
    private String m_strCod;
    private String m_strDsBreve;
    private String m_strDsDet;
    private String m_strAtCod;
    private final Set<CompetenciaTecnica> m_lstCompetencias;
    private Plataforma m_oPlataforma

    public RegistoAreasAtividade(String strCod, String strDsBreve, String strDsDet, String strAtCod){
	if((strCod==null) || (strDsBreve==null) || (strDsDet==null) || (strAtCod==null) || (strCod.isEmpty()) || (strDsBreve.isEmpty()) || (strDsDet.isEmpty()) || (strAtCod.isEmpty()))
		throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
	this.m_strCod=strCod;
	this.m_strDsBreve=strDsBreve;
	this.m_strDsDet=strDsDet;
 	this.m_strAtCod=strAtCod;
	this.m_lstCompetencias=new HashSet<>();
}
private boolean addCompetencia(CompetenciaTecnica oCt)
return m_lstCompetencias.add(oCt);
}
public boolean validaCompetencia(CompetenciaTecnica oCt)
boolean bRet=true;

return bRet;
}
}
