package br.com.n2s.sara.model;

import java.io.File;

public class Trabalho {
	
	private int idTrabalho;
	private String titulo;
	private String palavrasChaves;
	private String resumo;
	private StatusTrabalho status;
	private Trilha trilha; // Trilha a qual o trabalho est� associado
	private Usuario autor;
	private String endereco;//Substitui versao final

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Usuario getAutor() {
		return autor;
	}
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	public int getIdTrabalho() {
		return idTrabalho;
	}
	public void setIdTrabalho(int idTrabalho) {
		this.idTrabalho = idTrabalho;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPalavrasChaves() {
		return palavrasChaves;
	}
	public void setPalavrasChaves(String palavrasChaves) {
		this.palavrasChaves = palavrasChaves;
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
	public Trilha getTrilha() {
		return trilha;
	}
	public void setTrilha(Trilha trilha) {
		this.trilha = trilha;
	}
}
