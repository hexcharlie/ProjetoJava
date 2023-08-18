package repository.interfaces.incomming;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import model.Produto;

public interface IProdutoUseCase {
	
	ArrayList<Produto> mostraProdutos() throws InterruptedException, ExecutionException;
	Produto buscaPorId(int id);
	

}
