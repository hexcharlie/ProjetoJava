package model;

import java.util.UUID;

public class Cliente {
	private UUID id;
	private String nome;
	private String email;
	private String endereco;
	private String senha;

	public Cliente(UUID id,String nome, String email, String endereco, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.senha = senha;
	}
	
	public Cliente() {}
	
	public UUID getId(){
		return id;
	}
	
	public void setId(UUID uuid) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
