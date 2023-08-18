package controller;


import java.util.ArrayList;

import model.Produto;
import service.ProdutoService;

public class ProdutoController {
	
    ProdutoService service = new ProdutoService();
	
	public ArrayList<Produto> criaProdutos() {
		return service.criaProdutos();
	}
	
    public ArrayList<Produto> mostraProdutos() {
        return service.mostraProdutos();
    }
    
    public Produto procuraProdutoPorID(int id) {
        return service.buscaPorId(id);
    }

    public Produto atualizaProduto(Produto produto) {
        return service.atualizaProduto(produto);
    }

    public String apagaProduto(int id) {
        return service.apagaProduto(id);
    }
    
    public Produto guardaProduto(Produto produto) {
    	return service.guardaProduto(produto);
    }
    
    

}
