package br.ufc.russas.model;

import java.util.ArrayList;

public class Trabalho {
	private String nome;
	private Usuario autorPrincipal;
	private ArrayList<Usuario> autorSecundario;
	private ArrayList<String> observacoes;
	private String resumo;
	private StatusTrabalho status;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Usuario getAutorPrincipal() {
		return autorPrincipal;
	}
	public void setAutorPrincipal(Usuario autorPrincipal) {
		this.autorPrincipal = autorPrincipal;
	}
	public ArrayList<Usuario> getAutorSecundario() {
		return autorSecundario;
	}
	public void setAutorSecundario(ArrayList<Usuario> autorSecundario) {
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
	public StatusTrabalho getStatus() {
		return status;
	}
	public void setStatus(StatusTrabalho status) {
		this.status = status;
	}
	
	
}
