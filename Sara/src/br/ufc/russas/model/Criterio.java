package br.ufc.russas.model;

public class Criterio {
	
	private int idCriterio;
	private String descricao;
	private int peso;
	private int idCriterioTrilha;
	
	public int getIdCriterio() {
		return idCriterio;
	}
	public void setIdCriterio(int idCriterio) {
		this.idCriterio = idCriterio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getIdCriterioTrilha() {
		return idCriterioTrilha;
	}
	public void setIdCriterioTrilha(int idCriterioTrilha) {
		this.idCriterioTrilha = idCriterioTrilha;
	}
	
}
