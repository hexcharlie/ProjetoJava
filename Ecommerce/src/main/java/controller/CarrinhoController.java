package controller;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import model.Produto;
import service.CarrinhoService;

public class CarrinhoController {

	CarrinhoService service = new CarrinhoService();
	
	public ArrayList<Produto> addCarrinho(ArrayList<Produto> produtos, int param) throws InterruptedException, ExecutionException {
		return service.addCarrinho(produtos, param);
	}
	
	public String checkout(ArrayList<Produto> compras) throws InterruptedException, ExecutionException {
		return service.checkout(compras);
	}
}
