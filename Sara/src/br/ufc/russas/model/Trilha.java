package br.ufc.russas.model;

import java.util.ArrayList;

public class Trilha {
	private int idTrilha;
	private String nome;
	private String info;
	private String coordenadorTrilha;
	private int idEvento;
	
	public int getIdTrilha() {
		return idTrilha;
	}
	public void setIdTrilha(int idTrilha) {
		this.idTrilha = idTrilha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getCoordenadorTrilha() {
		return coordenadorTrilha;
	}
	public void setCoordenadorTrilha(String coordenadorTrilha) {
		this.coordenadorTrilha = coordenadorTrilha;
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
}

