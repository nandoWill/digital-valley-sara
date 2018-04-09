package br.ufc.russas.model;

import java.util.ArrayList;

public class Trabalho {
	private String nome;
	private ArrayList<Usuario> autores;
	private ArrayList<String> observacoes;
	private String resumo;
	private StatusTrabalho status;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Usuario> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<Usuario> autores) {
		this.autores = autores;
	}
	public ArrayList<String> getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(ArrayList<String> observacoes) {
		this.observacoes = observacoes;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public StatusTrabalho getStatus() {
		return status;
	}
	public void setStatus(StatusTrabalho status) {
		this.status = status;
	}
	
	
}
