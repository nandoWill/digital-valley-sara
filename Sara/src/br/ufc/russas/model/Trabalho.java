package br.ufc.russas.model;

import java.io.File;

/**
 *
 * @author Hugo
 */
public class Trabalho {
	
	private int idTrabalho;
	private String titulo;
	private String palavrasChaves;
	private String resumo;
	private StatusTrabalho status;
	private File manuscrito;
	private File versaoFinal;
	private int idTrilha;
	
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

    /**
     *
     * @return
     */
    public String getTitulo() {
		return titulo;
	}

    /**
     *
     * @param titulo
     */
    public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

    /**
     *
     * @return
     */
    public String getPalavrasChaves() {
		return palavrasChaves;
	}

    /**
     *
     * @param palavrasChaves
     */
    public void setPalavrasChaves(String palavrasChaves) {
		this.palavrasChaves = palavrasChaves;
	}

    /**
     *
     * @return
     */
    public String getResumo() {
		return resumo;
	}

    /**
     *
     * @param resumo
     */
    public void setResumo(String resumo) {
		this.resumo = resumo;
	}

    /**
     *
     * @return
     */
    public StatusTrabalho getStatus() {
		return status;
	}

    /**
     *
     * @param status
     */
    public void setStatus(StatusTrabalho status) {
		this.status = status;
	}

    /**
     *
     * @return
     */
    public File getManuscrito() {
		return manuscrito;
	}

    /**
     *
     * @param manuscrito
     */
    public void setManuscrito(File manuscrito) {
		this.manuscrito = manuscrito;
	}

    /**
     *
     * @return
     */
    public File getVersaoFinal() {
		return versaoFinal;
	}

    /**
     *
     * @param versaoFinal
     */
    public void setVersaoFinal(File versaoFinal) {
		this.versaoFinal = versaoFinal;
	}

    /**
     *
     * @return
     */
    public int getIdTrilha() {
		return idTrilha;
	}

    /**
     *
     * @param idTrilha
     */
    public void setIdTrilha(int idTrilha) {
		this.idTrilha = idTrilha;
	}
	
	
    
}
