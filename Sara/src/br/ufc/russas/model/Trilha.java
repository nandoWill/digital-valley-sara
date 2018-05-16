package br.com.n2s.sara.model;

import java.util.ArrayList;

public class Trilha {
	
	private int idTrilha;
	private String nome;
	private String descricao;
	private Usuario coordenador;
	private Evento evento;
	private CriterioTrilha criterioTrilha;
	private ArrayList<Periodo> periodos;
	private ArrayList<Usuario> avaliadores;
	
	public Trilha() {
		
	}
	
	public Trilha(String nome, int id, String descricao, String cpf) {
		
	}
	
	public int getIdTrilha() {
		return idTrilha;
	}
	public void setIdTrilha(int idTrilha) {
		this.idTrilha = idTrilha;
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
	public Usuario getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(Usuario coordenador) {
		this.coordenador = coordenador;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public CriterioTrilha getCriterioTrilha() {
		return criterioTrilha;
	}
	public void setCriterioTrilha(CriterioTrilha criterioTrilha) {
		this.criterioTrilha = criterioTrilha;
	}
	public ArrayList<Periodo> getPeriodos() {
		return periodos;
	}
	public void setPeriodos(ArrayList<Periodo> periodos) {
		this.periodos = periodos;
	}
	public ArrayList<Usuario> getAvaliadores() {
		return avaliadores;
	}
	public void setAvaliadores(ArrayList<Usuario> avaliadores) {
		this.avaliadores = avaliadores;
	}
	
	
}