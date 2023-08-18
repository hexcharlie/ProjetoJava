package model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Produto {

	private int ID;
	private String nome;
	private double preco;
	private ArrayList<Kit> itens;

	public Produto(int ID, String nome, double preco, ArrayList<Kit> itens) {
		this.nome = nome;
		this.preco = preco;
		this.ID = ID;
		this.itens = itens;
	}

	public Produto(int id, String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.ID = id;
	}
	
	public Produto() {}

	public ArrayList<Kit> getItens() {
		return this.itens;
	}

	public void setItens(ArrayList<Kit> itens) {
		this.itens = itens;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

}