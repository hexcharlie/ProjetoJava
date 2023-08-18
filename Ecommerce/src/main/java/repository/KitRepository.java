package repository;
import java.util.ArrayList;
import java.util.Scanner;

import model.Produto;
import repository.interfaces.incomming.IKitUseCase;
import repository.interfaces.outgoing.IKitPersistence;
import service.CarrinhoService;
import model.Kit;

public class KitRepository implements IKitPersistence, IKitUseCase {
	
	public static CarrinhoService carrinho = new CarrinhoService();
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private ArrayList<Kit> kit = new ArrayList<Kit>();
	private ArrayList<Kit> kit2 = new ArrayList<Kit>();
	private ArrayList<Kit> kit3 = new ArrayList<Kit>();	
	
	@Override
    public ArrayList<Produto> criaKits() {

		kit.add(new Kit(1, "Caderno Encadernado com Pelúcia", 67.40, 2, ""));
		kit.add(new Kit(2, "Estojo Pinguim", 35.40, 1, ""));
		produtos.add(new Produto(1, "Kit 01", 100.89, kit));
		kit2.add(new Kit(4, "Pelúcia de Gatinho", 35.40, 1, ""));
		kit2.add(new Kit(5, "Canequinha Rosa", 23.50, 2, ""));
		kit2.add(new Kit(6, "Capinha de Celular", 25.40, 1, ""));
		produtos.add(new Produto(2, "Kit 02", 98.90, kit2));
		kit3.add(new Kit(7, "Almofada Macia Algodão Doce", 105.40, 4, ""));
		kit3.add(new Kit(8, "Roupa de Cama Lhama Quadrada", 235.40, 1, ""));
		produtos.add(new Produto(3, "Kit 03", 360.90, kit3));
//		fim estoque
	return produtos;
    }
    
	@Override
    public ArrayList<Produto> mostraKits() {
    	Scanner leia = new Scanner(System.in);
    	int menu = 2;
    	System.out.println("\n🎁🎁🎁🎁🎁🎁 Kits disponíveis!! 🎁🎁🎁🎁🎁🎁\n");
    		produtos.forEach(prd -> {
    	    System.out.println(prd.getID() + "- " + prd.getNome() + " " + "R$" + prd.getPreco());	
    		if(!prd.getItens().isEmpty()) {
    			System.out.println("\n 1 - Detalhar kit\n 2 - Prosseguir");	
    			int choice = leia.nextInt();
    			if(choice == 1) {
    			detalhaKit(prd, choice);	
    			}
    		} 
        	});
    		return carrinho.addCarrinho(produtos,menu);
	    }
	
	@Override
    public String detalhaKit(Produto produto, int choice) {
    		produto.getItens().forEach(descr -> {
			System.out.println("Item especificado: " + descr.getNome());
			System.out.println("Quantidade de fofofura no seu kit: " + descr.getQuantidade());
    	});
    	choice = 2;	
    	return "Kit especificado";
    }
	
	@Override
    public ArrayList<Produto> addKit(ArrayList<Kit> kit, int itens) {
    	Kit itemKit = new Kit();
    	ArrayList<Kit> produto = new ArrayList<Kit>();
    	for(int i = 0; i <= itens; i++) {
    		itemKit.setID(kit.get(i).getID());
    		itemKit.setNome(kit.get(i).getNome());	
    		itemKit.setPreco(kit.get(i).getPreco());
    		itemKit.setTema(kit.get(i).getTema());
    		itemKit.setQuantidade(kit.size());	
        	produto.add(itemKit);
    	}
    	
    	produtos.add(new Produto(3, "Kit 03", 360.90, produto));
        return produtos;
    }
	
	@Override
    public String apagaKit(Integer id) {
    	produtos.removeIf(x -> x.getID() == (id));
        return "Kit apagado";
    }
	
	@Override
    public String apagaItemKit(Integer id, Produto kit) {
    	kit.getItens().removeIf(x -> x.getID() == (id));
    	return "Item do kit " + kit.getNome() + " foi removido!";
    }
	
	@Override
    public ArrayList<Kit> adionaItemKit(Kit itemKit, ArrayList<Kit> arrKit) {
    	arrKit.add(itemKit);
    	return arrKit;
    }

}
