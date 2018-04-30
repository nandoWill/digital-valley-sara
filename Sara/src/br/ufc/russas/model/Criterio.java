package br.ufc.russas.model;

/**
 *
 * @author Hugo
 */
public class Criterio {
	
	private int idCriterio;
	private String descricao;
	private int peso;
	private int idCriterioTrilha;
	
    /**
     *
     * @return
     */
    public int getIdCriterio() {
		return idCriterio;
	}

    /**
     *
     * @param idCriterio
     */
    public void setIdCriterio(int idCriterio) {
		this.idCriterio = idCriterio;
	}

    /**
     *
     * @return
     */
    public String getDescricao() {
		return descricao;
	}

    /**
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

    /**
     *
     * @return
     */
    public int getPeso() {
		return peso;
	}

    /**
     *
     * @param peso
     */
    public void setPeso(int peso) {
		this.peso = peso;
	}

    /**
     *
     * @return
     */
    public int getIdCriterioTrilha() {
		return idCriterioTrilha;
	}

    /**
     *
     * @param idCriterioTrilha
     */
    public void setIdCriterioTrilha(int idCriterioTrilha) {
		this.idCriterioTrilha = idCriterioTrilha;
	}
	
}
