package br.ufc.russas.model;

import java.util.ArrayList;

public class Trabalho {
	private String nome;
	private Autor autorPrincipal;
	private ArrayList<Autor> autorSecundario;
	private ArrayList<String> observacoes;
	private String resumo;
	private statusTrabalho status;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Autor getAutorPrincipal() {
		return autorPrincipal;
	}
	public void setAutorPrincipal(Autor autorPrincipal) {
		this.autorPrincipal = autorPrincipal;
	}
	public ArrayList<Autor> getAutorSecundario() {
		return autorSecundario;
	}
	public void setAutorSecundario(ArrayList<Autor> autorSecundario) {
		this.autorSecundario = autorSecundario;
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
	public statusTrabalho getStatus() {
		return status;
	}
	public void setStatus(statusTrabalho status) {
		this.status = status;
	}
	
	
}
