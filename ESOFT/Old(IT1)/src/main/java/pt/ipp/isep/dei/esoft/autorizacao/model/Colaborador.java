/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.autorizacao.model;

/**
 *
 * @author User
 */
public class Colaborador {
	private String nome;
	private String funcao;
	private String contacTelefo;
	private String enderEmail;

	public Colaborador(String nome, String funcao, String contacTelefo, String enderEmail){
		if( (nome==null) || (funcao==null) || (contacTelefo==null) || (enderEmail==null) || (nome.isEmpty()) || (funcao.isEmpty()) || (contacTelefo.isEmpty()) || (enderEmail.isEmpty()) )
			throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");

		this.nome=nome;
		this.funcao=funcao;
		this.contacTelefo=contacTelefo;
		this.enderEmail=enderEmail;
	}
	String nome1=getNome();
	String email1=getEmai();
	String password1=geraPassword();

	private String getNome() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	private String getEmai() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	private String geraPassword() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}

