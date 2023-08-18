package service;


import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import model.Produto;
import repository.ProdutoRepository;

public class ProdutoService {
	
    public static ProdutoRepository repository = new ProdutoRepository();
	
	public ArrayList<Produto> criaProdutos() {
		return repository.criaProdutos();
	}
	public Produto guardaProduto(Produto produto) {
        return repository.guardaProduto(produto);
    }

    public ArrayList<Produto> mostraProdutos() {
        try {
			return repository.mostraProdutos();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    public Produto buscaPorId(int id) {
        return repository.buscaPorId(id);
    }

    public String apagaProduto(int id) {
        repository.apagaProduto(id);
        return "Produto removido " + id;
    }

    public Produto atualizaProduto(Produto product) {
       return repository.atualizaProduto(product);
    }

}
