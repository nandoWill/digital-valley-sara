package br.com.n2s.sara.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
	private int idEvento;
	private String coordenador;
	private int idEventoPai;
	private String nome;
	private String descricao;
	private String site;
	private String localizacao;
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	
	
	
	/* Isso não vai existir*/        
    private ArrayList<Trilha> trilhas;

    public ArrayList<Trilha> getTrilhas() {
        return trilhas;
    }

    public void setTrilhas(ArrayList<Trilha> trilhas) {
        this.trilhas = trilhas;
    }

    public Evento(int idEvento, String nome, String descricao, String localizacao, ArrayList<Trilha> trilhas, String cpfCoord) {
        this.idEvento = idEvento;
        this.nome = nome;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.dataInicial = LocalDate.now().plusMonths(2);
        this.trilhas = trilhas;
        this.coordenador = cpfCoord;
    }
    
    public Evento() {}

/*Até aqui nada vai existir*/
    
    
	
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getCoordenadorEvento() {
		return coordenador;
	}
	public void setCoordenadorEvento(String coordenadorEvento) {
		this.coordenador = coordenadorEvento;
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
}
