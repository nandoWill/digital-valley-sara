package br.ufc.russas.model;

import java.util.ArrayList;

public class Trilha {
	private String nome;
	private Usuario coordenadorTrilha;
	private String infoTrilha;
	private ArrayList<Usuario> avaliadores;
	private ArrayList<Trabalho> submissoes;
	private ArrayList<Periodo> periodos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Usuario getCoordenadorTrilha() {
		return coordenadorTrilha;
	}
	public void setCoordenadorTrilha(Usuario coordenadorTrilha) {
		this.coordenadorTrilha = coordenadorTrilha;
	}
	public String getInfoTrilha() {
		return infoTrilha;
	}
	public void setInfoTrilha(String infoTrilha) {
		this.infoTrilha = infoTrilha;
	}
	public ArrayList<Usuario> getAvaliadores() {
		return avaliadores;
	}
	public void setAvaliadores(ArrayList<Usuario> avaliadores) {
		this.avaliadores = avaliadores;
	}
	public ArrayList<Trabalho> getSubmissoes() {
		return submissoes;
	}
	public void setSubmissoes(ArrayList<Trabalho> submissoes) {
		this.submissoes = submissoes;
	}
	public ArrayList<Periodo> getPeriodos() {
		return periodos;
	}
	public void setPeriodos(ArrayList<Periodo> periodos) {
		this.periodos = periodos;
	}
	
}

