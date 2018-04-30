package br.ufc.russas.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Hugo
 */
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
	
    /**
     *
     * @return
     */
    public int getIdEvento() {
		return idEvento;
	}

    /**
     *
     * @param idEvento
     */
    public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

    /**
     *
     * @return
     */
    public String getCoordenador() {
		return coordenador;
	}

    /**
     *
     * @param coordenador
     */
    public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

    /**
     *
     * @return
     */
    public int getIdEventoPai() {
		return idEventoPai;
	}

    /**
     *
     * @param idEventoPai
     */
    public void setIdEventoPai(int idEventoPai) {
		this.idEventoPai = idEventoPai;
	}

    /**
     *
     * @return
     */
    public String getNome() {
		return nome;
	}

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
		this.nome = nome;
	}

    /**
     *
     * @return
     */
    public String getDescricao() {
		return descricao;
	}

    /**
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

    /**
     *
     * @return
     */
    public String getSite() {
		return site;
	}

    /**
     *
     * @param site
     */
    public void setSite(String site) {
		this.site = site;
	}

    /**
     *
     * @return
     */
    public String getLocalizacao() {
		return localizacao;
	}

    /**
     *
     * @param localizacao
     */
    public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

    /**
     *
     * @return
     */
    public LocalDate getDataInicial() {
		return dataInicial;
	}

    /**
     *
     * @param dataInicial
     */
    public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

    /**
     *
     * @return
     */
    public LocalDate getDataFinal() {
		return dataFinal;
	}

    /**
     *
     * @param dataFinal
     */
    public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	
	
	
}
