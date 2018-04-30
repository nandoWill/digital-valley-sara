package br.ufc.russas.model;

/**
 *
 * @author Hugo
 */
public class Submissao {
	
	private String idAutor;
	private int idTrabalho;
	
    /**
     *
     * @return
     */
    public String getIdAutor() {
		return idAutor;
	}

    /**
     *
     * @param idAutor
     */
    public void setIdAutor(String idAutor) {
		this.idAutor = idAutor;
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
