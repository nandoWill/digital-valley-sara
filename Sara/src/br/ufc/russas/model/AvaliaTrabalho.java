package br.ufc.russas.model;

/**
 *
 * @author Hugo
 */
public class AvaliaTrabalho {
	private String idAvaliador;
	private int idTrabalho;

    /**
     *
     * @return
     */
    public String getIdAvaliador() {
		return idAvaliador;
	}

    /**
     *
     * @param idAvaliador
     */
    public void setIdAvaliador(String idAvaliador) {
		this.idAvaliador = idAvaliador;
	}

    /**
     *
     * @return
     */
    public int getIdTrabalho() {
		return idTrabalho;
	}

    /**
     *
     * @param idTrabalho
     */
    public void setIdTrabalho(int idTrabalho) {
		this.idTrabalho = idTrabalho;
	}
}
