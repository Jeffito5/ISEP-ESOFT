/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.controller;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import pt.ipp.isep.dei.esoft.pot.model.Colaborador;
import pt.ipp.isep.dei.esoft.pot.model.Organizacao;
import pt.ipp.isep.dei.esoft.pot.model.Plataforma;

/**
 *
 * @author User
 */
public class DefinirColaboradorController {
	
	private SessaoColaborador sessaoColaborador;
	private AppAplicacaoPot appAplicacaoPOT;
	private AplicacaoPot aplicacaoPOT;
	private Plataforma plataforma;
	private Colaborador colaborador;
	private Organizacao organizacao;

	public void novoColaborador(String nome, String funcao, String contacTelefo, String enderEmail) throws Exception{
		try{
			this.colaborador=this.organizacao.novoColaborador( nome, funcao, contacTelefo, enderEmail);
			if (!this.organizacao.validaColaborador(colaborador)){
			throw new Exception("Colaborador inválida" );
			}
		}
		catch (Exception e) {
			throw e;
		}
}

	public void registaColaborador() throws Exception {
		try{
			this.organizacao.registaColaborador(this.colaborador);
		}
		catch (Exception e) {
			throw e;
		}
	}
}

