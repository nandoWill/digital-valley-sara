package br.ufc.russas.model;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
	private String nome;
	private String site;
	private ArrayList<Trilha> trilhas;
	private LocalDate dataEvento;
	private File informacoes;
	private Usuario coordenadorGeral;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Trilha> getTrilhas() {
		return trilhas;
	}
	public void setTrilhas(ArrayList<Trilha> trilhas) {
		this.trilhas = trilhas;
	}
	public LocalDate getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}
	public File getInformacoes() {
		return informacoes;
	}
	public void setInformacoes(File informacoes) {
		this.informacoes = informacoes;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public Usuario getCoordenadorGeral() {
		return coordenadorGeral;
	}
	public void setCoordenadorGeral(Usuario coordenadorGeral) {
		this.coordenadorGeral = coordenadorGeral;
	}
	
	
}
