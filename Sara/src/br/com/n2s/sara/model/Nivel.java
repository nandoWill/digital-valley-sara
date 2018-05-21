package br.ufc.russas.model;

/**
 *
 * @author Hugo
 */
public class Nivel {
	
	private int idNivel;
	private String descricao;
	private int peso;
	private int idCriterio;
	
    /**
     *
     * @return
     */
    public int getIdNivel() {
		return idNivel;
	}

    /**
     *
     * @param idNivel
     */
    public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

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
	
}
