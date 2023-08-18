package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import model.Kit;
import model.Produto;
import service.KitService;

public class KitController {
	
	KitService service = new KitService();;
	
	public ArrayList<Produto> criaKits() {
		return service.criaKits();
	}
	public ArrayList<Produto> salvaKits(ArrayList<Kit> kit, int itens) {
        return service.salvaKits(kit, itens);
    }

    public ArrayList<Produto> mostraKits() {
        return service.mostraKits();
    }

    public String apagaProduto(int id) {
        service.apagaKit(id);
        return "Produto removido" + id;
    }
    
    public String apagaItemKit(int id, Kit kit) {
    	service.apagaItemKit(id, kit);
    	return "Item removido do kit";
    }
    
    public ArrayList<Kit> addItemKit(Kit itemKit, ArrayList<Kit> arrKit) {
    	return service.addItemKit(itemKit,arrKit );
    	
    }
    
    public String apagaKit(int id) {
    	return service.apagaKit(id);
    }


}
