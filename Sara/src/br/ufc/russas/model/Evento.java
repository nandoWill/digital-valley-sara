package br.ufc.russas.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
	private int idEvento;
	private String coordenadorEvento;
	private int idEventoPai;
	private String nome;
	private String descricao;
	private String sigla;
	private String localizacao;
	private LocalDate dataEvento;
	private int totalHoras;
	
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getCoordenadorEvento() {
		return coordenadorEvento;
	}
	public void setCoordenadorEvento(String coordenadorEvento) {
		this.coordenadorEvento = coordenadorEvento;
	}
	public int getIdEventoPai() {
		return idEventoPai;
	}
	public void setIdEventoPai(int idEventoPai) {
		this.idEventoPai = idEventoPai;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public LocalDate getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}
	public int getTotalHoras() {
		return totalHoras;
	}
	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}
}
