package br.com.n2s.sara.model;

import java.time.LocalDate;

public class Trilha {
	private int idTrilha;
	private String nome;
	private String descricao;
	private String coordenador;
	private int idEvento;
	
	
    //Isso não vai existir tambem
    
    LocalDate periodo;

    public LocalDate getPeriodo() {
        return periodo;
    }

    public void setPeriodo(LocalDate periodo) {
        this.periodo = periodo;
    }

    public Trilha(String nome, int idTrilha, String info, String cpfCoord) {
        this.nome = nome;
        this.idTrilha = idTrilha;
        this.descricao = info;
        this.periodo = LocalDate.now().plusMonths(2);
        this.coordenador = cpfCoord;
    }

    /* ATE AQUI */
	
	
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
	public String getCoordenadorTrilha() {
		return coordenador;
	}
	public void setCoordenadorTrilha(String coordenador) {
		this.coordenador = coordenador;
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
}
