package br.ufc.russas.model;

/**
 *
 * @author Hugo
 */
public class Usuario {
	
	private String cpf;
	private String nome;
	private String sobrenome;
	private String email;
	private NivelUsuario tipo;
	
    /**
     *
     * @return
     */
    public String getCpf() {
		return cpf;
	}

    /**
     *
     * @param cpf
     */
    public void setCpf(String cpf) {
		this.cpf = cpf;
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
    public String getSobrenome() {
		return sobrenome;
	}

    /**
     *
     * @param sobrenome
     */
    public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

    /**
     *
     * @return
     */
    public String getEmail() {
		return email;
	}

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
		this.email = email;
	}

    /**
     *
     * @return
     */
    public NivelUsuario getTipo() {
		return tipo;
	}

    /**
     *
     * @param tipo
     */
    public void setTipo(NivelUsuario tipo) {
		this.tipo = tipo;
	}
}
