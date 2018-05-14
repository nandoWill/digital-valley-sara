package br.com.n2s.sara.model;

import java.time.LocalDate;

public class Periodo {
	
	private int idPeriodo;
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	private DescricaoPeriodo descricao;
	
	public int getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	public DescricaoPeriodo getDescricao() {
		return descricao;
	}
	public void setDescricao(DescricaoPeriodo descricao) {
		this.descricao = descricao;
	}
}
