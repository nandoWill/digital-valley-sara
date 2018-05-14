package br.com.n2s.sara.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
	
	private int idEvento;
	private ArrayList<Usuario> coordenadores;
	private String nome;
	private String descricao;
	private String site;
	private String localizacao;
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	private ArrayList<Trilha> trilhas;
	
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	
	public ArrayList<Usuario> getCoordenadores() {
		return coordenadores;
	}
	public void setCoordenadores(ArrayList<Usuario> coordenadores) {
		this.coordenadores = coordenadores;
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
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	public ArrayList<Trilha> getTrilhas() {
		return trilhas;
	}
	public void setTrilhas(ArrayList<Trilha> trilhas) {
		this.trilhas = trilhas;
	}
	
}
