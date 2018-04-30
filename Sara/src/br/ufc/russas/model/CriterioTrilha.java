package br.ufc.russas.model;

import java.time.LocalDate;

/**
 *
 * @author Hugo
 */
public class CriterioTrilha {
	
	private int idCriterioTrilha;
	private LocalDate dataCriacao;
	private String nome;
	
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

    /**
     *
     * @return
     */
    public LocalDate getDataCriacao() {
		return dataCriacao;
	}

    /**
     *
     * @param dataCriacao
     */
    public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
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
	
	
	
}
