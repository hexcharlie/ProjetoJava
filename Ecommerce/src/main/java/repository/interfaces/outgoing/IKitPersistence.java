package repository.interfaces.outgoing;

import java.util.ArrayList;

import model.Kit;
import model.Produto;

public interface IKitPersistence {
	
	ArrayList<Produto> criaKits();
	ArrayList<Produto> addKit(ArrayList<Kit> kit, int itens);
	ArrayList<Kit> adionaItemKit(Kit itemKit, ArrayList<Kit> arrKit);
	String apagaItemKit(Integer id, Produto kit);
	String apagaKit(Integer id);

}
