package model;

import lombok.Data;

@Data
public class Kit extends Produto {

	private int quantidade;
	private String tema;

	public Kit(int ID, String nome, double preco, int quantidade, String tema) {
		super(ID, nome, preco);
		this.quantidade = quantidade;
		this.tema = tema;
	}

	public Kit() {}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
}
