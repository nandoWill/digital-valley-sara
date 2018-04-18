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
	private int idTrilha;
	
	
    /*Isso não vai existir*/

    public Trabalho(String titulo) {
        this.titulo = titulo;
    }
    
    /* ATE AQUI */
	
	
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
	public int getIdTrilha() {
		return idTrilha;
	}
	public void setIdTrilha(int idTrilha) {
		this.idTrilha = idTrilha;
	}
}
