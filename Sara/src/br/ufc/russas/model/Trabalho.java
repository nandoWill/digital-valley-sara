package br.com.n2s.sara.model;

import java.io.File;

public class Trabalho {
	
	private int idTrabalho;
	private String titulo;
	private String palavrasChaves;
	private String resumo;
	private StatusTrabalho status;
	private File manuscrito;
	private File versaoFinal;
	private Trilha trilha; // Trilha a qual o trabalho está associado
	
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
	public File getManuscrito() {
		return manuscrito;
	}
	public void setManuscrito(File manuscrito) {
		this.manuscrito = manuscrito;
	}
	public File getVersaoFinal() {
		return versaoFinal;
	}
	public void setVersaoFinal(File versaoFinal) {
		this.versaoFinal = versaoFinal;
	}
	public Trilha getTrilha() {
		return trilha;
	}
	public void setTrilha(Trilha trilha) {
		this.trilha = trilha;
	}
}