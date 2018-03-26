package br.ufc.russas.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	private String email;
	private LocalDate dataNasc;
	private ArrayList<String> interresses;
	private NivelUsuario tipo; 
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	public ArrayList<String> getInterresses() {
		return interresses;
	}
	public void setInterresses(ArrayList<String> interresses) {
		this.interresses = interresses;
	}
	public NivelUsuario getTipo() {
		return tipo;
	}
	public void setTipo(NivelUsuario tipo) {
		this.tipo = tipo;
	}
	
	
}
