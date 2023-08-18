package repository.interfaces.incomming;

import java.util.ArrayList;

import model.Produto;

public interface IKitUseCase {

	ArrayList<Produto> mostraKits();
	String detalhaKit(Produto produto, int choice);
	
}
