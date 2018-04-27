package br.ufc.russas.model;

import java.time.LocalDate;

public class CriterioTrilha {
	
	private int idCriterioTrilha;
	private LocalDate dataCriacao;
	private String nome;
	
	public int getIdCriterioTrilha() {
		return idCriterioTrilha;
	}
	public void setIdCriterioTrilha(int idCriterioTrilha) {
		this.idCriterioTrilha = idCriterioTrilha;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
