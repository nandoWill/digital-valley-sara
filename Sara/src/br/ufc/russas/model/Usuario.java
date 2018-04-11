package br.ufc.russas.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
	private String cpf;
	private String nome;
	private String sobrenome;
	private String email;
	private LocalDate dataNasc;
	private String telefone;
	private String endereco;
	private NivelUsuario tipo;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public NivelUsuario getTipo() {
		return tipo;
	}
	public void setTipo(NivelUsuario tipo) {
		this.tipo = tipo;
	} 
}
