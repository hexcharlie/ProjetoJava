package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import controller.ClienteController;
import controller.KitController;
import controller.ProdutoController;
import helpers.Constants;
import model.Produto;

public class CarrinhoService {
	static CarrinhoService run = new CarrinhoService();
    public static ProdutoController produtoController = new ProdutoController();
    public static KitController kitController = new KitController();
    public static ClienteController clienteController = new ClienteController();
    static CarrinhoService obj = new CarrinhoService();
    
	ArrayList<Produto> compras = new ArrayList<>();
	Scanner leia = new Scanner(System.in);
	
	
    public ArrayList<Produto> addCarrinho(ArrayList<Produto> produtos, int opcaoMenu){
		System.out.println(Constants.PRODUTO_DESEJADO);
		int opcao = leia.nextInt();
		produtos.forEach(itens -> {
			if (itens.getID() == opcao) {
				compras.add(itens);
			}
		});
		addMaisItens(compras, opcaoMenu);
    	return compras;
    }
    
    public String addMaisItens(ArrayList<Produto> compras, int opcaoMenu){
		System.out.println(Constants.ESCOLHER_MAIS_PRODUTO);
		int escolha = leia.nextInt();
		if(opcaoMenu == 1) {
			switch (escolha) {
			case 1: 
				produtoController.mostraProdutos();
				break;
			case 2: 
				checkout(compras);
				break;
			} 		
		} else if(opcaoMenu == 2) {
			switch(escolha) {
			case 1:
				kitController.mostraKits();
				break;
			case 2:
				checkout(compras);
				break;
			}
			
		}
		return "Direcionado para checkout";
    }
    
    public String checkout(ArrayList<Produto> compras) {
		double total = 0;
		ArrayList<String> nome = new ArrayList<>();
		String nomes = " ";
		for (int i = 0; i < compras.size(); i++) {
			Produto produto = compras.get(i);
			total += produto.getPreco();
			nomes = produto.getNome();
			nome.add(nomes);
		}
		System.out.println(Constants.DETALHA_ITEM);
		Iterator<String> it = nome.iterator();
		while(it.hasNext()) {
			  System.out.println(it.next());
			}
		    System.out.println("Pedido realizado com sucesso\n\n\n\n");
            System.out.printf(Constants.TOTAL_COMPRA + "%.2f", total);
		return "Total calculado";
	}
    }

    	
   


