package br.ufc.russas.model;

import java.time.LocalDate;

/**
 *
 * @author Hugo
 */
public class Trilha {
	
	private int idTrilha;
	private String nome;
	private String descricao;
	private String coordenador;
	private int idEvento;
	private int idCriterioTrilha;
	
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

    /**
     *
     * @return
     */
    public String getNome() {
		return nome;
	}

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
		this.nome = nome;
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
    public String getCoordenador() {
		return coordenador;
	}

    /**
     *
     * @param coordenador
     */
    public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

    /**
     *
     * @return
     */
    public int getIdEvento() {
		return idEvento;
	}

    /**
     *
     * @param idEvento
     */
    public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
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
