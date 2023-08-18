package repository.interfaces.outgoing;

import java.util.ArrayList;

import model.Produto;

public interface IProdutoPersistence {
	ArrayList<Produto> criaProdutos();
	Produto guardaProduto(Produto p);
	String apagaProduto(Integer id);
	Produto atualizaProduto(Produto prod);
}
