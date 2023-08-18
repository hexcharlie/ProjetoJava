package service;

import java.util.ArrayList;
import model.Kit;
import model.Produto;
import repository.KitRepository;

public class KitService {
	
    KitRepository repository = new KitRepository();
	
	public ArrayList<Produto> criaKits() {
		return repository.criaKits();
	}
	public ArrayList<Produto> salvaKits(ArrayList<Kit> kit, int itens) {
        return repository.addKit(kit, itens);
    }

    public ArrayList<Produto> mostraKits() {
        return repository.mostraKits();
    }

    public String apagaProduto(int id) {
        repository.apagaKit(id);
        return "Produto removido" + id;
    }
    
    public String apagaItemKit(int id, Kit kit) {
    	repository.apagaItemKit(id, kit);
    	return "Item removido do kit";
    }
    
    public ArrayList<Kit> addItemKit(Kit itemKit, ArrayList<Kit> arrKit) {
    	repository.adionaItemKit(itemKit, arrKit);
    	return repository.adionaItemKit(itemKit, arrKit);
    }
    
    public String apagaKit(int id) {
    	return repository.apagaKit(id);
    }


}
