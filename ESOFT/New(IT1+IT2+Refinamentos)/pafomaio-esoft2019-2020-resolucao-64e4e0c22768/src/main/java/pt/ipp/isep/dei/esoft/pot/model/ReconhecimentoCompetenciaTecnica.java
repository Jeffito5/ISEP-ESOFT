
package pt.ipp.isep.dei.esoft.pot.model;


public class ReconhecimentoCompetenciaTecnica {
    private String data;
    private String grauProf;
    private CompetenciaTecnica ct;

    public ReconhecimentoCompetenciaTecnica(String data, String grauProf, CompetenciaTecnica ct) {
        this.data = data;
        this.grauProf = grauProf;
        this.ct = new CompetenciaTecnica(ct.getM_strId(), ct.getM_strDescricaoBreve(), ct.getM_strDescricaoDetalhada(), ct.getM_oAreaAtividade());
    }

    public ReconhecimentoCompetenciaTecnica() {
        
    }
    
    
}
