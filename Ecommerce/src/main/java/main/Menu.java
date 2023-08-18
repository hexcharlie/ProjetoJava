package main;
import java.util.Scanner;

import controller.ClienteController;
import controller.KitController;
import controller.ProdutoController;

public class Menu {
	
	public static ProdutoController produto = new ProdutoController();
	public static KitController kit = new KitController();
	public static ClienteController cadastro = new ClienteController();
	
	int opcao;
	Scanner leia = new Scanner(System.in);
	
	public void showMenu(){
		System.out.println("\n☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("                                                     ");
		System.out.println("             Charlotte's Virtual Store               ");
		System.out.println("                                                     ");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("                                                     ");
		System.out.println("            1 - Produtos    🌟                        ");
		System.out.println("            2 - Kits        🎁                        ");
		System.out.println("            3 - Cadastre-se 📝                        ");
		System.out.println("            4 - Sobre nós   🌈                        ");
		System.out.println("            5 - Sair        🚪                        ");
		System.out.println("                                                     ");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1: 
			produto.criaProdutos();
			produto.mostraProdutos();
			break;
		case 2: 
			kit.criaKits();
			kit.mostraKits();
			break;
		case 3:
			cadastro.novoCadastro();
		case 4: 
			System.out.println("\n❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️\n");
			System.out.println("\nUm projeto java feito para praticar as funcionalidades.\n");
			System.out.println("                                                                  /\\_/\\");
			System.out.println(" https://github.com/hexcharlie/                                   (•.•)");
			System.out.println(" https://www.linkedin.com/in/luis-henrique-ferreira-649623128/    (___)~");
			System.out.println("\n❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️\n");
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("\nOpção Inválida!\n");
			break;
			
	}
	

	}
}
