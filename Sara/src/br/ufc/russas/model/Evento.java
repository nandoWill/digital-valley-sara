package br.ufc.russas.model;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
	private int ID;
	private int totalHoras;
	private String nome;
	private String descricao;
	private String local;
	private String sigla;
	private ArrayList<Evento> subAtividades;
	private ArrayList<Trilha> trilhas;
	private Evento pai;
	private LocalDate dataEvento;
	private Usuario coordenadorEvento;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getTotalHoras() {
		return totalHoras;
	}
	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
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
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public ArrayList<Evento> getSubAtividades() {
		return subAtividades;
	}
	public void setSubAtividades(ArrayList<Evento> subAtividades) {
		this.subAtividades = subAtividades;
	}
	public ArrayList<Trilha> getTrilhas() {
		return trilhas;
	}
	public void setTrilhas(ArrayList<Trilha> trilhas) {
		this.trilhas = trilhas;
	}
	public Evento getPai() {
		return pai;
	}
	public void setPai(Evento pai) {
		this.pai = pai;
	}
	public LocalDate getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}
	public Usuario getCoordenadorEvento() {
		return coordenadorEvento;
	}
	public void setCoordenadorEvento(Usuario coordenadorEvento) {
		this.coordenadorEvento = coordenadorEvento;
	}
}
