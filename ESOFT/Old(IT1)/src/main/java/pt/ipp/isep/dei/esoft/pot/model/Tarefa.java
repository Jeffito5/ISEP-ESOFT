/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.dei.esoft.pot.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiago
 */
public class Tarefa {
    private String descricao;
	private String ID;
	public List<CompetenciaTecnica> compT = new ArrayList<>();
	public AreaAtividade area;

	public void create(String desc, String area) {
		throw new UnsupportedOperationException();
	}
}

