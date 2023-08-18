package repository;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;
import model.Produto;
import repository.interfaces.incomming.IProdutoUseCase;
import repository.interfaces.outgoing.IProdutoPersistence;
import service.CarrinhoService;

@Repository
public class ProdutoRepository implements IProdutoPersistence, IProdutoUseCase {
	public static ArrayList<Produto> produtos = new ArrayList<>();
	public static CarrinhoService carrinho = new CarrinhoService();
	int menu = 1;
	
	@Override
	public ArrayList<Produto> criaProdutos() {
		
	//  inicio estoque
		produtos.add(new Produto(1, "Pelúcia de gatinho", 35.40, null));
		produtos.add(new Produto(2, "Canequinha Rosa", 23.50, null));
		produtos.add(new Produto(3, "Caderno Encadernado com Pelúcia", 67.40, null));
		produtos.add(new Produto(4, "Capinha de Celular", 25.40, null));
		produtos.add(new Produto(5, "Estojo Pinguim", 35.40, null));
		produtos.add(new Produto(6, "Almofada Macia Algodão Doce", 105.40, null));
		produtos.add(new Produto(7, "Roupa de Cama Lhama Quadrada", 235.40, null));
	//  fim do estoque
		
		return produtos;
		
}
	@Override	
    public ArrayList<Produto> mostraProdutos() throws InterruptedException, ExecutionException {
		System.out.println("\n❤️❤️❤️❤️❤️❤️❤️ Produtos disponíveis!! ❤️❤️❤️❤️❤️❤️❤️\n");
		produtos.forEach(itens -> {
		System.out.println(itens.getID() + ("- ") + itens.getNome() + " " + "R$" + itens.getPreco());
		System.out.println("\n✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨\n");

		});
		return carrinho.addCarrinho(produtos, menu);
    }
	
	@Override	
    public Produto buscaPorId(int id){
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getID() == (id)) {
                return produtos.get(i);
            }
        }
        return null;
    }
	
	@Override
    public Produto guardaProduto(Produto p) {
    	Produto prod = new Produto();
    	prod.setID(p.getID());
        prod.setNome(p.getNome());
        prod.setPreco(p.getPreco());
        produtos.add(prod);
        return prod;
    }
	
	@Override
    public String apagaProduto(Integer id) {
    	produtos.removeIf(x -> x.getID() == (id));
        return null;
    }
	
	@Override
    public Produto atualizaProduto(Produto prod) {
        int idx = 0;
        int id = 0;
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getID() == (prod.getID())) {
                id = prod.getID();
                idx = i;
                break;
            }
        }
        
        Produto novoProduto = new Produto();
        novoProduto.setID(id);
        novoProduto.setNome(prod.getNome());
        novoProduto.setItens(prod.getItens());
        novoProduto.setPreco(prod.getPreco());
        produtos.set(idx, prod);
        return novoProduto;
       
    }
}
