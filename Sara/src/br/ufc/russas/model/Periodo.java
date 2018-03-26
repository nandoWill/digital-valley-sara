package br.ufc.russas.model;

import java.time.LocalDate;

public class Periodo {
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	private String descricao;
	
	public Periodo() {
		this.dataInicial = LocalDate.of(0, 0, 0);
		this.dataFinal = LocalDate.of(0, 0, 0);
		this.descricao = "";
	}
	
	public Periodo(LocalDate dataInicial, LocalDate dataFinal, String descricao) {
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.descricao = descricao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
