package br.ufc.russas.model;

import java.time.LocalDate;

/**
 *
 * @author Hugo
 */
public class Periodo {
	private int idPeriodo;
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	private String descricao;
	
    /**
     *
     * @return
     */
    public int getIdPeriodo() {
		return idPeriodo;
	}

    /**
     *
     * @param idPeriodo
     */
    public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

    /**
     *
     * @return
     */
    public LocalDate getDataInicial() {
		return dataInicial;
	}

    /**
     *
     * @param dataInicial
     */
    public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

    /**
     *
     * @return
     */
    public LocalDate getDataFinal() {
		return dataFinal;
	}

    /**
     *
     * @param dataFinal
     */
    public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
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
}
